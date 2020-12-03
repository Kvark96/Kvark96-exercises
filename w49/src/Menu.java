import java.util.Scanner;
public class Menu {

    public void interact(){
        display();
        int input = takeInput();
        if((input != 1) && (input != 2) && (input != 3)){
            System.out.println("Input was not recognized, please try again.");
            interact();
        } else {
            System.out.println(input + " was selected. Have a nice day!");
        }
    }

    private void display(){
        System.out.println("Please select an item from the menu:");
        System.out.println("------------------------------------");
        System.out.println("\t1. Calculate");
        System.out.println("\t2. Print");
        System.out.println("\t3. Help");
        System.out.println("------------------------------------");
    }

    private int takeInput(){
        Scanner sc = new Scanner(System.in);
        int res = -1;
        try {
            res = Integer.parseInt(sc.next());
        } catch (Exception e){
            System.out.println("Input was not recognized. Please try again.");
            return takeInput();
        }
        return res;
    }
}
