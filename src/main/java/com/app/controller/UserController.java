package com.app.controller;

import com.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.support.JstlUtils;

@Controller
public class UserController {

    @PostMapping("/submit")
    public String submitRecord(@ModelAttribute("user") User user, Model model)
        {
            System.out.println("First Name :"+user.getFirstName());
            System.out.println("Last Name :"+user.getLastName());
            System.out.println("Email :"+user.getEmail());

            model.addAttribute("message","submit success");
            model.addAttribute("user",user);

            return "success";
        }

	@GetMapping("/show")
	public String getRecord(Model model)
		{
            model.addAttribute("user",new User());
			return "signup-form";
		}

}
