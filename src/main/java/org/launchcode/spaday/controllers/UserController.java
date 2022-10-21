package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user,Errors errors, @NotBlank String verify) {
        model.addAttribute("user", user);
        model.addAttribute("verify", verify);

            if (!user.getPassword().equals(verify) || errors.hasErrors()) {
//
                model.addAttribute("errors", errors);
                model.addAttribute("error", "Passwords do not match");
                return "user/add";
            } else {

                return "user/index";
            }
        }
//    private void checkPassword(Model model, @ModelAttribute @Valid User user){
//        if (user.password).equals(user
//    }
    }
//        model.addAttribute("user", user);
//        model.addAttribute("verify", verify);
//        model.addAttribute("errors", errors);
//        if (!user.getPassword().equals(verify) || errors.hasErrors()) {
//
//            model.addAttribute("error", "Passwords do not match");
//            return "user/add";
//        }
//        else {
//            model.addAttribute("error", "Passwords do not match");
//            return "index";
//        }
//    }



