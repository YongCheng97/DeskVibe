package com.deskvibe.teamleadservice.resource;

import com.deskvibe.teamleadservice.model.Project;
import com.deskvibe.teamleadservice.model.Task;
import com.deskvibe.teamleadservice.model.TeamMember;
import com.deskvibe.teamleadservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TeamMemberController teamMemberController;


    @PostMapping("/addTask")
    public String saveTask(@RequestBody Task task) {
        repository.save(task);
        return "Added task with id : " + task.getTaskId();
    }

    @GetMapping("/findAllTasks")
    public List<Task> getTasks() {
        return repository.findAll();
    }

    @GetMapping("/findAllTasksByProject")
    public List<Task> getTasksByProject() {
        return repository.findAll();
    }

    @GetMapping("/findAllTasks/{id}")
    public Optional<Task> getTask(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping("/assignTaskToMember")
    public String assignTaskToMember(@RequestParam String memberId, @RequestParam String taskId){
        TeamMember teamMember = teamMemberController.getTeamMember(memberId).orElse(null);
        if (teamMember == null ) {
            return "member with memberId " + memberId + " not found";
        }

        TaskController taskController = new TaskController();
        Task task = repository.findById(taskId).orElse(null);
        if (task == null ) {
            return "task with taskId " + taskId + " not found";
        }

        List<Task> taskList = teamMember.getTasks();
        taskList.add(task);
        teamMember.setTasks(taskList);
        teamMemberController.saveMember(teamMember);

        return "task assigned";

    }

    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable String id) {
        repository.deleteById(id);
        return "task deleted with id : " + id;
    };

    @PutMapping("/updateTask/{id}")
    public String updateTask(@RequestBody Task task) {
        repository.save(task);
        return "Updated task with id : " + task.getTaskId();
    }

}
