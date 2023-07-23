package academy.atl.trivia.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data // crea getter y setters con lombok
public class Category {
    @Id // le decimos que esto hace referencia a la PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


}
