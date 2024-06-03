package package_person_homework;

public class Person_hwDetails {

    //this file will have a main method

    public static void main(String[] args) {

       Person_hw firstPerson_hw;
       Person_hw secondPerson_hw;

//   in the process of creating an object from my Person_hw class

       firstPerson_hw = new Person_hw();
       secondPerson_hw = new Person_hw();

//        I am entering the info, and assigning values to my fields

     firstPerson_hw.name = "Cathy Jones";
     firstPerson_hw.gender = 'F';
     firstPerson_hw.age = 40;
     firstPerson_hw.CarName= "2010 Toyota Corolla";
     firstPerson_hw.carAge = 14;
     firstPerson_hw.violations = false;
     firstPerson_hw.creditScore = 690;

        secondPerson_hw.name = "Kendall Black";
        secondPerson_hw.gender = 'M';
        secondPerson_hw.age = 22;
        secondPerson_hw.CarName = "2019 Toyota Avalon";
        secondPerson_hw.carAge = 5;
        secondPerson_hw.violations = true;
        secondPerson_hw.creditScore = 570;



        double monthlyRate = 0;
        double adjustedRate = 0;

//        System.out.println(firstPerson_hw.name);
//        System.out.println(firstPerson_hw.gender);
//        System.out.println(firstPerson_hw.age);
//        System.out.println(firstPerson_hw.carAge);
//        System.out.println(firstPerson_hw.violations);
//        System.out.println(firstPerson_hw.creditScore);
//        System.out.println();
//        System.out.println(secondPerson_hw.name);
//        System.out.println(secondPerson_hw.gender);
//        System.out.println(secondPerson_hw.age);
//        System.out.println(secondPerson_hw.carAge);
//        System.out.println(secondPerson_hw.violations);
//        System.out.println(secondPerson_hw.creditScore);


//        firstPerson_hw.display();
//        System.out.println();
//        secondPerson_hw.display();


        firstPerson_hw.display();
        System.out.println("Preliminary Rate for " + firstPerson_hw.name+ ": " + firstPerson_hw.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson_hw.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " +firstPerson_hw.name+ " 's total monthly premium: ");
        System.out.println(firstPerson_hw.assumeGender(adjustedRate) + firstPerson_hw.getRate(monthlyRate));
        System.out.println();
        secondPerson_hw.display();
        System.out.println("Preliminary Rate for " +secondPerson_hw.name+ ": " +secondPerson_hw.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +secondPerson_hw.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is " +secondPerson_hw.name+ " 's total monthly premium: ");
        System.out.println(secondPerson_hw.assumeGender(adjustedRate) + secondPerson_hw.getRate(monthlyRate));


    }

}
