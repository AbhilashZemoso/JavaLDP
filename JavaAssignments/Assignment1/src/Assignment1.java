import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

/*
Documentation
File - to access files
Scanner - to take input
Pattern - to compile pattern
Matcher - to check match with pattern
 */
public class Assignment1 {
    public static void printMatchingFiles(File folder,Pattern pattern) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                printMatchingFiles(fileEntry,pattern);
            } else {
                String fileName = fileEntry.getName();
                Matcher m = pattern.matcher(fileName);
                if(m.matches()){
                    System.out.println(fileEntry.getPath());
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter exit to stop");
        while (true) {
            String input = sc.next();
            if(input.equals("exit"))
                break;
            Pattern pattern;
            String homePath = System.getProperty("user.home");
            //String homePath = System.getProperty("user.dir");
            //pattern = Pattern.compile("[a-zA-Z0-9.]*");
            pattern = Pattern.compile(input);
            File folder = new File(homePath);
            printMatchingFiles(folder, pattern);
        }
    }
}
