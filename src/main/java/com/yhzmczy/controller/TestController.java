package com.yhzmczy.controller;

import com.yhzmczy.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(path = "/test",method = RequestMethod.POST)
    public @ResponseBody User getUser(@RequestBody User u){
        return u;
    }

}
