package com.sliit.mtit.microservice.accountservice.dto;

import java.util.StringJoiner;

public class UserRequest {

    private String fullName;
    private String age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserRequest.class.getSimpleName() + "[", "]")
                .add("fullName='" + fullName + "'")
                .add("age='" + age + "'")
                .toString();
    }

}
