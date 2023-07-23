package academy.atl.newsletters.controllers;


import academy.atl.newsletters.models.Newsletter;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewslettersController {
    @Autowired
    EmailRepository repositorioDeEmails;

    @GetMapping("/api/newsletter")
    public List<String> getAllEmail(){
        return repositorioDeEmails.findAll();
    }

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Newsletter newsletter) {
        String email = newsletter.getEmail();
        EmailValidator emailValidator = new EmailValidator();
        if (emailValidator.isValid(email) == false) {
            return "El email no es válido";
        }

        // Guardar en Base de datos
        repositorioDeEmails.saveEmail(email);

        return "Email: guardado";
    }

    @DeleteMapping("/api/newsletter")
    public String unsubscribe(@RequestBody Newsletter newsletter){
        String email = newsletter.getEmail();
        repositorioDeEmails.deleteEmail(email);
        return "Email: " + newsletter.getEmail() + " has been unsubscribed";
    }

}
