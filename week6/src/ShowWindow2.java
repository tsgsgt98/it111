import javax.lang.model.element.Name;
import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 500;
        final int WINDOW_HEIGHT = 600;
        // Create a window
        JFrame window = new JFrame();
        JLabel myLabel1, myLabel2;
        JTextField myTextField1, myTextField2;

//        set the title of the window
         window.setTitle("A Simple Window2");
 //    setting the size of my windows
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.getContentPane().setBackground(Color.red);
        window.setLocation(580,100);
//        close the window and exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myLabel1 = new JLabel ("My First Big Label!!!");
        myLabel1.setBounds(45,45,600,25);
        myLabel1.setFont(new Font("TimesNewRoman", Font.PLAIN,18));
        window.add(myLabel1);
        myLabel2 = new JLabel ("My Second Big Label!");
        myLabel2.setBounds(45,140,600,25);
        myLabel2.setFont(new Font("TimesNewRoman", Font.BOLD,17));
        window.add(myLabel2);

        myTextField1 = new JTextField();
        myTextField1.setBounds(50,75,370, 35);
        window.add(myTextField1);
        myTextField2 = new JTextField();
        myTextField2.setBounds(50,175,370, 35);
        window.add(myTextField2);

//   display the window - if we do not display the window, it will not display!
//    displaying the window is a boolean
        window.setLayout(null);
        window.setVisible(true);

    }
}
