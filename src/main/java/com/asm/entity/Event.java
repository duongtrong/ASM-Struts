package com.asm.entity;

import java.util.Calendar;

public class Event {

    private long id;
    private String date;
    private String time;
    private String planning;
    private String location;
    private String info;

    public Event() {
        this.id = Calendar.getInstance().getTimeInMillis();
    }

    public Event(long id, String date, String time, String planning, String location, String info) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.planning = planning;
        this.location = location;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
