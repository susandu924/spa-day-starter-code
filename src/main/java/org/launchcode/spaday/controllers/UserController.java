package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

//  TO DO 2:  Using the Model to Render the Form¶
//In the UserController, modify the add method that displays the form so that it passes in an empty User object with:
//
//model.addAttribute(new User());
//This object will be accessible in the template, by name, as user.

//    Now that you’re passing in an empty User object, you may notice some redundant code in your processAddUserForm controller.
//    Remove the model attribute additions and update the user/add template to make use of the model fields (eg. user.username).



    @GetMapping("/add")
    public String displayAddUserForm() {
        return "user/add";
    }


//   TO DO 4: Now that you have your form set up, go back to UserController and add validation on form submission
//    by adding the @Valid annotation to the User parameter that is bound, along with an additional parameter: Errors errors.
//
//Warning
//Remember, you must put this parameter directly after the User parameter in the method definition for it to work properly.
//
//Within the processAddUserForm handler, check for errors configured by the validation annotation using errors.hasErrors(). If this returns true, return the user to the form
    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("user", user);
        model.addAttribute("verify", verify);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        if (user.getPassword().equals(verify)) {
           return "user/index";
        }
        else {
            model.addAttribute("error", "Passwords do not match");
            return "user/add";
        }

    }


}
