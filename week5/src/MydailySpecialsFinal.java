import java.util.Scanner;

public class MydailySpecialsFinal {

    public static void main(String[]args ) {

        String MydailySpecialsFinal;
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        MydailySpecialsFinal = input.next();


//        Here we need a name of a coffee beverage and a price


        String coffee;
        double price;

        boolean saturday = MydailySpecialsFinal.equals("Saturday");
        boolean sunday = MydailySpecialsFinal.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            MydailySpecialsFinal = input.next();


        }


        switch (MydailySpecialsFinal) {

//     my cases will be the day of the week

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;

                System.out.println(MydailySpecialsFinal + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

                } else if (num > 1 && num < 5) {
                    System.out.println("Looks like you will be ordering only " + coffee + " today!");
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");

                } else if (num > 5 && num < 10) {
                    double moneyWithDiscount = num * 0.9;
                    System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                    System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                    System.out.printf("%.2f", num*price,moneyWithDiscount);
                    System.out.println(" dollars!");

                } else if (num >= 10) {

                    double moneyWithDiscount = num * 0.8;
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

            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;

                System.out.println(MydailySpecialsFinal + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

                } else if (num > 1 && num < 5) {
                    System.out.println("Looks like you will be ordering only " + coffee + " today!");
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");

                } else if (num > 5 && num < 10) {
                    double moneyWithDiscount = num * 0.9;
                    System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                    System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                    System.out.printf("%.2f", num*price,moneyWithDiscount);
                    System.out.println(" dollars!");

                } else if (num >= 10) {

                    double moneyWithDiscount = num * 0.8;
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
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;
                System.out.println(MydailySpecialsFinal + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

                } else if (num > 1 && num < 5) {
                    System.out.println("Looks like you will be ordering only " + coffee + " today!");
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");

                } else if (num > 5 && num < 10) {
                    double moneyWithDiscount = num * 0.9;
                    System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                    System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                    System.out.printf("%.2f", num*price,moneyWithDiscount);
                    System.out.println(" dollars!");

                } else if (num >= 10) {

                    double moneyWithDiscount = num * 0.8;
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
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;

                System.out.println(MydailySpecialsFinal + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

                } else if (num > 1 && num < 5) {
                    System.out.println("Looks like you will be ordering only " + coffee + " today!");
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");

                } else if (num > 5 && num < 10) {
                    double moneyWithDiscount = num * 0.9;
                    System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                    System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                    System.out.printf("%.2f", num*price,moneyWithDiscount);
                    System.out.println(" dollars!");

                } else if (num >= 10) {

                    double moneyWithDiscount = num * 0.8;
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
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;

                System.out.println(MydailySpecialsFinal + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");

                } else if (num > 1 && num < 5) {
                    System.out.println("Looks like you will be ordering only " + coffee + " today!");
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");

                } else if (num > 5 && num < 10) {
                    double moneyWithDiscount = num * 0.9;
                    System.out.println("You are qualifying for a group discount!! Your reqular price is $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                    System.out.printf("You have ordered " +num+  " "+ coffee + "s so you will be charged $");
                    System.out.printf("%.2f", num*price,moneyWithDiscount);
                    System.out.println(" dollars!");

                } else if (num >= 10) {

                    double moneyWithDiscount = num * 0.8;
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
}
