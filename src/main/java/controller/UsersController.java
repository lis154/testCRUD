package controller;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

@Controller
public class UsersController {

    @GetMapping(value = "/")
    public ModelAndView allUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        return modelAndView;
    }

    @GetMapping (value = "/edit")
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editUsers");
        return  modelAndView;
    }


}
