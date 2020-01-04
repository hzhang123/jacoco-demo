package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CountController {

    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    @ResponseBody
    public boolean caseCount(@RequestBody Map<String, Integer> params) {
        if (params.get("count") > 0) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    @ResponseBody
    public boolean caseCount1(@RequestBody Map<String, Integer> params) {
        if (params.get("count") > 0) {
            return true;
        } else {
            return false;
        }
    }
}
