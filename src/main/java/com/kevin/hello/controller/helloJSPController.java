package com.kevin.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kevin on 2017/9/24.
 */
@Controller
public class helloJSPController {

    @RequestMapping(value="/indexjsp",method = RequestMethod.GET)
    public ModelAndView indexView(){
        ModelAndView mv=new ModelAndView("/indexjsp");
        mv.addObject("hijsp","hello World JSP");
        return mv;
    }

}
