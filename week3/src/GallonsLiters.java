

public class GallonsLiters {

    public static void main(String[] args) {

        double Gallon,Liter;
        int count = 0;

        for(Gallon =1; Gallon <= 100; Gallon = Gallon +=4) {
            Liter = (Gallon * 3.7854) ;


//            System.out.println(Gallon+ " Gallon = " +Liter+ " Liters");

            if(Gallon == 1){
                System.out.printf("%.2f Liters = %.1f Gallon", Liter, Gallon);
                System.out.println();

            }else {
                System.out.printf("%.2f Liters = %.1f Gallons", Liter, Gallon);
                System.out.println();
            }
             count += 1;
            if(count == 5) {
                System.out.println();
                count = 0;
            }
        }


//        end for loop
        System.out.println("We are done!!");
    }

}



