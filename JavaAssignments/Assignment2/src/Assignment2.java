import java.util.Scanner;

/*
Time Complexity     :  O(n)
Space Complexity    :  O(n)
 */

public class Assignment2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        boolean checkAlphabets[] = new boolean[26];
        int count = 0;
        for(char ch:input.toCharArray()){
            if(ch>='a' && ch<='z' && !checkAlphabets[ch-'a']){
                checkAlphabets[ch-'a'] = true;
                count++;
                if(count==26)
                    break;
            }
        }
        if(count==26)
            System.out.println("contains all alphabets");
        else
            System.out.println("do not contain all alphabets");
    }
}
