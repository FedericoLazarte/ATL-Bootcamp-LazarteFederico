package academy.atl.trivia.repository;

import academy.atl.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // qué es lo hace esta anotación?
public class CategoryRepository {
    @PersistenceContext // carga el tipo de obj de entityManager
    EntityManager entityManager; // objeto de conexion de base de datos, trae funcionalidades como find

    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

}
