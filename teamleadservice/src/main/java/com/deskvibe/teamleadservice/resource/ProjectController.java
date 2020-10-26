package com.deskvibe.teamleadservice.resource;

import com.deskvibe.teamleadservice.model.Project;
import com.deskvibe.teamleadservice.model.Task;
import com.deskvibe.teamleadservice.repository.ProjectRepository;
import com.deskvibe.teamleadservice.repository.TaskRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjectController {


    @Autowired
    private ProjectRepository repository;
    @Autowired
    private TaskRepository taskRepository;


    @PostMapping("/addProject")
    public String saveProject(@RequestBody Project project) {
        repository.save(project);
        return "Added project with id : " + project.getProjectId();
    }

    @PostMapping("/addTaskToProject")
    public String addTaskToProject(@RequestParam String projectId, @RequestParam String taskId){
        Project project = this.getProject(projectId).orElse(null);
        if (project == null ) {
            return "project with projectID " + projectId + " not found";
        }

        TaskController taskController = new TaskController();
        Task task = taskRepository.findById(taskId).orElse(null);
        if (task == null ) {
            return "task with taskId " + taskId + " not found";
        }

        List<Task> taskList = project.getProjectTasks();
        taskList.add(task);
        project.setProjectTasks(taskList);
        this.saveProject(project);

        return "project saved";

    }

    @GetMapping("/findAllProjects")
    public List<Project> getProjects() {
        return repository.findAll();
    }


    @GetMapping("/findAllProjects/{id}")
    public Optional<Project> getProject(@PathVariable String id) {
        return repository.findById(id);
    }

    @DeleteMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable String id) {
        repository.deleteById(id);
        return "project deleted with id : " + id;
    };

    @PutMapping("/updateProject/{id}")
    public String updateProject(@RequestBody Project project) {
        repository.save(project);
        return "Updated project with id : " + project.getProjectId();
    }


}
