import java.util.Scanner;

public class dailySpecialsf {

    public static void main(String[] args) {

        String dailySpecialsf;

        Scanner input = new Scanner(System.in);

        String coffee = null;
        double price = 0;
        int num;



        boolean nietherWeekDayNorWeekend = true;


//        We need to name of a coffee beverage and to put its price


            boolean saturday = dailySpecialsf.equalsIgnoreCase("Saturday");

            boolean sunday = dailySpecialsf.equalsIgnoreCase("Sunday");

            while (saturday || sunday) {
                System.out.println("Please enter a weekday, not weekend!");
                dailySpecialsf = input.next();


        while (nietherWeekDayNorWeekend) {
            System.out.println("Please enter a day of the week excluding weekends!");
            dailySpecialsf = input.next();

            switch (dailySpecialsf) {

//     my cases will be the day of the week

                case "Monday" -> {
                    nietherWeekDayNorWeekend = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(dailySpecialsf + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                }


                case "Tuesday" -> {
                    nietherWeekDayNorWeekend = false;
                    coffee = "Frapp";
                    price = 5.95;
                    System.out.println(dailySpecialsf + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                }

                case "Wednesday" -> {
                    nietherWeekDayNorWeekend = false;
                    coffee = "Cappucino";
                    price = 4.35;
                    System.out.println(dailySpecialsf + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");

                }
                case "Thursday" -> {
                    nietherWeekDayNorWeekend = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(dailySpecialsf + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");

                }
                case "Friday" -> {
                    nietherWeekDayNorWeekend = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(dailySpecialsf  + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                }
            }
        }


            System.out.println("How many " +coffee+ "s would you like to order?");
            int num = input.nextInt();
            double money = num * price;

            if(num == 0) {
                System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");

            } else if (num > 0 && num < 5) {
                System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                System.out.printf("%.2f", num*price);
                System.out.println(" dollars!");

            } else if (num > 5 && num < 10) {
                double moneyWithDiscount = money * 0.9;
                System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                System.out.printf("%.2f", num*price);
                System.out.println(" dollars!");
                System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                System.out.printf("%.2f", num*price,moneyWithDiscount);
                System.out.println(" dollars!");

            } else if (num >= 10) {

                double moneyWithDiscount = money * 0.8;
                System.out.println(" A Huge You group discount!! Your reqular price is $");
                System.out.printf("%.2f", num*price);
                System.out.println(" dollars!");
                System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                System.out.printf("%.2f", num*price,moneyWithDiscount);
                System.out.println(" dollars!");

            }else {
                System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                System.out.printf("%.2f", num*price);
                System.out.println(" dollars!");
            }
        }
    }

}



