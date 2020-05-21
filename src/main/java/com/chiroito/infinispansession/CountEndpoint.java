package com.chiroito.infinispansession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class CountEndpoint {

    private final Counter counter;

    public CountEndpoint(Counter counter) {
        this.counter = counter;
    }

    @GetMapping("/count")
    public String count(){

        counter.countUp();
        return "counter=" + counter.getValue();
    }

    @GetMapping("/read")
    public String read(){

        return "counter=" + counter.getValue();
    }
}
