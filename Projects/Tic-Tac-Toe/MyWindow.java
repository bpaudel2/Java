
import javax.swing.JFrame;


public class MyWindow {
    public static void main(String args[]){
        TheWindow window = new TheWindow();
        window.setSize(500,500);
        window.setLocation(100,100);
        window.setTitle("TIC-TAC-TOE");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
