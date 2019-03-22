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
entirely sure how to overcome. The program crashes when trying to taking inputs when a text field has no input entered. 


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





JButton start;                                 /*declares the variable used to represent the "start" button that is displayed on the 
                                                window */
        
        startWin(){                            /* the main method of this class that holds the objects neccesary to create the window*/
            
            JFrame g = new JFrame();           /*this is the object that is called from the JFrame class that is the frame for the 
                                                 the window the contains the maximum, minimum, and exit buttons initialized the variable
                                                 variable "g" that represents the window*/
           
           
           FlowLayout layout = new FlowLayout();  /*this is an object of the import class "FlowLayout" that puts componets in 
                                                    in a left to right flow*/
          
            start = new JButton("Start");         /* this is the object of the the "JButton" import that creates the "Start" button 
                                                   displayed on the window that is declared by the "start* variable/
            
            g.add(start);                        /*this adds the "start" button component to the window*/
            
            g.setLayout(layout);                 /*this set the "FlowLayout" as the layout for the components in the frame*/
          
          
            g.setVisible(true);                  /*this allows the window to be visible on the screen */
            
            g.setSize(500, 400);                 /*this diclares the default size of the window*/
            
            g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   /*this allows the program to close when the exit button is pressed*/
        
            stepHandler starB = new stepHandler();        /*this is an object of the stephandler class declaring a the variable "startB" 
                                                            to represent the class. */
            
            start.addActionListener(starB);                /*this adds an listener to listen for when the "Start" button is pressed*/
            
            
            
        }
}
     

    class stepHandler implements ActionListener {        /*this is the "stephandler" class that inherits the compnenets of the java 
                                                           built- in class "ActionListener" that handle the action that happen when the 
                                                           "Start" Button is pressed*/
          
        
        public void actionPerformed(ActionEvent c){     /*this is the method of the stephandler class that enacts the action when the 
                                                            "Start" is pressed */
          
            new InpOutP();                            /*this the object of the "InpOuP" that creates the window with the components to 
                                                       do calculation that is displayed when the "start" button is pressed */
        }
    }
    
    /*  this is the "InpOutP" class.
    in this calss the window that is displayed when the "Start" button is pressed is created along with the componenets found in the 
    window* /
   
   public class InpOutP extends Frame implements ActionListener {     /*this is the last class of the program that inherits components 
                                                                        of the java built-in classes "Frame" and "Actionlistner."*/



    JButton res, cur, volt;                                  /* declares the component variables that represent textfields, buttons, 
    JLabel resistor1, voltageR, currentR;                     * and labels.
    JTextField tresistor1,tvoltageR, tcurrentR, answerR;      */
    
    InpOutP (){                                               /* this is the method that holds the objects nessacary to create the 
                                                                  window and components found in it*/
        
        JFrame f = new JFrame("Circuits Calculator");         /*Object for the window that declares "f" as the varible to represent it*/
        
        JPanel p1 = new JPanel();                             /*object of the built-in java class "JPanel" that creates a panel on the 
                                                                window that declares "p1" as a variable to represent it. This will be 
                                                                the panel to house the textfields and thier labels */
        
        p1.setLayout(new GridLayout(4,2));                    /* this sets the layout of the "p1" panel to a gridlayout of 4x2 while 
                                                                  also creating an object of the Java built-in class that is imported 
                                                                  "Gridlayout."*/
        
        FlowLayout layout = new FlowLayout();                 /*this creates an object of the java built-in class "flowlayout" and 
                                                                declares a variable to represent it*/ 
        
        JPanel p2 = new JPanel();                             /*this is an object for a new panel, and sets the layout to the Flowlayout 
             p2.setLayout(layout);                             *variable. This panel will house the buttons
                                                               */
       
       
                
        resistor1 = new JLabel("Resistance ");               /*
        tresistor1 = new JTextField();                        *
                                                              *These are the objects of the textfields, and labels.
        voltageR= new JLabel("Voltage: ");                    *Here is where the labels are assigned text. 
        tvoltageR = new JTextField();                         *
                                                              *
        currentR = new JLabel("Current: ");                   *
        tcurrentR = new JTextField();                         */
                                                             
        answerR = new JTextField();                          /*Here an object is created for the answer text field that is on the 
        answerR.setBounds(50,150,150,20);                     *window. It sets the dimensions of the field, and declares it undeditable
        answerR.setEditable(false);                           */
        
        cur = new JButton("Current");                        /* 
                                                              *Here are the objects for the buttons.
        res = new JButton("Resistance");                      *The buttons are assigned text.
                                                              *    
        volt = new JButton("Voltage");                        */    
        
  
     
        
        p1.add(resistor1);                                  /*
        p1.add(tresistor1);                                  *
        p1.add(voltageR);                                    * This is how the textfield and thier labels are housed in the 
        p1.add(tvoltageR);                                   *"p1" panel.
        p1.add(currentR);                                    *
        p1.add(tcurrentR);                                   *
        p1.add(answerR);                                     */
        
        
        p2.add(cur);                                        /*
        cur.addActionListener(this);                         *
        p2.add(res);                                         *This is how the buttons are housed in the "p2" panel. Each button is 
        res.addActionListener(this);                         *given an listener.
        p2.add(volt);                                        *
        volt.addActionListener(this);                        */
        
        
        
        f.add(p1, "North");                                 /*this house we house the panels in the window and and set its location
        f.add(p2, "South");                                  */
        
        f.setVisible(true);                                 /*this sets the defualt size and displays the window
        f.setSize(500, 400);                                 */
    }
    
    public void actionPerformed(ActionEvent r){             /* this is the method that enacts the actions for the buttons and 
                                                               textfields. It declares the variable "r" to represent it.*/        
    
    
    
        String r1= tresistor1.getText();                    /*these are objects created to get text from the text fields
                                                             *it declares a variable for each input
        String vR = tvoltageR.getText();                     *
        String cR = tcurrentR.getText();                     */
        
        int r1t = Integer.parseInt(r1);                     /*these are object that change the string in the textfields to integars
                                                             *it declares a variable for each string
        int vrt = Integer.parseInt(vR);                      *
        int crt = Integer.parseInt(cR);                      */
        
        
        int r1a = 0;                                        /*this declares the variable for the textfield inputs*/
        
        
        if(r.getSource()== cur){                            /*
        r1a = vrt / r1t ;                                    *
        }                                                    *here are a set of if-else statements that does a certain equation.  
        else if(r.getSource()== res){                        *the staments askes what button has been clicked and when that certain 
        r1a = vrt / crt ;                                    *button is pressed in does one of the 3 ohm's law equations
        }                                                    *
        else if (r.getSource()== volt){                      *
        r1a = r1t * crt;                                     *
                                                             *
        }else if (r.getSource()== cur){                      *
        r1a = vrt / r1t;                                     *
        }                                                    */
        
        
        
        String result = String.valueOf(r1a);                /* this where a string vareiable is created to obtain the value of the  
                                                             * buttons calcucations. The answer field is set to display the result .
        answerR.setText(result);                             */ 
    }
    
}
