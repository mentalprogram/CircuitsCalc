# CircuitsCalc
Circuits Calculator application first code

This is an application that will allow the user to quickly do calculations for electric circuits. This is the first piece of code, it
allows the user to do calutions for Ohm's law. I intend to have the program in the future to be able to the calculations for all 
components of electric circuits. The targeted audience for the application are beginner electricians, students, novice, etc.


Ohm's Law
- I = V/R
- R = R/I
- V = R*I

It askes the user to input the which of the variables they have. It then calulates the missing variable. I have a bug that i'm not 
entirely sure how to overcome. The program crashes when trying to taking inputs when one text field has no input entered. 


import java.awt.FlowLayout; 
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;                         #These are The java Built-in classes that are used in the code
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




package circuitscalc;

*
 *The Circuits Calculator program is an 
 *application that does the math for ohm's law

*@Circuits Calculator
 *@author Da'vontae West   
 *@version 1.0
 *@since 2019-02-26
 *@Circuits Calculator
 * 
 */
public class CircuitsCalc {

      /* This is the main method of the program that obtains an object to the startWin class.
       * This method starts the program displaying a Window that has a button component labeled "start"
       */
      public static void main(String[] args) { 
        new startWin();       
    }
    
    
}


      /*this is the "startWin" class.
       *In this class the window that is displayed by the main methods object to this class is created.
       */

public class startWin extends JFrame{         /*here is where the class starts and inherits the components of the class import 
                                              "javax.swing.JFrame"*/

JButton start;                                 /*initializing the start button that is displayed on the window */
        
        startWin(){                            /* the main method of this class that holds the objects neccesary to create the window*/
            
            JFrame g = new JFrame();           /*this is the object that is called from the JFrame class that is the frame for the 
                                                 the window the contains the maximum, minimum, and exit buttons*/
           
           
           FlowLayout layout = new FlowLayout();  /*this is an object of the import class "java.awt.FlowLayout" that puts componets in 
                                                    in a left to right flow*/
          
            start = new JButton("Start");         /* this is the object of the the "JButton" import that creates the "Start" button 
                                                   displayed on the window*/
            
            g.add(start);                        /*this adds the "start" button component to the window*/
            
            g.setLayout(layout);                 /*this set the "FlowLayout" as the layout for the components in the frame*/
          
          
            g.setVisible(true);                  /* */
            
            g.setSize(500, 400);
            g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
            stepHandler starB = new stepHandler();
            start.addActionListener(starB);
            
            
            
        }
}
     
    
    
    
    
    class stepHandler implements ActionListener {
          
        
        public void actionPerformed(ActionEvent c){
          
            new InpOutP(); 
        }
    }

