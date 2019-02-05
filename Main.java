import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    
    public static void main(String[] args ){
        
        Scanner names = new Scanner(System.in);
        System.out.print("Hello, what is your name? ");
        String name = names.nextLine();
        
        if(name == "Bob" || name == "Alice"){
            System.out.println("Welcome to ZipCode Wilmington " + name + " !");
        } else { 
            System.out.println("Better luck next time");
    }
  }
}
