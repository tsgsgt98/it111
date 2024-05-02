
import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

//        String car = "Volvo";

        String[] cars = new String[4];
//                in many computer programs, we start counting with zero

        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";
//        System.out.println(cars[0];


        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

//        String[] books ={"Handmaid's Tale","Slenderman","The Joy Luck Club","East of Eden","The Looming Tower"};

        String[] books = new String[5];

        books[0] = "Handmade's Tale";
        books[1] = "Slenderman";
        books[2] = "The Joy Luck Club";
        books[3] = "East of Eden";
        books[4] = "The Looming Tower";

        System.out.println(Arrays.toString(books));

//   Different way of dispying your Arrays is
//        we are going to build a for each loop (it is the easier on the whole bunch of loops) it is doing:

        for(String book : books) {
            System.out.println(book);

        }
        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));
//        or you can do it the other way like below

        for(int number :numbers) {

            System.out.println(number);
        }

         String[] wines =new String[5];

             wines[0] = "Cabernet";
             wines[1] = "Merlot";
             wines[2] = "Syrah";
             wines[3] = "Malbec";
             wines[4] = "Cabernet-Frank";

          for(String wine :wines) {
              System.out.println(wine);
              System.out.println(wine.length());
          }
//        How do I stopped the loop after "Syrah" ? It will be by creating for each loop, see below how:
//
         for(String wine : wines) {
             if(wine.equals("Malbec")) {
                 break;
             }
             System.out.println(wine);
         }

    }

}
