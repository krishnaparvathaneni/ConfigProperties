
package com.ctl.demo;

import java.awt.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RefreshScope
@RestController
class WidgetController {
 
    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;
 
    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }


}
