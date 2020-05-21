package com.chiroito.infinispansession;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@SessionScope
@Component
public class Counter implements Serializable {

    private static final long serialVersionUID = 1L;

    private int value;

    public int getValue() {
        return value;
    }

    public void countUp(){
        this.value++;
    }
}
