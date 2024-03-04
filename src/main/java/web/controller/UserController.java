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

    @RequestMapping(value = "/updateUser")
    public String updateUser(@RequestParam("id") int id, Model model) {
        model.addAttribute("id", id);
        User user = userService.getUser(id);
        model.addAttribute("user", user);

        return "user-info";
    }
}
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//model.addAttribute("user",userService.getUser(id));
//        return "/edit";
//    }
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user,@PathVariable("id") int id) {
//        userService.update(id, user);
//        return "redirect:/";
//    }
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @RequestParam("id") int id) {
//user.update(id, user);
//return "redirect:/";
//    }


