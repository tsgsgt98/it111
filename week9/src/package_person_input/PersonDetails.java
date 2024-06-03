package package_person_input;
import java.lang.String;
import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {
//        we need to create an object - customer

  Person customer;
   customer = new Person();
//   we will be initializing additional variables or need to enter additional variables
        int states = 0;

        System.out.println("Please enter your name!");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age!");
        customer.age = input.nextInt();

        System.out.println("Please enter your gender by entering F or M or N");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your Zipcode ( only 5 number pleas!");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no");
        customer.violations = input.nextBoolean();
// add am if else statement!
       if(customer.violations == true) {
           System.out.println("Please type true if you had a DUI, or false if not");
           customer.violationDUI = input.nextBoolean();
           System.out.println("Please type true if you had a red light violation or false, if not");
           customer.violationRedLight = input.nextBoolean();
           System.out.println("Have you received any speeding tickets? Please type true for yes, false for no ticket");
           customer.violationSpeeding = input.nextBoolean();

       }
        System.out.println("Please type in your credit score");
       customer.creditScore = input.nextDouble();
       customer.display();
        System.out.println(customer.identifyRegion(states));
        double surcharge = 0;
        System.out.println("Your California surcharge is " + customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age Category adjustment: " + customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violationns and Credit Score adjustment: " + customer.getRate(monthlyRate));
        System.out.print("Your new monthly premium will be ");
        System.out.println(customer.baselineRate
                + customer.ageCategory(adjustedRate)
                + customer.californiaRegion(surcharge)
                + customer.getRate(monthlyRate));

    }
}

