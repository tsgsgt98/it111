public class celciusFarConverter {

    public static void main(String[] args) {

     //        far = (cel * 9/5) + 32

        int cel,far;

        for(cel = 0; cel <= 100; cel = cel+1) {
            far = (cel * 9/5) + 32;
//            System.out.println(cel);
//            System.out.println(far);

           System.out.println(cel +" degrees Celcius is ewual to " +far+ " degrees Farenheit");

        } // end for loop

            System.out.println("All done!");
            }

    }
