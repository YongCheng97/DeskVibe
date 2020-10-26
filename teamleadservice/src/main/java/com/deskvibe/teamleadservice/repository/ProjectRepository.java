package com.deskvibe.teamleadservice.repository;

import com.deskvibe.teamleadservice.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
