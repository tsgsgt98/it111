package package_person_homework;

public class Person_hw {

    //this file does not have a main method
    // I am going to typing its fields ( variables)

        String name;
        String CarName;

        char gender;

        int age;

        int carAge;

        boolean violations;

        double creditScore;

    public void display() {
        System.out.println("Customer name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car Age in years: " +carAge);
        System.out.println("Car Name & its Model Year: " +CarName);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);

    }

//Our Logic is regarding our credit Score and Violations

        public double getRate(double monthlyRate) {
        if (violations && creditScore <= 700) {
            monthlyRate = 800.00;

        } else {
            monthlyRate = 200.00;

        }
        return monthlyRate;

    }
        public double assumeGender(double adjustedRate) {

        if (gender == 'M' && age <= 25) {
            adjustedRate = 200.00;

        } else {
            adjustedRate = 0;
        }

    return  adjustedRate;

    }

}




