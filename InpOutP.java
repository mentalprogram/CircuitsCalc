/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitscalc;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author DaDa
 */
public class InpOutP extends Frame implements ActionListener {
 JButton res, cur, volt;
    JLabel resistor1, voltageR, currentR;
    JTextField tresistor1,tvoltageR, tcurrentR, answerR;
    InpOutP (){
        
        JFrame f = new JFrame("Circuits Calculator");
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,2)); 
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p2.setLayout(layout);
        p3.setLayout(layout);
       
                
        resistor1 = new JLabel("Resistance ");
        tresistor1 = new JTextField(20);
        
        voltageR= new JLabel("Voltage: ");
        tvoltageR = new JTextField(20);
        
        currentR = new JLabel("Current: ");
        tcurrentR = new JTextField(20);
        
        answerR = new JTextField();
        answerR.setBounds(50,150,150,20);
        answerR.setEditable(false);
        
        cur = new JButton("Current");
        
        res = new JButton("Resistance");
        
        volt = new JButton("Voltage");
        
  
     
        
        p1.add(resistor1);
        p1.add(tresistor1);
        p1.add(voltageR);
        p1.add(tvoltageR);
        p1.add(currentR);
        p1.add(tcurrentR);
        p1.add(answerR);
        
        p2.add(cur);
        cur.addActionListener(this);
        p2.add(res);
        res.addActionListener(this);
        p2.add(volt); 
        volt.addActionListener(this);
        
        
        
        f.add(p1, "North");
        f.add(p2, "South");
        
        f.setVisible(true);
        f.setSize(500, 400);
    }
    
    public void actionPerformed(ActionEvent r){
        String r1= tresistor1.getText();
       
        String vR = tvoltageR.getText();
        String cR = tcurrentR.getText();
        
        int r1t = Integer.parseInt(r1);
      
        int vrt = Integer.parseInt(vR);
        int crt = Integer.parseInt(cR);
        
        int r1a = 0;
        if(r.getSource()== cur){
        r1a = vrt / r1t ;
        
        
        }
        else if(r.getSource()== res){
        r1a = vrt / crt ;
        }
        else if (r.getSource()== volt){
        r1a = r1t * crt;
        
        }else if (r.getSource()== cur){
        r1a = vrt / r1t;
        }
        
        
        
        String result = String.valueOf(r1a);
        answerR.setText(result);
    }
    
}