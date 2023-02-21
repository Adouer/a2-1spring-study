package com.adouer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {

    @Autowired
    @Qualifier("cat333")
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;
    public Cat getCat() {
        return cat;
    }
    public Dog getDog() {
        return dog;
    }
    public String getName() {
        return name;
    }

}
