package com.zeek.log.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweibo03 <liweibo03@kuaishou.com>
 * Created on 2021-02-07
 */
@RestController
public class HomeController {

    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request) {
        return "world";
    }
}
