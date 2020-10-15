import java.util.List;

public class ArrayOfObjects {
    ArrayOfObjects(String text){
        System.out.println("constructor invoked for argument : "+text);
    }

    public static ArrayOfObjects[] createArrayObjectReferences(){
        ArrayOfObjects array[] = new ArrayOfObjects[3];
        return array;
    }

    public static void createArrayObjects(ArrayOfObjects []array){
        array[0] = new ArrayOfObjects("first Object");
        array[1] = new ArrayOfObjects("second Object");
        array[2]  = new ArrayOfObjects("third Object");

    }
}

