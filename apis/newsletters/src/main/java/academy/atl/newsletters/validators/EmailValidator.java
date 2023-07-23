package academy.atl.newsletters.validators;

public class EmailValidator {
    public boolean isValid(String email) {
        if (!email.contains("@")) {
            return false;
        }
        if (!email.contains(".")) {
            return false;
        }

        if (email.endsWith("@")) {
            return false;
        }

        if (email.contains(" ")) {
            return false;
        }
        return true;
    }
}
