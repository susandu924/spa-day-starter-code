package org.launchcode.spaday.controllers;


import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;

@Controller
@RequestMapping("user")
public class UserController {

    private UserData userData = new UserData();

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }
//    the return of user/add is referring to the template file add that is inside of use, hence to get to it we need to go thru user/add

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
        if (user.getPassword().equals(verify)) {
            userData.add(user);
            model.addAttribute("users", this.userData.getAll());
            return "user/index";
        } else {
            model.addAttribute("error", "Make sure those passwords match!");
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            return "user/add";
        }
    }
    @GetMapping("{id}/details")
    public String getUserDetails(Model model, @PathVariable String id) {
        User user = this.userData.getById(id);
        if (user == null) {
            User fakeUser = new User();
            fakeUser.setUsername(id);
            fakeUser.setEmail("FAKE");
            model.addAttribute("user", fakeUser);
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            String formattedDate = formatter.format(user.getJoinDate());
            model.addAttribute("user", user);
            model.addAttribute("date", formattedDate);
        }
        return "user/details";
//
    }
}
