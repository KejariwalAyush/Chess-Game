import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;  
  
 class chessboard2 implements ActionListener //, MouseMotionListener
 {  
JFrame f; 
 //b[row][column] 
JButton b[][]=new JButton[8][8];  
JButton src = new JButton();
JButton temp = new JButton();
JButton src2 = new JButton();
JButton blank = new JButton();

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
//f.addMouseListener();
    f=new JFrame(); 

    //b[row][column] 
      
     
             
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
            
            b[i][j].addActionListener(this);

        }


    }  
  
    f.setLayout(new GridLayout(8,8));  
    //setting grid layout of 8 rows and 8 columns  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(700,700);  
    f.setVisible(true); 

    for(int k=0;k<8;k++){
    	b[2][k].setText("");
    	b[3][k].setText("");
    	b[4][k].setText("");
    	b[5][k].setText("");

    	b[1][k].setText("b");
    	b[0][k].setText("b");
    	b[6][k].setText("w");
    	b[7][k].setText("w");

        b[1][k].setIcon(ibsoilder);
        b[6][k].setIcon(iwsoilder);
    }

    //b[row][column] 
    b[0][3].setText("bk");
    b[0][4].setText("bq");
    b[7][3].setText("wq");
    b[7][4].setText("wk");

   
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

int x,y,cnt=0;
int input=2;

public void actionPerformed(ActionEvent e)
{
	if(e.getSource() instanceof JButton)
	{
		src = (JButton) e.getSource();

	}
	if(cnt==0 && src.getText()!="")
	{
		temp.setIcon(src.getIcon());
		temp.setText(src.getText());
		src.setIcon(null);
		src.setText("");
		cnt++;
	}
	else
	{
		src2.setIcon(src.getIcon());
		src2.setText(src.getText());
		if(src2.getText()!=temp.getText())
		{
			src.setIcon(temp.getIcon());
			src.setText(temp.getText());
		}
		temp.setIcon(null);
		temp.setText("");
		cnt=0;
	}


	if(src2.getText()=="wk"||src2.getText()=="bk")
	{

			input = JOptionPane.showConfirmDialog(f, (src2.getText().charAt(0))+" want to restart?");
			if(input == 1)System.exit(0);
			else if(input == 0)restart();
			
	}
	//if(src.getIcon().equals(ibsoilder)){
	//	b[x+1][y].setIcon(ibsoilder);
	//	src.setIcon(null);
	//}
}

	// getX() and getY() functions return the 
    // x and y coordinates of the current 
    // mouse position 
    // getClickCount() returns the number of 
    // quick consecutive clicks made by the user 

/*public void mousePressed(MouseEvent e){
	
	int x=e.getX();
	int y=e.getY();
	b[x][y].setBackground(Color.yellow);

	for(int a=0;a<8;a++){
	if(b[x][y]==b[1][a])
		b[2][a].setBackground(Color.pink);

	}
	//b[1][1].setText("hey");
	}*/

	public void restart()
	{
		new chessboard2();
	}
}  

