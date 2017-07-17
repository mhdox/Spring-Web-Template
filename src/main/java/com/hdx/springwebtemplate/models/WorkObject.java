package com.hdx.springwebtemplate.models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * Model for WorkObject information
 * Created by michael.hadox on 5/17/17.
 */
@Entity
public class WorkObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "STARTTIME")
    private String startTime;
    @Column(name = "STEPNAME")
    private String stepName;
    @Column(name = "USER")
    private String user;

    public WorkObject() {
    }

    public WorkObject(String name, String startTime, String stepName, String user) {
        this.name = name;
        this.startTime = startTime;
        this.stepName = stepName;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
