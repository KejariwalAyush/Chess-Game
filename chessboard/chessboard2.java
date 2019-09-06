import java.awt.*;  
import javax.swing.*;  
  
public class chessboard2{  
JFrame f;  

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
    


chessboard2(){  
    f=new JFrame(); 

    //b[row][column] 
      
    JButton b[][]=new JButton[8][8];  
             
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            b[i][j] = new JButton();
            f.add(b[i][j]);
            
            if((j+1)%2==0 && (i+1)%2==0) 
                b[i][j].setBackground(Color.gray);
            else if((j+1)%2!=0 && (i+1)%2!=0)
                b[i][j].setBackground(Color.gray);
            else
                b[i][j].setBackground(Color.white);
            


        }


    }  
  
    f.setLayout(new GridLayout(8,8));  
    //setting grid layout of 8 rows and 8 columns  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(700,700);  
    f.setVisible(true); 

    b[0][0].setText("b rook");
    b[0][7].setText("b rook");
    b[0][1].setText("b knight");
    b[0][6].setText("b knight");
    b[0][2].setText("b bishop");
    b[0][5].setText("b bishop");
    b[0][3].setText("b king");
    b[0][4].setText("b queen");

    b[7][0].setText("w rook");
    b[7][7].setText("w rook");
    b[7][1].setText("w knight");
    b[7][6].setText("w knight");
    b[7][2].setText("w bishop");
    b[7][5].setText("w bishop");
    b[7][4].setText("w king");
    b[7][3].setText("w queen");

    for(int k=0;k<8;k++){
        b[1][k].setText("b Pawn");
        b[6][k].setText("w Pawn");
        b[1][k].setIcon(ibsoilder);
        b[6][k].setIcon(iwsoilder);
    }

    //b[row][column] 
   
    b[7][4].setIcon(iwking);
    b[7][3].setIcon(iwqueen);
    b[7][2].setIcon(iwcamel);
    b[7][1].setIcon(iwhorse);
    b[7][0].setIcon(iwelephant);
    b[7][5].setIcon(iwcamel);
    b[7][6].setIcon(iwhorse);
    b[7][7].setIcon(iwelephant);
    
    b[0][3].setIcon(ibking);
    b[0][4].setIcon(ibqueen);
    b[0][2].setIcon(ibcamel);
    b[0][1].setIcon(ibhorse);
    b[0][0].setIcon(ibelephant);
    b[0][5].setIcon(ibcamel);
    b[0][6].setIcon(ibhorse);
    b[0][7].setIcon(ibelephant);
}  

public static void main(String[] args) {  
    new chessboard2();  
}  
}  