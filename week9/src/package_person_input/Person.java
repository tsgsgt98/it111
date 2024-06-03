package package_person_input;

public class Person {
//    no main method
//    crating our fields
    String name;
    char gender;
    int age;
    String zipCode;
    int cityCode;

//    we have our individual violations, as well as the main violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;
    double baselineRate = 300;

//    creating a method named display, so that we can print the info in one fell swoop


    public void display() {
        System.out.println("This is what you have entered!");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Your baseline rate:" +baselineRate+ " dollars");
        System.out.println("Your baseline rate is calculated without taking into consideration the following: age,Credit Score, violations and residence");
        System.out.println("Violations: " +violations);
        System.out.println("DUI Violation: " +violationDUI);
        System.out.println("Red Light Violation: " +violationRedLight);
        System.out.println("Speeding Violation: " +violationSpeeding);
        System.out.println("Credit Score:" +creditScore);



    }
//    create a method - violations and credit score
//    violations or credit score
        public double getRate(double monthlyRate) {

            if (violations == true || creditScore <= 700.00) {
                monthlyRate = 300.00;
            } else {
                monthlyRate = 0;
            }
            return monthlyRate;
        }


//        new method for age
//       if you are young or older, you will be paying more money
        public double ageCategory(double adjustedRate) {
        if (age <= 25 || age >= 65) {
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0;
        }
//        dont't forget you have to return adjustedRate
        return adjustedRate;
    }


//    our method for states/zipcodes/strings/changing your string to an integer!
    public int identifyRegion(int states) {
//        90 - 96 - Ca, 97 - Or, 98 and 99 Seattle
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);

        if (cityCode >= 90 && cityCode < 97) {
            System.out.println("You entered " + zipCode+ " and you're from California");


        } else if (cityCode >= 97 && cityCode < 98) {
            System.out.println("You entered " + zipCode+ " and you're from Origon");

        } else if (cityCode >= 98 && cityCode < 99) {
            System.out.println("You entered " + zipCode+ " and you're from Washington ");

        } else {

            System.out.println("you are not from the Pacific Northwest, please contact our National Office ");
        }

        return states;

    }
//    method to charge a surcharge to people who live in californie, because there are so many cars, polution
    public double californiaRegion(double surcharge) {
        if (cityCode >= 90 && cityCode < 97) {
            surcharge = 200.00;

        } else {
            surcharge = 0;
        }
      return surcharge;
    }
}
