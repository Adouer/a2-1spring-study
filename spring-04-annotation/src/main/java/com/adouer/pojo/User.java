package com.adouer.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("adouer")
    private String name;
    public String getName() {
        return name;
    }
}
