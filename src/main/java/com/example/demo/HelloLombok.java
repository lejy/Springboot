package com.example.demo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class HelloLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok h = new HelloLombok("헬로",1);
        System.out.println(h.getHello());

    }
}