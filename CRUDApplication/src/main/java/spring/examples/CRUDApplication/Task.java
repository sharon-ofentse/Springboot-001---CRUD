package spring.examples.CRUDApplication;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Marks this class as a JPA entity
@Data // Lombok annotation to generate to generate getters, setters, toString, etc.
public class Task {
    
    @Id // Marks this fied as the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the ID
    private Long id;

    @Column(nullable = false) // Ensures the title column cannot be null
    private String title;

    @Column(length = 1000) // Sets maximum length of the description
    private String description;

    @Column(nullable = false) // Ensures the completed column cannot be null
    private boolean completed = false; // Default value is false
}
