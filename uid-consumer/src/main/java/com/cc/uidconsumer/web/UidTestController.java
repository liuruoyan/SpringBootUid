package com.cc.uidconsumer.web;

import com.cc.uidconsumer.service.UidGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UidTestController {
    @Autowired
    private UidGenService uidGenService;

    @GetMapping("/testuid")
    public String test() {
        return String.valueOf( uidGenService.getUid() );
    }
}
