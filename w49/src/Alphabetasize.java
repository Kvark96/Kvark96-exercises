import java.util.*;

public class Alphabetasize {
    public static void wordStuff(){
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5; i++){
            String str = sc.next();
            words[i] = str;
        }
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
