
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chessboard extends JFrame {

    JFrame f = new JFrame("chess board");
    JPanel p = new JPanel();
    
    ImageIcon ibking = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black king.png");
    ImageIcon ibqueen = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black queen.png");
    ImageIcon ibcamel = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black camel.png");
    ImageIcon ibhorse = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black horse.png");
    ImageIcon ibelephant = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black elephant.png");
    ImageIcon ibsoilder = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\black soilder.png");  
    
    ImageIcon iwking = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white king.png");
    ImageIcon iwqueen = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white queen.png");
    ImageIcon iwcamel = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white camel.png");
    ImageIcon iwhorse = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white horse.png");
    ImageIcon iwelephant = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white elephant.png");
    ImageIcon iwsoilder = new ImageIcon("C:\\Users\\Kejariwal\\Desktop\\chess pieses\\white soilder.png");  
    
    
    JButton wKing = new JButton(iwking);
    JButton wQueen = new JButton(iwqueen);
    JButton wCamel1 = new JButton(iwcamel);
    JButton wHorse1 = new JButton(iwhorse);
    JButton wElephant1 = new JButton(iwelephant);
    JButton wCamel2 = new JButton(iwcamel);
    JButton wHorse2 = new JButton(iwhorse);
    JButton wElephant2 = new JButton(iwelephant);
    
    JButton bKing = new JButton(ibking);
    JButton bQueen = new JButton(ibqueen);
    JButton bCamel1 = new JButton(ibcamel);
    JButton bHorse1 = new JButton(ibhorse);
    JButton bElephant1 = new JButton(ibelephant);
    JButton bCamel2 = new JButton(ibcamel);
    JButton bHorse2 = new JButton(ibhorse);
    JButton bElephant2 = new JButton(ibelephant);

        
    JButton b2[] = new JButton[8] ;
    JButton b7[] = new JButton[8] ;
    
    JButton b3[] = new JButton[8];
    JButton b4[] = new JButton[8];
    JButton b5[] = new JButton[8];
    JButton b6[] = new JButton[8];
    
    
    public static void main(String[] args){
        new chessboard();

    }
    public chessboard(){
        super("chessboard");

        setSize(625,650);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p);

        p.setLayout(null);
        for(int i = 0; i<8;i++)
        {
            b2[i] = new JButton(iwsoilder);
            p.add(b2[i]);
            b2[i].setBounds(i*75,75,75,75);
            
            
            b3[i] = new JButton();
            p.add(b3[i]);
            b3[i].setBounds(i*75,150,75,75);
            b4[i] = new JButton();
            p.add(b4[i]);
            b4[i].setBounds(i*75,225,75,75);
            b5[i] = new JButton();
            p.add(b5[i]);
            b5[i].setBounds(i*75,300,75,75);
            b6[i] = new JButton();
            p.add(b6[i]);
            b6[i].setBounds(i*75,375,75,75);
            
            b7[i] = new JButton(ibsoilder);
            p.add(b7[i]);
            b7[i].setBounds(i*75,450,75,75);
            
        }
        
        p.add(wElephant1);
        wElephant1.setBackground(Color.gray);
        p.add(wHorse1);
        wHorse1.setBackground(Color.white);
        p.add(wCamel1);
        wCamel1.setBackground(Color.gray);
        p.add(wKing);
        wKing.setBackground(Color.white);
        p.add(wQueen);
        wQueen.setBackground(Color.gray);
        p.add(wCamel2);
        wCamel2.setBackground(Color.white);
        p.add(wHorse2);
        wHorse2.setBackground(Color.gray);
        p.add(wElephant2);
        wElephant2.setBackground(Color.white);
        
        
        wElephant1.setBounds(0,0,75,75);
        wHorse1.setBounds(75,0,75,75);
        wCamel1.setBounds(150,0,75,75);
        wKing.setBounds(225,0,75,75);
        wQueen.setBounds(300,0,75,75);
        wCamel2.setBounds(375,0,75,75);
        wHorse2.setBounds(450,0,75,75);
        wElephant2.setBounds(525,0,75,75);
        
        for(int j=0;j<8;j++){
        	if((j+1)%2==0){
        		b2[j].setBackground(Color.gray);
        		b3[j].setBackground(Color.white);
        		b4[j].setBackground(Color.gray);
        		b5[j].setBackground(Color.white);
    			b6[j].setBackground(Color.gray);
    			b7[j].setBackground(Color.white);
        	}
        	else{
        		b2[j].setBackground(Color.white);
        		b4[j].setBackground(Color.white);
        		b3[j].setBackground(Color.gray);
        		b6[j].setBackground(Color.white);
    			b5[j].setBackground(Color.gray);
    			b7[j].setBackground(Color.gray);
        	}
        }


        p.add(bElephant1);
        bElephant1.setBackground(Color.white);
        p.add(bHorse1);
        bHorse1.setBackground(Color.gray);
        p.add(bCamel1);
        bCamel1.setBackground(Color.white);
        p.add(bKing);
        bKing.setBackground(Color.white);
        p.add(bQueen);
        bQueen.setBackground(Color.gray);
        p.add(bCamel2);
        bCamel2.setBackground(Color.gray);
        p.add(bHorse2);
        bHorse2.setBackground(Color.white);
        p.add(bElephant2);
        bElephant2.setBackground(Color.gray);
        
        

        bElephant1.setBounds(0,525,75,75);
        bHorse1.setBounds(75,525,75,75);
        bCamel1.setBounds(150,525,75,75);
        bQueen.setBounds(225,525,75,75);
        bKing.setBounds(300,525,75,75);
        bCamel2.setBounds(375,525,75,75);
        bHorse2.setBounds(450,525,75,75);
        bElephant2.setBounds(525,525,75,75);

    }
}
