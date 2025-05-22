package dnd.dnd_2025_hackaton.api.controller;

import dnd.dnd_2025_hackaton.api.spec.HelloApiSpec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApiSpec {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! 우리 팀 잘 해봅시다!!";
    }
}
