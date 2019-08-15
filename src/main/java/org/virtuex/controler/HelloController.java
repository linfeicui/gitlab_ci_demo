package org.virtuex.controler;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/ping", method = {RequestMethod.GET})
    public String ping(){
        return "pong";
    }

}
