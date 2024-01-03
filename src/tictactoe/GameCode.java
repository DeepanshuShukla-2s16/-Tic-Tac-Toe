
package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GameCode implements ActionListener{
    GameUIDesign frame;
    int check =0;
    public GameCode(GameUIDesign frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         check++;
        //button 11
        if(e.getSource()==frame.b11){
            if(check%2==0)
                frame.b11.setText("0");
            else
                frame.b11.setText("X");
            if(check>4){
                if(frame.b12.getText().equals(frame.b11.getText())){
                    if(frame.b13.getText().equals(frame.b11.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b12.setBackground(Color.red);
                        frame.b13.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b11.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b22.getText().equals(frame.b11.getText())){
                    if(frame.b33.getText().equals(frame.b11.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b11.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b21.getText().equals(frame.b11.getText())){
                    if(frame.b31.getText().equals(frame.b11.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b21.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b11.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }    
            }   
        }
        //button 12
        if(e.getSource()==frame.b12){
            if(check%2==0)
                frame.b12.setText("0");
            else
                frame.b12.setText("X");
            if(check>4){                
                if(frame.b22.getText().equals(frame.b12.getText())){
                    if(frame.b32.getText().equals(frame.b12.getText())){
                        frame.b12.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b32.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b12.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }                
                if(frame.b11.getText().equals(frame.b12.getText())){
                    if(frame.b33.getText().equals(frame.b12.getText())){
                        frame.b12.setBackground(Color.red);
                        frame.b11.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        
                        JOptionPane.showMessageDialog(frame.frame,frame.b12.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }  
            }           
        }
        //button 13
        if(e.getSource()==frame.b13){
            if(check%2==0)
                frame.b13.setText("0");
            else
                frame.b13.setText("X");
            if(check>4){ 
                if(frame.b12.getText().equals(frame.b13.getText())){
                    if(frame.b11.getText().equals(frame.b13.getText())){
                        frame.b13.setBackground(Color.red);
                        frame.b12.setBackground(Color.red);
                        frame.b11.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b13.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b22.getText().equals(frame.b11.getText())){
                    if(frame.b31.getText().equals(frame.b11.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b11.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b23.getText().equals(frame.b11.getText())){
                    if(frame.b33.getText().equals(frame.b11.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b23.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b11.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }         
            }
        }
//        button 21
        if(e.getSource()==frame.b21){
            if(check%2==0)
                frame.b21.setText("0");
            else
                frame.b21.setText("X");
            if(check>4){
                if(frame.b22.getText().equals(frame.b21.getText())){
                    if(frame.b23.getText().equals(frame.b21.getText())){
                        frame.b21.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b23.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b21.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b11.getText().equals(frame.b21.getText())){
                    if(frame.b31.getText().equals(frame.b21.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b21.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b21.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
            }            
        }
//        button 22
        if(e.getSource()==frame.b22){
            if(check%2==0)
                frame.b22.setText("0");
            else
                frame.b22.setText("X");
            if(check>4){
                if(frame.b11.getText().equals(frame.b22.getText())){
                    if(frame.b33.getText().equals(frame.b22.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b22.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b12.getText().equals(frame.b22.getText())){
                    if(frame.b32.getText().equals(frame.b22.getText())){
                        frame.b12.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b32.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b22.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b13.getText().equals(frame.b22.getText())){
                    if(frame.b31.getText().equals(frame.b22.getText())){
                        frame.b13.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b22.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b23.getText().equals(frame.b22.getText())){
                    if(frame.b21.getText().equals(frame.b22.getText())){
                        frame.b22.setBackground(Color.red);
                        frame.b23.setBackground(Color.red);
                        frame.b21.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b22.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                } 
            }        
        }
//        button 23
        if(e.getSource()==frame.b23){
            if(check%2==0)
                frame.b23.setText("0");
            else
                frame.b23.setText("X");
            if(check>4){
                if(frame.b13.getText().equals(frame.b23.getText())){
                    if(frame.b33.getText().equals(frame.b23.getText())){
                        frame.b23.setBackground(Color.red);
                        frame.b13.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b23.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b22.getText().equals(frame.b23.getText())){
                    if(frame.b21.getText().equals(frame.b23.getText())){
                        frame.b23.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b21.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b23.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }                         
            }
        }
//        button 31
        if(e.getSource()==frame.b31){
            if(check%2==0)
                frame.b31.setText("0");
            else
                frame.b31.setText("X");
            if(check>4){
                if(frame.b21.getText().equals(frame.b31.getText())){
                    if(frame.b11.getText().equals(frame.b31.getText())){
                        frame.b21.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        frame.b11.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b31.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b22.getText().equals(frame.b31.getText())){
                    if(frame.b13.getText().equals(frame.b31.getText())){
                        frame.b31.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b13.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b31.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                    }
                }
                if(frame.b32.getText().equals(frame.b31.getText())){
                    if(frame.b33.getText().equals(frame.b31.getText())){
                        frame.b31.setBackground(Color.red);
                        frame.b32.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b31.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
            }
        }
//        button 32
        if(e.getSource()==frame.b32){
            if(check%2==0)
                frame.b32.setText("0");
            else
                frame.b32.setText("X");
            if(check>4){
                if(frame.b22.getText().equals(frame.b32.getText())){
                    if(frame.b12.getText().equals(frame.b32.getText())){
                        frame.b32.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b12.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b32.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b31.getText().equals(frame.b32.getText())){
                    if(frame.b33.getText().equals(frame.b32.getText())){
                        frame.b32.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        frame.b31.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b32.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                } 
            }
        }
//        button 33
        if(e.getSource()==frame.b33){
            if(check%2==0)
                frame.b33.setText("0");
            else
                frame.b33.setText("X");
            if(check>4){
                if(frame.b32.getText().equals(frame.b33.getText())){
                    if(frame.b31.getText().equals(frame.b33.getText())){
                        frame.b31.setBackground(Color.red);
                        frame.b32.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b33.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b22.getText().equals(frame.b33.getText())){
                    if(frame.b11.getText().equals(frame.b33.getText())){
                        frame.b11.setBackground(Color.red);
                        frame.b22.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b33.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                }
                if(frame.b23.getText().equals(frame.b33.getText())){
                    if(frame.b13.getText().equals(frame.b33.getText())){
                        frame.b13.setBackground(Color.red);
                        frame.b23.setBackground(Color.red);
                        frame.b33.setBackground(Color.red);
                        JOptionPane.showMessageDialog(frame.frame,frame.b33.getText()+" is Win the Game","Winner Message",JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                } 
            }
        }  
    } 
}
