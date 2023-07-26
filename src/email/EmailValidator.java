package email;

public class EmailValidator {

     public boolean isEmailValid(String email) {
        boolean result = false;

        if(email.contains("@")) {
            result = true;
        }
        return result;
    }
}
