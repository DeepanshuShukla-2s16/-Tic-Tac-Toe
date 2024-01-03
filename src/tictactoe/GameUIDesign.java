package tictactoe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GameUIDesign {
    JFrame frame;
    JButton b11,b12,b13,b21,b22,b23,b31,b32,b33;
    GameUIDesign(){
        frame = new JFrame("Tic Tac Toe Game");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        Container c = frame.getContentPane();
        c.setBackground(Color.gray);
      
        
        Font f = new Font("lato",Font.PLAIN,100) ;
        
        GameCode coding = new GameCode(this);
        
        b11 = new JButton();
        b11.setFont(f);
        b11.addActionListener(coding);
        
        b12 = new JButton();
        b12.setFont(f);
        b12.addActionListener(coding);
        
        b13 = new JButton();
        b13.setFont(f);
        b13.addActionListener(coding);
        
        b21 = new JButton();
        b21.setFont(f);
        b21.addActionListener(coding);
        
        b22 = new JButton();
        b22.setFont(f);
        b22.addActionListener(coding);
        
        b23 = new JButton();
        b23.setFont(f);
        b23.addActionListener(coding);
        
        b31 = new JButton();
        b31.setFont(f);
        b31.addActionListener(coding);
        
        b32 = new JButton();
        b32.setFont(f);
        b32.addActionListener(coding);
        
        b33 = new JButton();
        b33.setFont(f);
        b33.addActionListener(coding);        
        
        GridLayout g = new GridLayout(3,3,5,5);
        c.setLayout(g);
       
        c.add(b11);
        c.add(b12);
        c.add(b13);
        
        c.add(b21);
        c.add(b22);
        c.add(b23);
        
        c.add(b31);
        c.add(b32);
        c.add(b33);
          
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
