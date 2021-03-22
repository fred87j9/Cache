package com.example.demo.Controller;

import com.example.demo.Cache;
import com.example.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class UserController {

    Cache cache = new Cache();
    User randomString = new User();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String page(@RequestParam String id) throws InterruptedException {

        if (!cache.has(id)) {
            cache.set(id,randomString.getDataSlow());

        }
        return (String) cache.get(id);
    }

}
