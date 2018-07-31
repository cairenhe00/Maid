package cn.cairenhe.controller;

import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevAuthController {
    @RequestMapping("/devauth.do")
    public String devAuth(@RequestParam(value = "signature",required = true) String signature){
        return "Hello world!";
    }
}
