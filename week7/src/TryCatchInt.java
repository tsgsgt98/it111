import java.util.Scanner;

public class TryCatchInt {

    public static void main(String[] args) {

        System.out.println("Please enter a number!!!");
//      I am trying the code in my try block
        try {

            int i ;

            Scanner input = new Scanner(System.in);

            i = input.nextInt();


            System.out.println("Your integer is: " +i);
            //If there are problems... it will render in the catch block
            System.out.println("The code run correctly");
        }catch (Exception e) {
            System.out.println("We have an error: " +e);


        }
    }
}

