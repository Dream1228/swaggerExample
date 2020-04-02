package com.study.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lixiang
 * @version ：v1.0
 * @program ：spring-swagger2
 * @date ：2020/4/2 16:32
 * @description ：
 */
@RestController
@RequestMapping("/api")
public class SwaggerController {

    @GetMapping("/swagger")
    public String swagger() {
        return "Swagger接口";
    }


}
