package com.microsv.msa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/as")
public class ApparelController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAllApparels(){
        return "dfjkfhj";
    }
}
