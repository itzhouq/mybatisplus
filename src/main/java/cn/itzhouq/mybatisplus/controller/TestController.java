package cn.itzhouq.mybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: For test
 * @Author: itzhouq
 * @Date: 2020/7/13 23:40
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/demo")
    public String demo() {
        return "hello";
    }

}
