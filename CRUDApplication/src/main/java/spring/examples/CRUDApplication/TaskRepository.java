package spring.examples.CRUDApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks thiss interface as a Spring Data JPA repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    // Please note we used interface instead of class
    // JpaRepository is an interface, we can only extend things of the same TYPE

    // No need to add any methods yet!
    // JpaRepository provides all the CRUD methods we need.
}
