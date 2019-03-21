/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitscalc;

import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author DaDa
 */
public class startWin extends JFrame{
 JButton start;
        startWin(){
            JFrame g = new JFrame();
            FlowLayout layout = new FlowLayout();
          
            start = new JButton("Start");
            g.add(start);
            g.setLayout(layout);
          
            g.setVisible(true);
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
