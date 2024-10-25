package com.escass.simplememo.controllers;

import com.escass.simplememo.entities.MemoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/memo")
public class MemoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("memo/index");
        return modelAndView;
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String postIndex(MemoEntity memo) {
        System.out.println(memo.getWriter());
        System.out.println(memo.getContent());
        return "ㅋㅋㅋ";
    }
}
