package com.deskvibe.teamleadservice.model;

import org.springframework.data.annotation.Id;

public class TeamMember {

    @Id
    public String teamMemberId;
    public String firstName;
    public String lastName;
    public String email;

    public TeamMember() {
        super();
    }

    public TeamMember(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getTeamMemberId() {
        return teamMemberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setTeamMemberId(String teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
