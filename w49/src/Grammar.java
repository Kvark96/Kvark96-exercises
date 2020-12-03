public class Grammar {

    public Grammar(){}

    public String grammatize(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder rebuild = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            words[i] = correct(words[i]);
            rebuild.append(words[i]);
            if(i != words.length - 1){
                rebuild.append(" ");
            }
        }
        return rebuild.toString();
    }

    private String correct(String str){
        if(isUpperCase(str)) return str;
        if(str.length() < 4) return str.toLowerCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private boolean isUpperCase(String str){
        char[] chs = str.toCharArray();
        boolean res = true;
        for(char c : chs){
            res = Character.isUpperCase(c);
        }
        return res;
    }
}
