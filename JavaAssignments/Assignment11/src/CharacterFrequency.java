import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    private static Map<Character,Integer> getCharacterFrequency(String input){
        Map<Character,Integer> charFrequency = new HashMap<>();
        for(char ch:input.toCharArray()){
            if(charFrequency.containsKey(ch)){
                int count = charFrequency.get(ch);
                charFrequency.put(ch,count+1);
            }
            else {
                charFrequency.put(ch,1);
            }
        }
        return charFrequency;
    }

    public static void evaluateAndwriteToFile(String fileName){
        Map<Character,Integer> charFreq = CharacterFrequency.getCharacterFrequency(fileName);
        FileOperations.writeDataToFile(fileName,charFreq);
    }
}
