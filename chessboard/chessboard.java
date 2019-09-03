
import javax.swing.*;
import java.awt.*;

public class chessboard extends JFrame{

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

        
    JButton wsoilder[] = new JButton[8] ;
    JButton bsoilder[] = new JButton[8] ;
    
    JButton blank1[] = new JButton[8];
    JButton blank2[] = new JButton[8];
    JButton blank3[] = new JButton[8];
    JButton blank4[] = new JButton[8];
    
    
    public static void main(String[] args){
        new chessboard();

    }
    public chessboard(){
        super("chessboard");

        setSize(650,650);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p);

        p.setLayout(null);
        for(int i = 0; i<8;i++)
        {
            wsoilder[i] = new JButton(iwsoilder);
            p.add(wsoilder[i]);
            wsoilder[i].setBounds(i*75,75,75,75);
            
            
            blank1[i] = new JButton();
            p.add(blank1[i]);
            blank1[i].setBounds(i*75,150,75,75);
            blank2[i] = new JButton();
            p.add(blank2[i]);
            blank2[i].setBounds(i*75,225,75,75);
            blank3[i] = new JButton();
            p.add(blank3[i]);
            blank3[i].setBounds(i*75,300,75,75);
            blank4[i] = new JButton();
            p.add(blank4[i]);
            blank4[i].setBounds(i*75,375,75,75);
            
            bsoilder[i] = new JButton(ibsoilder);
            p.add(bsoilder[i]);
            bsoilder[i].setBounds(i*75,450,75,75);
            
        }
        
        p.add(wElephant1);
        p.add(wHorse1);
        p.add(wCamel1);
        p.add(wKing);
        p.add(wQueen);
        p.add(wCamel2);
        p.add(wHorse2);
        p.add(wElephant2);
        
        

        wElephant1.setBounds(0,0,75,75);
        wHorse1.setBounds(75,0,75,75);
        wCamel1.setBounds(150,0,75,75);
        wKing.setBounds(225,0,75,75);
        wQueen.setBounds(300,0,75,75);
        wCamel2.setBounds(375,0,75,75);
        wHorse2.setBounds(450,0,75,75);
        wElephant2.setBounds(525,0,75,75);
        
        
        p.add(bElephant1);
        p.add(bHorse1);
        p.add(bCamel1);
        p.add(bKing);
        p.add(bQueen);
        p.add(bCamel2);
        p.add(bHorse2);
        p.add(bElephant2);
        
        

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