package com.lin.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sun
 * @datetime 2020/10/23 20:42
 */
@Controller
@RequestMapping("/v1/banner")
public class BannerController {
    // MVC SpringMVC
    // Controller Model View
    @GetMapping({"/test","/hello","111"})
    @ResponseBody
    public String test(){
        return "hello,sun";
    }
    @RequestMapping(value = {"/test","/hello","111"},
            method = {RequestMethod.GET,RequestMethod.POST})
    @GetMapping("/test2")
    public void test2(HttpServletResponse response) throws IOException {
        response.getWriter().write("hello,sun");
    }
}
