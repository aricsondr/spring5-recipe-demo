package guru.springframework.spring5recipedemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        System.out.println("Teste de dev tools 1239");
        return "index";
    }
}
