package ru.vaszol.MyApp.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vas on 09.12.2015.
 */
@Controller
@RequestMapping("/myApp")
public class MyAppController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMyAppController(ModelMap model){
        return "Yes master";
    }
}
