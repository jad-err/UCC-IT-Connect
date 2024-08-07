package com.example.uccitconnect.models;

public class Course {
    private String code;
    private String name;
    private String prerequisite;
    private int credits;

    // Default constructor required for calls to DataSnapshot.getValue(Course.class)
    public Course() {
    }

    public Course(String code, String name, String prerequisite, int credits) {
        this.code = code;
        this.name = name;
        this.prerequisite = prerequisite;
        this.credits = credits;
    }

    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
