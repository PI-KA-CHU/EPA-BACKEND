package com.oocl.epauserservice.controller;

import com.oocl.epauserservice.rpcService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

  @Autowired
  OrderService orderService;

  @GetMapping
  public String getUserInfo(){
    return orderService.getOrderInfo() + "user call";
  };
}
