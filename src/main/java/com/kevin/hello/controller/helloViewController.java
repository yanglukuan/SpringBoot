package com.kevin.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lukuanpc on 2017/9/24.
 */
@Controller
public class helloViewController {

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public ModelAndView indexView(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("hi","hello World");
        return mv;
    }
}
