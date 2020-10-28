package com.deskvibe.teamleadservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Task")
public class Task {

    @Id
    private String taskId;
    private String taskName;
    private int estimatedTime;
    private int timeTaken;
    private Boolean completionStatus;
    private String projectId;
    private TeamMember teamMember;

    private Task() {

    }

    public Task(String taskName, int estimatedTime, String projectId) {
        this();
        this.taskName = taskName;
        this.estimatedTime = estimatedTime;
        this.projectId = projectId;
        this.completionStatus = false;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Boolean getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(Boolean completionStatus) {
        this.completionStatus = completionStatus;
    }
}
