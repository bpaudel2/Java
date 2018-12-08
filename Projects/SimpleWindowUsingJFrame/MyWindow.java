
import javax.swing.JFrame;


public class MyWindow {
    public static void main(String[] args){
        TheWindow window = new TheWindow();
        window.setSize(700,500);
        window.setLocation(300,300);
        window.setTitle("My First Project");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
