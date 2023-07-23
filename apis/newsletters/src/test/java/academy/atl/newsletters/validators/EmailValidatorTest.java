package academy.atl.newsletters.validators;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@SpringBootTest
public class EmailValidatorTest {
    @Test
    public void emailTieneQueTenerArroba() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValid("asdadadasd");
        assertFalse(resultado);
    }

    @Test
    public void elEmalTieneQueTenerPunto() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValid("fede@gmail");
        assertFalse(resultado);
    }

    @Test
    public void queElArrobaNoSeaLaUltimaLetra() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValid("fede.de@");
        assertFalse(resultado);
    }

    @Test
    public void queNoTengaEspacios() {
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValid("fede lazarte@gmail.com");
        assertFalse(resultado);
    }

}
