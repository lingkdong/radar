package com.radar.bottle.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过feign 调用另一台服务器 box-service
 * application.name + context-path
 */
@FeignClient(name = "box-service",path = "/boxsrv")
public interface BoxClient {
    @GetMapping("/test/hello")
     String callBox();
}
