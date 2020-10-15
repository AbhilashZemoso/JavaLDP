import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment6 {
    private static void displayList(List<Integer> listOfIntegers){
        int count = 1;
        for(int number:listOfIntegers) {
            System.out.println(count + " : " + number);
            count++;
        }
    }

    public static void main(String args[]){
        //Assignment part 1
        List<Integer> vampireNumbers = VampireNumber.getFirstNVampireNumbers(100);
        displayList(vampireNumbers);

        //Assignment part 2
        TwoOverloadedConstructors object = new TwoOverloadedConstructors(2,3);

        //Assignment part 3
        ArrayOfObjects array[] = ArrayOfObjects.createArrayObjectReferences();

        //Assignment part 4
        ArrayOfObjects.createArrayObjects(array);

    }
}
