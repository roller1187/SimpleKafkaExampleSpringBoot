package com.redhat.demo.simpleKafkaApp;

public class simpleKafkaAppGreeting {

    private final long id;
    private final String content;

    public simpleKafkaAppGreeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}