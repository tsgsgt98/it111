import java.io.File;
import static java.lang.System.out;

public class MyFile2 {

    public static void main(String[] args){

        File dir = new File("NewFolder");
//        start with an if else statement
        if (dir.exists()) {
//      we are going to be happy
//      this is where we are going to call out our array

            String[] files = dir.list();
//            a new key word, named assert
            assert files != null;
            out.println(files.length + " files found!");

            //            we would like to see those files!! with a for loop
            for(int i = 0; i < files.length; i++) {

                System.out.println(files[i]);
            }

        } else {
//      we are going to be said
            System.out.println("Directory dose exist!!!");
        }
    }

}