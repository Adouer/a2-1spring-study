package com.adouer.pojo;

/**
 * @author adouer
 */
public class User {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
