import java.util.Scanner;

public class MydailySpecialsFinalhw {


    public static void main(String[] args) {

            String MydailySpecialsFinalhw;
            int num;

            Scanner input = new Scanner(System.in);

          System.out.println("Please enter a day of the week excluding weekends!");

            MydailySpecialsFinalhw = input.next();


//        We need to name of a coffee beverage and to put its price


            String coffee;
            double price;

            boolean saturday = MydailySpecialsFinalhw.equals("Saturday");
            boolean sunday = MydailySpecialsFinalhw.equals("Sunday");

            while (saturday || sunday) {
                System.out.println("Please enter a weekday, not weekend!");
                MydailySpecialsFinalhw = input.next();


            }


            switch (MydailySpecialsFinalhw) {

//     my cases will be the day of the week

                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;

                    System.out.println(MydailySpecialsFinalhw + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
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

                    System.out.println(MydailySpecialsFinalhw + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
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

                    System.out.println(MydailySpecialsFinalhw + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
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

                    System.out.println(MydailySpecialsFinalhw + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
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

                    System.out.println(MydailySpecialsFinalhw + "'s coffee of the day is a " + coffee + " and the price will be $" + price+ " dollars!");
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


