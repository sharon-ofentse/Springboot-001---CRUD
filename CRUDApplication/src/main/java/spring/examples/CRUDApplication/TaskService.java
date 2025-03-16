package spring.examples.CRUDApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marks this class as a Spring service component
public class TaskService {
    
    @Autowired // Injects the TaskRepository
    private TaskRepository taskRepository;

    // Create a new task 
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Fetch all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Fetch a task by its ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Update a task
    public Task updateTask(Long id, Task updatedTask) {
        if(taskRepository.existsById(id)) {
            updatedTask.setId(id); // Ensure the ID matches
            return taskRepository.save(updatedTask);
        }
        else {
            throw new RuntimeException("Task not found with id: " + id);
        }
    }

    // Delete a task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
    
}
