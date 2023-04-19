package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.dao.UserDao;

@Controller
  @RequestMapping("/users")
//@RequestMapping("/")
public class UserController {
    private UserDao userDao;


    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public String getAllUsers(Model model) {
     model.addAttribute("users",userDao.getAllUser());
        return "users";
    }
    @GetMapping("/{id}")
    public String getUserbyId(@PathVariable("id") int id,Model model){
        model.addAttribute("user",userDao.getUser(id));
        return "user";
    }
}
