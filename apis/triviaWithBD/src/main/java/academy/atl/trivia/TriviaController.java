package academy.atl.trivia;

import academy.atl.trivia.entities.Category;
import academy.atl.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.*;

@RestController
public class TriviaController {
    @Autowired // es una injección de independencia
    CategoryRepository categoryRepository;
    @GetMapping("/question/{categoria}")
    public Category getQuestion(@PathVariable String categoria) {
        List<Category> resultado = new ArrayList<>();
        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;
    }


    @GetMapping("/categories")
    public Category[] getCategories() {

        Category cat = new Category();
        cat.setName("Arte");
        cat.setDescription("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Category cat2 = new Category();
        cat2.setName("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Category[] categorias = new Category[2];
        categorias[0] = cat;
        categorias[1] = cat2;
        return categorias;
    }
}
