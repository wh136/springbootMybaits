package com.citybrain.agenthub.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citybrain.agenthub.dao.UserMapper;

@RestController
public class TestController {
    @Resource
    UserMapper um;

    @GetMapping("/getdb")
    public List listUser() {
        return um.listUser();
    }
}