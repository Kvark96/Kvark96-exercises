import java.util.ArrayList;
import java.util.Scanner;

public class ASmallProgram {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        boolean done = false;
        while(!done){
            String str = sc.nextLine();
            if(str.equals("")) {
                done = true;
            } else {
                if(Character.isUpperCase(str.charAt(0))) count++;
            }
            strings.add(str);
        }
        System.out.println("There were " + count + " cases of uppercases.");
    }
}
