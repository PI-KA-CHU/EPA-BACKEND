package com.oocl.epauserservice.rpcService;

import com.oocl.epauserservice.intercepter.FeignIntercepter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service", configuration = FeignIntercepter.class)
public interface OrderService {

  @GetMapping("/orders")
  public String getOrderInfo();
}
