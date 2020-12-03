import java.util.Scanner;

public class Lawnmower {
    double cmPerDay = 0.8;
    public Lawnmower() {
    }

    public double startAMowin(){
        // Take input
        System.out.println("How tall is the grass right now?");
        int currentHeight = convertInput(takeInput());
        System.out.println("How tall do you want it?");
        int maxHeight = convertInput(takeInput());

        double daysLeft = (maxHeight - currentHeight) / cmPerDay;
        System.out.println("You should mow your lawn within " + Math.ceil(daysLeft) + " days.");
        return daysLeft;
    }

    private int convertInput(String str){
        int res = -1;
        try{
            res = Integer.parseInt(str);
        } catch (Exception e){
            System.out.println("Input could not be registered.\nPlease try again.");
            return convertInput(takeInput());
        }
        return res;
    }

    private String takeInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return input;
    }
}