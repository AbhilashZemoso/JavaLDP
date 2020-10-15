import java.util.regex.Pattern;

public class Sentence {
    public static boolean checkSentence(String input){
        return Pattern.matches("^[A-Z].*[.]$",input);
    }
}
