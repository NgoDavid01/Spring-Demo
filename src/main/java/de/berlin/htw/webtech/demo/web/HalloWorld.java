package de.berlin.htw.webtech.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HalloWorld {
    @GetMapping(path = "/greeting")
    public String greeting(@RequestParam(value = "name",required = false, defaultValue = "World" ) String name) {
        return  "Hello " + name;
    }
}
