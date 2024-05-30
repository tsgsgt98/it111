import java.io.File;

public class MyFile {

    public static void main(String[] args) {
//        we are going to create a file object
        File dir = new File("./NewFolder");
//        File dir = new File("./Users/SelamawitGT/IdeaProjects/week7/NewFolder");

//        create an ijf else state = if the directory exists, yappy skippy
//        else, not a good thing

        if(dir.exists()) {
            System.out.println("Yippy, we have a directory");

        } else {
            System.out.println(" we are lost in space, don't know where that directory is?");
            }
        }
    }


