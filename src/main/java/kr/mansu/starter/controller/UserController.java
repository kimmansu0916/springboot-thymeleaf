package kr.mansu.starter.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller()
@RequestMapping("user")
public class UserController {
  
  @GetMapping(value="")
  public String test(Model model) {
    Map<String, Object> user = new HashMap<>();
    user.put("name", "test");
    user.put("age", 22);
    model.addAttribute("user", user);
    return "user/info";
  }

}
