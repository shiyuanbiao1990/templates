package com.hiynn.springgradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/2 16:12
 * @Description:
 */
@RestController
public class SpringController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";//返回结果为字符串
    }
}
