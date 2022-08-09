package com.jack.start.demo;

public class MyStarterConfig {
    private MyStarterProperties myStarterProperties;
    private String name;

    public MyStarterConfig(MyStarterProperties myStarterProperties) {
        this.myStarterProperties = myStarterProperties;
    }

    public String getName() {
        return myStarterProperties.getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
