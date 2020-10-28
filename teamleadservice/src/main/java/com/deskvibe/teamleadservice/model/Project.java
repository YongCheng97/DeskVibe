package com.deskvibe.teamleadservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Project")
public class Project {

    @Id
    private String projectId;
    private String projectName;
    private List<Task> projectTasks;

    public Project() {
        projectTasks = new ArrayList<>();
    }


    public Project(String projectName) {
        this();
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Task> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectTasks(List<Task> projectTasks) {
        this.projectTasks = projectTasks;
    }
}
