import java.util.Map;

public class Main {
    private static void test(){
        String fileName = "Sample3.txt";
        CharacterFrequency.evaluateAndwriteToFile(fileName);
    }


    public static void main(String args[]){
        boolean testing = true;
        if(testing){
           test();
        }
        else{
            if(args.length==0){
                System.out.println("Enter file name as argument");
            }
            else {
                CharacterFrequency.evaluateAndwriteToFile(args[0]);
            }
        }
    }
}
