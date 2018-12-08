
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TheWindow extends JFrame{
    
    private JTextField display;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    public TheWindow(){
        
        Container contentPane = getContentPane();
        display = new JTextField("Hello, World!!! Welcome to my First Project");
        contentPane.add("Center", display);
        
        button1 = new JButton("First Sentence");
        button2 = new JButton("Second Sentence");
        button3 = new JButton("Last Sentence");
        
        ButtonObserver MyObserver = new ButtonObserver();
        button1.addActionListener(MyObserver);
        button2.addActionListener(MyObserver);
        button3.addActionListener(MyObserver);
        
        JPanel southPanel = new JPanel();
        southPanel.add(button1);
        southPanel.add(button2);
        southPanel.add(button3);
        contentPane.add("South", southPanel);
        
    }

    private class ButtonObserver implements ActionListener
    
    { 
        @Override
        public void actionPerformed(ActionEvent a){
            if(a.getSource() == button1){
                display.setText("This is my very first Project");
            }
            else if(a.getSource()== button2){
                display.setText("I'm very excited about Java Programming Language. ");
            }
            else if(a.getSource()== button3){
                display.setText("I hope you're excited too.");
            }
        }
    }
}