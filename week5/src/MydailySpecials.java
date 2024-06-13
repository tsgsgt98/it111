import java.util.Scanner;

public class MydailySpecials {

    public static void main(String[]args ) {

        String MydailySpecials;
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        MydailySpecials = input.next();


//        in the world of coffee, we need a name of a coffee beverage and a price


        String coffee;
        double price;

        boolean saturday = MydailySpecials.equals("Saturday");
        boolean sunday = MydailySpecials.equals("Sunday");

        while (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            MydailySpecials = input.next();


        }


        switch (MydailySpecials) {

//     my cases will be the day of the week

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;

                System.out.println(MydailySpecials + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
               num = input.nextInt();
               if(num == 0) {
                   System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
               } else if (num == 1) {
                   System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
               }else {
                   System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                   System.out.printf("%.2f", num*price);
                   System.out.println(" dollars!");
               }

            }

            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;

                System.out.println(MydailySpecials + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                }else {
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                }

            }
            case "Wednesday" -> {
                coffee = "Cappucino";
                price = 4.35;

                System.out.println(MydailySpecials + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                }else {
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                }

            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;

                System.out.println(MydailySpecials + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                }else {
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                }

            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;

                System.out.println(MydailySpecials + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
                System.out.println("How many " +coffee+ "s would you like to order?");
                num = input.nextInt();
                if(num == 0) {
                    System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
                } else if (num == 1) {
                    System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
                }else {
                    System.out.printf(num+  " "+ coffee + "s have been ordered, totalling $");
                    System.out.printf("%.2f", num*price);
                    System.out.println(" dollars!");
                }

            }
        }

    }
}
