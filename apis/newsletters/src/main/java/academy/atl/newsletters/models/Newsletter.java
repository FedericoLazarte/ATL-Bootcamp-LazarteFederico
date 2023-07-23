package academy.atl.newsletters.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "newsletter")
public class Newsletter {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;
}
