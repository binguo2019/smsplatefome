package com.cmzz.web;

import com.cmzz.domain.ZzerrorListnum;

import com.cmzz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController
{
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public List<ZzerrorListnum> getBooks()
    {
        return userService.findAll();
    }


}
