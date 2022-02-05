package hello.hellospring.controller;

import hello.hellospring.aop.TimeTraceAop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
    public String home() {
        log.info("This is home log");
        return "home";
    }
}
