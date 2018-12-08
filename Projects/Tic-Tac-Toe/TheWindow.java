
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class TheWindow  extends JFrame{
    //private data members.
    private final JTextField display;
    private final JButton [] buttons = new JButton[9];
    private String turn ="O";
    private int emptyButtons = 9;
 
    //Constructor for Game Window.
    public TheWindow(){
        Container contentPane = getContentPane();
        display = new JTextField("Play Tic-Tac-Toe: O's turn !");
        Font font = new Font("Courier New", Font.BOLD, 18);
        display.setFont(font);
        display.setEditable(false);
        contentPane.add("North", display);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,3));
        contentPane.add("Center", centerPanel);
        Font buttonFont = new Font(" Courier New", Font.BOLD, 40);
        
        ButtonListener MyListener = new ButtonListener();
        for(int i=0; i<9; i++){
            buttons[i] = new JButton(" ");
            buttons[i].setFont(buttonFont);
            centerPanel.add(buttons[i]);
            buttons[i].addActionListener(MyListener);
        }  
    }

    //Private class responsible for Listening events for buttons
    private class ButtonListener implements ActionListener{ 

        @Override
        public void actionPerformed(ActionEvent a){
            Object source = a.getSource();
            for(int i=0; i<9; i++){
                if(buttons[i]==source){
                    buttons[i].setEnabled(false);
                    //Initially turn is 'O'
                    buttons[i].setText(""+turn);
                    
                    if(turn.equals("O")){
                        turn ="X";
                    }
                    else{
                        turn = "O";
                    }
                    
                }
            }
            display.setText(""+ turn +"'s turn.");
            //Decrementing Cells for play
            emptyButtons--;
            if (isOver()){
                for(int i=0; i<9;i++){
                    buttons[i].setEnabled(false);
                }
                
            }
        }

    }
   

    private boolean isOver(){
       //An array "c" is defined to store the character at each buttons of JButtons
       //of buttons array. Using short name "c" is making if else statement readable. 
       char [] c = new char[9];
       //Initially none is winner.
       char winner =' ';
       for(int i=0; i<9;i++){
           c[i]= buttons[i].getText().charAt(0);
       }
       
        if(((c[0] !=' ') && (c[0] == c[1]) && (c[1]==c[2])) || ((c[0] !=' ') && (c[0] == c[4]) && (c[4]==c[8])) 
            || ((c[0] !=' ') && (c[0] == c[3]) && (c[3]==c[6]))){
            winner = c[0];
            display.setText("Game Over: Winner is "+ winner+ "!!!");
            return true;
        }
        else if( ((c[8] !=' ') && (c[8] == c[7]) && (c[7]==c[6])) ||  ((c[8] !=' ') && (c[8] == c[2]) && (c[2]==c[5]))   ){
            winner = c[8];
            display.setText("Game Over: Winner is "+winner+ "!!!");
            return true;
        }
        else if(  ((c[4] !=' ') && (c[4] == c[3]) && (c[3]==c[5]))  || ((c[4] !=' ') && (c[4] == c[1]) && (c[1]==c[7]))
                || ((c[4] !=' ') && (c[4] == c[2]) && (c[2]==c[6]))){
            winner = c[4];
            display.setText("Game Over: Winner is "+winner+ "!!!");
            return true;
        }
        if(emptyButtons == 0){
            display.setText("Game Over: Draw - No Winner !!!");
            return true;
        }
 
        return false;
    }
     
}