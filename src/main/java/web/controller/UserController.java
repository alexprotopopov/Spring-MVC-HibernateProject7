package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.UserService;
import web.model.User;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String showAllUser(Model model) {
//        List<User> people = userService.listUsers();
        model.addAttribute("people", userService.listUsers());
        return "people";
    }

//    @GetMapping()
//    public String show(@RequestParam(value = "id", defaultValue = "5", required = false) int count, Model model) {
//        model.addAttribute("cars", userService.show(count));
//        return "cars";
//    }
}
