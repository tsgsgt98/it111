import javax.swing. *;

public class ShowWindow {

    public static void main(String[] args) {
    // declare our variables
    // we are going to make them CONSTANTS

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 250;
    // Create a window, How do we create a window? see below
        JFrame window = new JFrame();
        // set the title (this Object has the Title)
    //   Scanner input =  new Scanner (System.in);
        window.setTitle("My Simple Window");
//How about the setting of the size of our windows -this object has a size

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//        close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//   DON'T FORGET to display the window finally - if we do not display the window, it will not display!
//    displaying the window is a boolean

    window.setVisible(true);

    }
}
