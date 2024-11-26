package org.example.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task {

    private String description;
    private String assignee;
    private String project;
    private Priority priority;
    private Status status;

    public Task(String description, String assignee, String project , Status status, Priority priority) {
        this.description = description;
        this.assignee = assignee;
        this.project = project;
        this.priority = priority;
        this.status = status;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description) && Objects.equals(project, task.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, project);
    }

}
