package com.sliit.mtit.microservice.orderservice.dto;

import java.util.StringJoiner;

public class OrderRequest {

    private String fullName;
    private String age;
    private String oderType;
    private String orderDetails;

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

    public String getOderType() {
        return oderType;
    }

    public void setOderType(String oderType) {
        this.oderType = oderType;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OrderRequest.class.getSimpleName() + "[", "]")
                .add("fullName='" + fullName + "'")
                .add("age='" + age + "'")
                .add("oderType='" + oderType + "'")
                .add("orderDetails='" + orderDetails + "'")
                .toString();
    }
}
