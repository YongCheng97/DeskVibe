package com.deskvibe.teamleadservice.resource;


import com.deskvibe.teamleadservice.model.TeamMember;
import com.deskvibe.teamleadservice.repository.TeamMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TeamMemberController {

    @Autowired
    private TeamMemberRepository repository;


    @PostMapping("/addMember")
    public String saveMember(@RequestBody TeamMember teamMember) {
        repository.save(teamMember);
        return "Added team Member with id : " + teamMember.getTeamMemberId();
    }

    @GetMapping("/findAllMembers")
    public List<TeamMember> getMembers() {
        return repository.findAll();
    }


    @GetMapping("/findAllTeamMembers/{id}")
    public Optional<TeamMember> getTeamMember(@PathVariable String id) {
        return repository.findById(id);
    }

    @DeleteMapping("/deleteTeamMember/{id}")
    public String deleteTeamMember(@PathVariable String teamMemberId) {
        repository.deleteById(teamMemberId);
        return "team member deleted with id : " + teamMemberId;
    };

    @PutMapping("/updateTeamMember/{id}")
    public String updateTask(@RequestBody TeamMember teamMember) {
        repository.save(teamMember);
        return "Updated team member with id : " + teamMember.getTeamMemberId();
    }
}
