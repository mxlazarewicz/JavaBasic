import java.util.regex.Pattern;

public class RegexTraining {
    public static boolean isIdCorrect(String id) {
        Pattern idPattern = Pattern.compile(("[0-9]{11}"));
        return idPattern.matcher(id).matches();
    }

    public static boolean emailIsValid(String email) {
        Pattern emailPattern = Pattern.compile(("[0-9a-z_\\\\.\\\\-]+@[0-9a-z_\\\\.\\\\-]+"));
        return emailPattern.matcher(email).matches();
    }
    public static void main(String[] args){
        String pesel ="940105042";
        isIdCorrect(pesel);
    }


}


