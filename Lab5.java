import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> myList = new ArrayList<>();

        System.out.println("Enter an element of float array");
        while (!sc.hasNext("quit")) {
            if (sc.hasNextFloat()){
                myList.add(sc.nextFloat());
                System.out.println("Enter another float or type quit to stop");
            }
            else {
                System.out.println("Error type! Please enter a float");
                sc.next();
            }
        }
        System.out.println("Your array: " + myList);

        switch (myList.size()){
            case 1:
                System.out.println("Result array: " + myList);
                break;
            case 0:
                System.out.println("Error! Null array");
                break;
            default:
                for (int i = 1; i < myList.size(); i++){
                    if (myList.get(i) < myList.get(i-1)) {
                        myList.remove(i);
                        i = 0;
                    }
                }
                System.out.println("Result array: " + myList);
                break;
        }
        sc.close();
    }
}

