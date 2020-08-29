package com.oocl.epauserservice.intercepter;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeignIntercepter implements RequestInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

  @Override
  public void apply(RequestTemplate requestTemplate) {
    logger.info("------调用外部服务" + Thread.currentThread().getId());
  }
}