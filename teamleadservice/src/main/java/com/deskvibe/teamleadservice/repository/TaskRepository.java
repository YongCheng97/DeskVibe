package com.deskvibe.teamleadservice.repository;

import com.deskvibe.teamleadservice.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
