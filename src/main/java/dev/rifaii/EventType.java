package dev.rifaii;

public class EventType {

    private String code;
    private String name;

    public EventType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public EventType setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventType setName(String name) {
        this.name = name;
        return this;
    }
}
