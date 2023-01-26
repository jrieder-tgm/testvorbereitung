package com.example.testvorbereitung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/random")
    public int getRandom() {
        return (int)(Math.random() * 100);
    }
}
