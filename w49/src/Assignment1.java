import java.util.ArrayList;

public class Assignment1 {
    public static boolean arrList(ArrayList<String> strs, String str){
        if(strs.contains(str) || str == null) return false;
        strs.add(str);
        strs.sort(null);
        return true;
    }
}
