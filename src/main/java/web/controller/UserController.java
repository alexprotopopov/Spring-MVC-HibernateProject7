package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.UserService;
import web.model.User;

import java.util.List;


@Controller
@RequestMapping(value = "/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public String showAllUser(Model model) {
        model.addAttribute("people", userService.listUsers());
        return "people";
    }

    @GetMapping(value = "/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "user-info";
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
//    @GetMapping()
//    public String show(@RequestParam(value = "id", defaultValue = "5", required = false) int count, Model model) {
//        model.addAttribute("cars", userService.show(count));
//        return "cars";
//    }
}
