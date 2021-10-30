package dk.jt.basicspringlogin.basicspringlogin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(){

        return "index";
    }


    @PostMapping("/result")
    public String result(@RequestParam String username, @RequestParam String password, Model model){
        model.addAttribute("user", username);
        model.addAttribute("pass", password);


    return "result";

    }



    @GetMapping("/logout")
    public String logout(){

        return "logout";
    }

}
