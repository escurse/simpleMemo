package com.escass.simplememo.controllers;

import com.escass.simplememo.entities.MemoEntity;
import com.escass.simplememo.services.MemoService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/memo")
public class MemoController {
    private final MemoService memoService;

    @Autowired
    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("memo/index");
        return modelAndView;
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String postIndex(MemoEntity memo) {
        JSONObject response = new JSONObject();
        boolean result = memoService.write(memo);
        response.put("result", result);
        return response.toString();
    }
}
