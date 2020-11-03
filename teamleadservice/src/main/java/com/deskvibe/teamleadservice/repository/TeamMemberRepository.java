package com.deskvibe.teamleadservice.repository;


import com.deskvibe.teamleadservice.model.TeamMember;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamMemberRepository extends MongoRepository<TeamMember, String> {
}
