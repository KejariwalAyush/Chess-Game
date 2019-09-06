import java.awt.*;  
import javax.swing.*;  
  
public class chessboard2{  
JFrame f;  
chessboard2(){  
    f=new JFrame();  
      
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
    //setting grid layout of 3 rows and 3 columns  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(600,600);  
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
    }


   // f.rotate(); 
}  

public static void main(String[] args) {  
    new chessboard2();  
}  
}  