import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;  
  
 class chessboard implements ActionListener //, MouseMotionListener
 {  
JFrame f; 
 //b[row][column] 
JButton b[][]=new JButton[8][8];  
JButton src = new JButton();
JButton temp = new JButton();
JButton src2 = new JButton();
JButton blank = new JButton();
Font font = new Font ("Courier",Font.BOLD,00);
	JMenuBar mb = new JMenuBar();
 	   JMenu file;//rs,ex;
 	   JMenuItem rs,ex;

    ImageIcon ibking = new ImageIcon("chess pieses\\black king.png");
    ImageIcon ibqueen = new ImageIcon("chess pieses\\black queen.png");
    ImageIcon ibcamel = new ImageIcon("chess pieses\\black camel.png");
    ImageIcon ibhorse = new ImageIcon("chess pieses\\black horse.png");
    ImageIcon ibelephant = new ImageIcon("chess pieses\\black elephant.png");
    ImageIcon ibsoilder = new ImageIcon("chess pieses\\black soilder.png");  
    
    ImageIcon iwking = new ImageIcon("chess pieses\\white king.png");
    ImageIcon iwqueen = new ImageIcon("chess pieses\\white queen.png");
    ImageIcon iwcamel = new ImageIcon("chess pieses\\white camel.png");
    ImageIcon iwhorse = new ImageIcon("chess pieses\\white horse.png");
    ImageIcon iwelephant = new ImageIcon("chess pieses\\white elephant.png");
    ImageIcon iwsoilder = new ImageIcon("chess pieses\\white soilder.png");  
    
int i,j,k;
public char col ;

chessboard()
{  

    f=new JFrame("CHESS GAME "); 

    //b[row][column] 
        file = new JMenu("File");
        
        rs = new JMenuItem ("Restart");
        rs.addActionListener(this);
        file.add(rs);
        ex = new JMenuItem("Exit");
        ex.addActionListener(this);
        file.add(ex);
        mb.add(file);
        f.setJMenuBar(mb);
     String list[] = {"white","black"};
     String list1 = (String)JOptionPane.showInputDialog(f,"which color would Player1 like to play with","input",
	                            JOptionPane.QUESTION_MESSAGE,null,list,list[0]);
             
             if(list1=="white")col='w';
             else col='b';
    for(i=0;i<8;i++){
        for(j=0;j<8;j++){
            b[i][j] = new JButton();
            f.add(b[i][j]);
            
            b[i][j].setFont(font);

            if((j+1)%2==0 && (i+1)%2==0) 
                b[i][j].setBackground(Color.gray);
            else if((j+1)%2!=0 && (i+1)%2!=0)
                b[i][j].setBackground(Color.gray);
            else
                b[i][j].setBackground(Color.white);
            
            b[i][j].addActionListener(this);

        }


    }  
    temp.setIcon(null);
    temp.setText(" ");
  
    f.setLayout(new GridLayout(8,8));  
    //setting grid layout of 8 rows and 8 columns  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(700,700);  
    f.setVisible(true); 
    if(col == 'w')
    {
	    for(int k=0;k<8;k++){
	        b[2][k].setText(" ");
	        b[3][k].setText(" ");
	        b[4][k].setText(" ");
	        b[5][k].setText(" ");
	
	        b[1][k].setText("bs");
	        //b[0][k].setText("b");
	        b[6][k].setText("ws");
	        //b[7][k].setText("w");
	
	        b[1][k].setIcon(ibsoilder);
	        b[6][k].setIcon(iwsoilder);
	    }
	
	    //b[row][column] 
	    b[0][0].setText("be");
	    b[0][7].setText("be");
	    b[7][0].setText("we");
	    b[7][7].setText("we");
	    
	    b[0][1].setText("bh");
	    b[0][6].setText("bh");
	    b[7][1].setText("wh");
	    b[7][6].setText("wh");
	
	    b[0][2].setText("bc");
	    b[0][5].setText("bc");
	    b[7][2].setText("wc");
	    b[7][5].setText("wc");
	     
	    
	    
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
	else
	{
		for(int k=0;k<8;k++){
	        b[2][k].setText(" ");
	        b[3][k].setText(" ");
	        b[4][k].setText(" ");
	        b[5][k].setText(" ");
	
	        b[1][k].setText("ws");
	        //b[0][k].setText("b");
	        b[6][k].setText("bs");
	        //b[7][k].setText("w");
	
	        b[1][k].setIcon(iwsoilder);
	        b[6][k].setIcon(ibsoilder);
	    }
	
	    //b[row][column] 
	    b[0][0].setText("we");
	    b[0][7].setText("we");
	    b[7][0].setText("be");
	    b[7][7].setText("be");
	    
	    b[0][1].setText("wh");
	    b[0][6].setText("wh");
	    b[7][1].setText("bh");
	    b[7][6].setText("bh");
	
	    b[0][2].setText("wc");
	    b[0][5].setText("wc");
	    b[7][2].setText("bc");
	    b[7][5].setText("bc");
	     
	    
	    
	    b[0][3].setText("wk");
	    b[0][4].setText("wq");
	    b[7][3].setText("bq");
	    b[7][4].setText("bk");
	
	   
	    b[7][4].setIcon(ibking);
	    b[7][3].setIcon(ibqueen);
	    b[7][2].setIcon(ibcamel);
	    b[7][1].setIcon(ibhorse);
	    b[7][0].setIcon(ibelephant);
	    b[7][5].setIcon(ibcamel);
	    b[7][6].setIcon(ibhorse);
	    b[7][7].setIcon(ibelephant);
	    
	    b[0][3].setIcon(iwking);
	    b[0][4].setIcon(iwqueen);
	    b[0][2].setIcon(iwcamel);
	    b[0][1].setIcon(iwhorse);
	    b[0][0].setIcon(iwelephant);
	    b[0][5].setIcon(iwcamel);
	    b[0][6].setIcon(iwhorse);
	    b[0][7].setIcon(iwelephant);
	}
}  

public static void main(String[] args) {  
    new chessboard();  
}  

int x,y,x1,y1,cnt=0,cnt2=0,count=0;
int input=2,moves=0;
boolean t=false;
Color c = Color.gray;


public void actionPerformed(ActionEvent e)
{
	if(e.getSource() == rs)restart();
    if(e.getSource() == ex)System.exit(0);        
        
    if(e.getSource() instanceof JButton )
    {
        src = (JButton) e.getSource();
    }
	if(src.getText().charAt(0)==temp.getText().charAt(0) && src.getText().charAt(0)!=' ')
	{
		cnt=0;
		for(i=0;i<8;i++){
       		for(j=0;j<8;j++){
						if((j+1)%2==0 && (i+1)%2==0) 
              				b[i][j].setBackground(Color.gray);
          				else if((j+1)%2!=0 && (i+1)%2!=0)
          				    b[i][j].setBackground(Color.gray);
         					else
              				b[i][j].setBackground(Color.white);
               		}
                }
	}

	if(cnt2==0||cnt2==1) 
	{
	  	
	    if(cnt==0 && src.getText()!=" ")//&& ((moves%2==0 && src.getText().charAt(0)=='w')||(moves%2!=0 && src.getText().charAt(0)=='b')))
	    {
	    	if((moves%2==0 && src.getText().charAt(0)=='w'))
	        {
	        	temp.setIcon(src.getIcon());
	        	        temp.setText(src.getText());
	        	        c = src.getBackground();
	        	        src.setBackground(Color.pink);
	        	        
	        	        cnt++;
	        	
	        	        for(i=0;i<8;i++){
	        	        for(j=0;j<8;j++){
	        	            if(e.getSource()==b[i][j])
	        	                {x=i;y=j;}
	        	        }
	        	        }
	        }
	        
	        else if((moves%2!=0 && src.getText().charAt(0)=='b'))
	        {
	        	temp.setIcon(src.getIcon());
	        	        temp.setText(src.getText());
	        	        c = src.getBackground();
	        	        src.setBackground(Color.pink);
	        	        
	        	        cnt++;
	        	
	        	        for(i=0;i<8;i++){
	        	        for(j=0;j<8;j++){
	        	            if(e.getSource()==b[i][j])
	        	                {x=i;y=j;}
	        	        }
	        	        }
	        }
	        else
	        {	
	        	if(moves%2==0)
	        		JOptionPane.showMessageDialog(f,"White's turn");
	        	else
	        		JOptionPane.showMessageDialog(f,"Black's turn");
	        }

	        switch(b[x][y].getText())
	        {
	        	case "ws": dwSoilder(x,y);
	        				
	        		break;
	        	case "bs": dbSoilder(x,y);
	        				
	        		break;
	
	        	case "bk":
	            case "wk": dKing(x,y);
	                break;  
	            case "bq":
	            case "wq": dQueen(x,y);
	                break;      	
	        	case "be":
	        	case "we": dElephant(x,y);
	        		break;	
	
	        	case "wh":
	        	case "bh": dHorse(x,y);
	        		break;
	        	case "wc":
	        	case "bc": dCamel(x,y);
	        		break;	
	        		
	        	default : t=false;
	        	
	
	        }
	    }
	    else
	    {

	        src2.setIcon(src.getIcon());
	        src2.setText(src.getText());
	        for(i=0;i<8;i++){
	        for(j=0;j<8;j++){
	            if(e.getSource()==b[i][j])
	                {x1=i;y1=j;}
	        }
	        }
	        switch(temp.getText())
	        {
	        	case "ws": t = wSoilder(x,y,x1,y1);
	        				
	        		break;
	        	case "bs": t = bSoilder(x,y,x1,y1);
	        				
	        		break;
	
	        	case "bk":
	            case "wk": t = King(x,y,x1,y1);
	                break;  
	            case "bq":
	            case "wq": t = Queen(x,y,x1,y1);
	                break;      	
	        	case "be":
	        	case "we": t = Elephant(x,y,x1,y1);
	        		break;	
	
	        	case "wh":
	        	case "bh": t = Horse(x,y,x1,y1);
	        		break;
	        	case "wc":
	        	case "bc": t = Camel(x,y,x1,y1);
	        		break;	
	        		
	        	default : t=false;
	        	
	
	        }
	
	        if(t) 
	        {
	        	
	
	        		if(src2.getText().charAt(0)!=temp.getText().charAt(0))
	        		{
	        			moves++;
	        		    src.setIcon(temp.getIcon());
	       		        src.setText(temp.getText());
	        		    b[x][y].setText(" ");
	        		    b[x][y].setIcon(null);
	        		    
	        		}
	        		for(i=0;i<8;i++){
        				for(j=0;j<8;j++){
							if((j+1)%2==0 && (i+1)%2==0) 
                				b[i][j].setBackground(Color.gray);
            				else if((j+1)%2!=0 && (i+1)%2!=0)
            				    b[i][j].setBackground(Color.gray);
           					else
                				b[i][j].setBackground(Color.white);
                		}
                	}


	        }
	        else
	        {

	        	for(i=0;i<8;i++){
        				for(j=0;j<8;j++){
							if((j+1)%2==0 && (i+1)%2==0) 
                				b[i][j].setBackground(Color.gray);
            				else if((j+1)%2!=0 && (i+1)%2!=0)
            				    b[i][j].setBackground(Color.gray);
           					else
                				b[i][j].setBackground(Color.white);
                		}
                	}
	        	JOptionPane.showMessageDialog(f,"invalid move !");
	        }
	
	        if(src2.getText()=="wk" && temp.getText().charAt(0) !='w' && t)
	        {
	    
	                input = JOptionPane.showConfirmDialog(f, "black won \n want to restart?");
	                if(input == 1)System.exit(0);
	                else if(input == 0)restart();
	                
	        }
	        else if(src2.getText()=="bk" && temp.getText().charAt(0) !='b' && t)
	        {
	            input = JOptionPane.showConfirmDialog(f, "white won \n want to restart?");
	            if(input == 1)System.exit(0);
	            else if(input == 0)restart();
	                
	    
	        }
	
	        //Start of a prg when any soilder reaches at another end
	        else if(temp.getText()=="ws" && x1==0 && t && col=='w')
	        {
	            String[] list = {"queen","horse","camel","elephant"};
	            String change1= (String)JOptionPane.showInputDialog(f,"which player would you like to alive again","input",
	                            JOptionPane.QUESTION_MESSAGE,null,list,list[0]);
	            switch(change1.charAt(0))
	            {
	                case 'q':src.setIcon(iwqueen);
	                src.setText("wq");break;
	                case 'e':src.setIcon(iwelephant);
	                src.setText("we");break;
	                case 'h':src.setIcon(iwhorse);
	                src.setText("wh");break;
	                case 'c':src.setIcon(iwcamel);
	                src.setText("wc");break;
	                default:;
	            }
	        }
	        else if(temp.getText()=="bs" && x1==7 && t && col=='w')
	        {
	            String[] list = {"queen","horse","camel","elephant"};
	            String change1= (String)JOptionPane.showInputDialog(f,"which player would you like to alive again","input",
	                            JOptionPane.QUESTION_MESSAGE,null,list,list[0]);
	            switch(change1.charAt(0))
	            {
	                case 'q':src.setIcon(ibqueen);
	                src.setText("bq");break;
	                case 'e':src.setIcon(ibelephant);
	                src.setText("be");break;
	                case 'h':src.setIcon(ibhorse);
	                src.setText("bh");break;
	                case 'c':src.setIcon(ibcamel);
	                src.setText("bc");break;
	                default:;
	            }
	        }
	        else if(temp.getText()=="ws" && x1==7 && t && col=='b')
	        {
	            String[] list = {"queen","horse","camel","elephant"};
	            String change1= (String)JOptionPane.showInputDialog(f,"which player would you like to alive again","input",
	                            JOptionPane.QUESTION_MESSAGE,null,list,list[0]);
	            switch(change1.charAt(0))
	            {
	                case 'q':src.setIcon(iwqueen);
	                src.setText("wq");break;
	                case 'e':src.setIcon(iwelephant);
	                src.setText("we");break;
	                case 'h':src.setIcon(iwhorse);
	                src.setText("wh");break;
	                case 'c':src.setIcon(iwcamel);
	                src.setText("wc");break;
	                default:;
	            }
	        }
	        else if(temp.getText()=="bs" && x1==0 && t && col=='b')
	        {
	            String[] list = {"queen","horse","camel","elephant"};
	            String change1= (String)JOptionPane.showInputDialog(f,"which player would you like to alive again","input",
	                            JOptionPane.QUESTION_MESSAGE,null,list,list[0]);
	            switch(change1.charAt(0))
	            {
	                case 'q':src.setIcon(ibqueen);
	                src.setText("bq");break;
	                case 'e':src.setIcon(ibelephant);
	                src.setText("be");break;
	                case 'h':src.setIcon(ibhorse);
	                src.setText("bh");break;
	                case 'c':src.setIcon(ibcamel);
	                src.setText("bc");break;
	                default:;
	            }
	        }
	
	
	      
	        b[x][y].setBackground(c);
	        temp.setIcon(null);
	        temp.setText(" ");
	        cnt=0;
	    }
	}
}

    public void restart()
    {
    	f.dispose();
        new chessboard();
    }
//from here character personality is defined
    public boolean wSoilder(int lx1,int ly1,int lx2,int ly2)
    {
    	boolean tk = false;
    	if(col=='w')
    	{	
    	    	try{
    	    		if(lx1==6 && b[lx2][ly2]==b[lx1-2][ly1] && b[lx2][ly2].getText()==" " && b[lx1-1][ly1].getText()==" "){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	
    	    	try{
    	    		if (b[lx2][ly2]==b[lx1-1][ly1] && b[lx2][ly2].getText()==" "){return true;}
    	    		else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{
    	    		 if(b[lx2][ly2]==b[lx1-1][ly1-1] && b[lx2][ly2].getText().charAt(0)=='b'){return true;}
    	    		 else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{	
    	    		 if(b[lx2][ly2]==b[lx1-1][ly1+1] && b[lx2][ly2].getText().charAt(0)=='b'){return true;}
    	    		 else tk=false;
    	    	  	}
    	    	 catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	  }
    	  else
    	  {
    	  	     try{
    	  	    	if(lx1==1 && b[lx2][ly2]==b[lx1+2][ly1] && b[lx2][ly2].getText()==" " && b[lx1+1][ly1].getText()==" "){return true;}
    	  	    	else tk=false;
    	  	    	}
    	  	    catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	  
    	      try{
    	      	if (b[lx2][ly2]==b[lx1+1][ly1] && b[lx2][ly2].getText()==" "){return true;}
    	      	else tk=false;
    	      }
    	      catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	      try{
    	      	if(b[lx2][ly2]==b[lx1+1][ly1+1] && b[lx2][ly2].getText().charAt(0)=='b'){return true;}
    	      	else tk=false;
    	      }
    	      catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	      try{
    	      	if(b[lx2][ly2]==b[lx1+1][ly1-1] && b[lx2][ly2].getText().charAt(0)=='b'){return true;}
    	      	else tk=false;
    	      }
    	  	    catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	  }
    	return tk;
    }
    public boolean bSoilder(int lx1,int ly1,int lx2,int ly2)
    {
    	boolean tk = false;
    	if(col=='w')
    	{	
    	    	try{
    	    		if(lx1==1 && b[lx2][ly2]==b[lx1+2][ly1] && b[lx2][ly2].getText()==" " && b[lx1+1][ly1].getText()==" " ){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	
    	    	try{
    	    		if (b[lx2][ly2]==b[lx1+1][ly1] && b[lx2][ly2].getText()==" "){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	    	try{
    	    		if(b[lx2][ly2]==b[lx1+1][ly1+1] && b[lx2][ly2].getText().charAt(0)=='w'){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	    	try{
    	    		if(b[lx2][ly2]==b[lx1+1][ly1-1] && b[lx2][ly2].getText().charAt(0)=='w'){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	}
    	else
    	{
    		try{
    	    		if(lx1==6 && b[lx2][ly2]==b[lx1-2][ly1] && b[lx2][ly2].getText()==" "  && b[lx1-1][ly1].getText()==" "){return true;}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	
    	    	try{
    	    		if (b[lx2][ly2]==b[lx1-1][ly1] && b[lx2][ly2].getText()==" "){return true;}
    	    		else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{
    	    		 if(b[lx2][ly2]==b[lx1-1][ly1-1] && b[lx2][ly2].getText().charAt(0)=='w'){return true;}
    	    		 else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{	
    	    		 if(b[lx2][ly2]==b[lx1-1][ly1+1] && b[lx2][ly2].getText().charAt(0)=='w'){return true;}
    	    		 else tk=false;
    	    	  	}
    	    	 catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	}
    	return tk;
    }
    
    public boolean Horse(int lx1,int ly1,int lx2,int ly2)
    {
    	boolean tk = false;

        try{if( b[lx2][ly2]==b[lx1+2][ly1+1]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1+2][ly1-1]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1-2][ly1+1]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1-2][ly1-1]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1+1][ly1+2]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1+1][ly1-2]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1-1][ly1+2]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if( b[lx2][ly2]==b[lx1-1][ly1-2]) return  true;else tk= false;}
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        

        return tk;
    }
    public boolean King(int lx1,int ly1,int lx2,int ly2)
    {
        boolean tk = false;
        try{if(b[lx2][ly2]==b[lx1+1][ly1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1-1][ly1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1][ly1+1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1][ly1-1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}

        try{if(b[lx2][ly2]==b[lx1+1][ly1+1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1+1][ly1-1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1-1][ly1+1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx2][ly2]==b[lx1-1][ly1-1])return true;else tk=false;}
        catch(ArrayIndexOutOfBoundsException e){tk=false;}

        return tk;
    }
    public boolean Camel(int lx1,int ly1,int lx2,int ly2)
    {   count = 0;
        boolean tk = false;
        for(i=1;i<=8;i++)
        {
            try
            {if(b[lx2][ly2]==b[lx1+i][ly1+i])
                {
                    for(j=lx1+1,k=ly1+1;j<=lx2;j++,k++)
                        if(b[j][k].getText()==" ")
                            count++;
                        else {count=0;break;}
                    if(count!=0)return true; 
                    else if(j==lx2 && count==0)return true; 
                    else tk= false;  

                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {if(b[lx2][ly2]==b[lx1-i][ly1-i])
                {
                    for(j=lx1-1,k=ly1-1;j>=lx2;j--,k--)
                        if(b[j][k].getText()==" ")
                            count++;
                        else {count=0;break;}
                    if(count!=0)return true; 
                    else if(j==lx2 && count==0)return true; 
                    else tk= false;  

                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {if(b[lx2][ly2]==b[lx1-i][ly1+i])
                {
                    for(j=lx1-1,k=ly1+1;j>=lx2;j--,k++)
                        if(b[j][k].getText()==" ")
                            count++;
                        else {count=0;break;}
                    if(count!=0)return true; 
                    else if(j==lx2 && count==0)return true; 
                    else tk= false;  

                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {if(b[lx2][ly2]==b[lx1+i][ly1-i])
                {
                    for(j=lx1+1,k=ly1-1;j<=lx2;j++,k--)
                        if(b[j][k].getText()==" ")
                            count++;
                        else {count=0;break;}
                    if(count!=0)return true; 
                    else if(j==lx2 && count==0)return true; 
                    else tk= false;  

                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}

            
        }
        return tk;
    }    
   public boolean Elephant(int lx1,int ly1,int lx2,int ly2)
    {
        count = 0;
        boolean tk=false;

        for(i=0;i<8;i++)
        {
            try
            {
                if(b[lx2][ly2]==b[i][ly1])
                {
                    if(lx1<lx2)
                        for(j=lx1+1;j<=lx2;j++)    
                        {
                            
                            if(b[j][ly1].getText()==" ")count++;
                            else{count=0;break;}
                            
                        }
                    else
                        for(j=lx1-1;j>=lx2;j--)    
                        {
                            
                            if(b[j][ly1].getText()==" ")count++;
                            else{count=0;break;}
                            
                        }     
                    //if(b[lx2][ly1].getText()!=" " && count!=0)count++;       
                    if(count>0)return true;
                    else if(j==lx2 && count==0)return true;
                    else tk= false;

                
                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                if(b[lx2][ly2]==b[lx1][i])
                {
                    if(ly1<ly2)
                        for(j=ly1+1;j<=ly2;j++)    
                        {
                            
                            if(b[lx1][j].getText()==" ")count++;
                            else{count=0;break;}
                            
                        }
                    else
                        for(j=ly1-1;j>=ly2;j--)    
                        {

                            if(b[lx1][j].getText()==" ")count++;
                            else{count=0;break;}
                            
                        }   
                    //if(b[lx1][ly2].getText()!=" " && count!=0)count++;         
                    if(count>0)return true;
                    else if(j==ly2 && count==0)return true;
                    else tk= false;
                    //if(b[lx2][ly2].getText()!=" ")return true;
                
                }
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            
        }

        return tk;
    }
  	

  	public boolean Queen(int lx1,int ly1,int lx2,int ly2)
    {
        
        boolean tk = Elephant(lx1,ly1,lx2,ly2) || Camel(lx1,ly1,lx2,ly2);

        return tk;

    }
//end of character personality

// from here display of possible moves start
    public void dwSoilder(int lx1,int ly1)
	{
		boolean tk = false;
    	if(col=='w')
    	{	
    	    	try{
    	    		if(lx1==6 && b[lx1-2][ly1].getText()==" " && b[lx1-1][ly1].getText()==" ")
    	    			{
    	    				b[lx1-2][ly1].setBackground(Color.pink);
    	    				
    	    			}
    	    		else tk=false;

    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	
    	    	try{
    	    		if (b[lx1-1][ly1].getText()==" ")
    	    			{
    	    				b[lx1-1][ly1].setBackground(Color.pink);
    	    				
    	    			}
    	    		else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{
    	    		 if(b[lx1-1][ly1-1].getText().charAt(0)=='b')
    	    		 	{
    	    		 		b[lx1-1][ly1-1].setBackground(Color.pink);
    	    		 		
    	    		 	}
    	    		 else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{	
    	    		 if(b[lx1-1][ly1+1].getText().charAt(0)=='b')
    	    		 	{
    	    		 		b[lx1-1][ly1+1].setBackground(Color.pink);
    	    		 		
    	    		 	}
    	    		 else tk=false;
    	    	  	}
    	    	 catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	  }
    	  else
    	  {
    	  	     try{
    	  	    	if(lx1==1 && b[lx1+2][ly1].getText()==" " && b[lx1+1][ly1].getText()==" ")
    	  	    		{
    	  	    			b[lx1+2][ly1].setBackground(Color.pink);
    	  	    			
    	  	    		}
    	  	    	else tk=false;
    	  	    	}
    	  	    catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	  
    	      try{
    	      	if (b[lx1+1][ly1].getText()==" ")
    	      		{
    	      			b[lx1+1][ly1].setBackground(Color.pink);
    	      			
    	      		}
    	      	else tk=false;
    	      }
    	      catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	      try{
    	      	if(b[lx1+1][ly1+1].getText().charAt(0)=='b')
    	      		{
    	      			b[lx1+1][ly1+1].setBackground(Color.pink);
    	      			
    	      		}
    	      	else tk=false;
    	      }
    	      catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	      try{
    	      	if(b[lx1+1][ly1-1].getText().charAt(0)=='b')
    	      		{
    	      			b[lx1+1][ly1-1].setBackground(Color.pink);
    	      			
    	      		}
    	      	else tk=false;
    	      }
    	  	    catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	  }

    	
	}
	public void dbSoilder(int lx1,int ly1)
    {
    	boolean tk = false;
    	if(col=='w')
    	{	
    	    	try{
    	    		if(lx1==1 && b[lx1+2][ly1].getText()==" " && b[lx1+1][ly1].getText()==" ")
    	    		{
    	    			b[lx1+2][ly1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	
    	    	try{
    	    		if (b[lx1+1][ly1].getText()==" ")
    	    		{
    	    			b[lx1+1][ly1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	    	try{
    	    		if(b[lx1+1][ly1+1].getText().charAt(0)=='w')
    	    		{
    	    			b[lx1+1][ly1+1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	    	try{
    	    		if(b[lx1+1][ly1-1].getText().charAt(0)=='w')
    	    		{
    	    			b[lx1+1][ly1-1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	}
    	else
    	{
    		try{
    	    		if(lx1==6 && b[lx1-2][ly1].getText()==" " && b[lx1-1][ly1].getText()==" ")
    	    		{
    	    			b[lx1-2][ly1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    	}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	
    	    	try{
    	    		if (b[lx1-1][ly1].getText()==" ")
    	    		{
    	    			b[lx1-1][ly1].setBackground(Color.pink);
    	    		}
    	    		else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{
    	    		 if(b[lx1-1][ly1-1].getText().charAt(0)=='w')
    	    		 {
    	    		 	b[lx1-1][ly1-1].setBackground(Color.pink);
    	    		 }
    	    		 else tk=false;
    	    		}
    	    	catch(ArrayIndexOutOfBoundsException e){tk = false;}
    	    	try{	
    	    		 if(b[lx1-1][ly1+1].getText().charAt(0)=='w')
    	    		 {
    	    		 	b[lx1-1][ly1+1].setBackground(Color.pink);
    	    		 }
    	    		 else tk=false;
    	    	  	}
    	    	 catch(ArrayIndexOutOfBoundsException e){tk=false;}
    	}
    	
    }
    public void dHorse(int lx1,int ly1)
    {
    	boolean tk = false;

        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+2][ly1+1].getText().charAt(0))
        	b[lx1+2][ly1+1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+2][ly1-1].getText().charAt(0))
        	b[lx1+2][ly1-1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-2][ly1+1].getText().charAt(0))
        	b[lx1-2][ly1+1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-2][ly1-1].getText().charAt(0))
        	b[lx1-2][ly1-1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1+2].getText().charAt(0))
        	b[lx1+1][ly1+2].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1-2].getText().charAt(0))
        	b[lx1+1][ly1-2].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-1][ly1+2].getText().charAt(0))
        	b[lx1-1][ly1+2].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-1][ly1-2].getText().charAt(0))
        	b[lx1-1][ly1-2].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk = false;}
        
    }
    public void dKing(int lx1,int ly1)
    {
        boolean tk = false;
        try{
        	if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1].getText().charAt(0))
        	b[lx1+1][ly1].setBackground(Color.pink);

        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-1][ly1].getText().charAt(0))
        	b[lx1-1][ly1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1][ly1+1].getText().charAt(0))
        	b[lx1][ly1+1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1][ly1-1].getText().charAt(0))
        	b[lx1][ly1-1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}

        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1+1].getText().charAt(0))
        	b[lx1+1][ly1+1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1-1].getText().charAt(0))
        	b[lx1+1][ly1-1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1-1][ly1+1].getText().charAt(0))
        	b[lx1-1][ly1+1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}
        try{if(b[lx1][ly1].getText().charAt(0)!=b[lx1+1][ly1-1].getText().charAt(0))
        	b[lx1-1][ly1-1].setBackground(Color.pink);
        }
        catch(ArrayIndexOutOfBoundsException e){tk=false;}

        
    }
    public void dCamel(int lx1,int ly1)
    {   
    	count = 0;
        boolean tk = false;
        
        
            try
            {
                    for(j=lx1+1,k=ly1+1;j<=7;j++,k++)
                        if(b[j][k].getText()==" ")
                            {
                            	b[j][k].setBackground(Color.pink);
                            	count++;
                            }
                        else {count=0;break;}

                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink); 

             
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1-1,k=ly1-1;j>=0;j--,k--)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);  

                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1-1,k=ly1+1;j>=0;j--,k++)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1+1,k=ly1-1;j<=7;j++,k--)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
                 
    } 
   
    public void dElephant(int lx1,int ly1)
    {
        count = 0;
        boolean tk=false;

        
            try
            {
                
                    
                        
                        for(j=lx1+1;j<=7;j++)    
                            
                            if(b[j][ly1].getText()==" ")
                            {
                            	b[j][ly1].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[j][ly1].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][ly1].getText().charAt(0))
                       		b[j][ly1].setBackground(Color.pink);   
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {            
                    
                        
                        for(j=lx1-1;j>=0;j--)    
                            
                            if(b[j][ly1].getText()==" ")
                            {
                            	b[j][ly1].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[j][ly1].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][ly1].getText().charAt(0))
                       		b[j][ly1].setBackground(Color.pink);    
                             
                    

                
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                
                    
                        
                        for(j=ly1+1;j<=7;j++)    
                            
                            if(b[lx1][j].getText()==" ")
                            {
                            	b[lx1][j].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                         if(b[lx1][j].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[lx1][j].getText().charAt(0))
                       	b[lx1][j].setBackground(Color.pink);   
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}            
            try
            {        
                        
                        for(j=ly1-1;j>=0;j--)    

                            if(b[lx1][j].getText()==" ")
                            {
                            	b[lx1][j].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[lx1][j].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[lx1][j].getText().charAt(0))
                       	b[lx1][j].setBackground(Color.pink);    
                        
                    
                
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;} 

    }
   
    public void dQueen(int lx1,int ly1)
    {
    	count = 0;
        boolean tk = false;
        
        
            try
            {
                    for(j=lx1+1,k=ly1+1;j<=7;j++,k++)
                        if(b[j][k].getText()==" ")
                            {
                            	b[j][k].setBackground(Color.pink);
                            	count++;
                            }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink); 

             
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1-1,k=ly1-1;j>=0;j--,k--)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                      
					if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1-1,k=ly1+1;j>=0;j--,k++)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                    for(j=lx1+1,k=ly1-1;j<=7;j++,k--)
                        if(b[j][k].getText()==" ")
                        {
                        	b[j][k].setBackground(Color.pink);
                            count++;
                        }
                        else {count=0;break;}
                    if(b[j][k].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][k].getText().charAt(0))
                       	b[j][k].setBackground(Color.pink);
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            
            try
            {
                
                    
                        
                        for(j=lx1+1;j<=7;j++)    
                            
                            if(b[j][ly1].getText()==" ")
                            {
                            	b[j][ly1].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[j][ly1].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][ly1].getText().charAt(0))
                       		b[j][ly1].setBackground(Color.pink);   
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {            
                    
                        
                        for(j=lx1-1;j>=0;j--)    
                            
                            if(b[j][ly1].getText()==" ")
                            {
                            	b[j][ly1].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[j][ly1].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[j][ly1].getText().charAt(0))
                       		b[j][ly1].setBackground(Color.pink);    
                             
                    

                
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}
            try
            {
                
                    
                        
                        for(j=ly1+1;j<=7;j++)    
                            
                            if(b[lx1][j].getText()==" ")
                            {
                            	b[lx1][j].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                         if(b[lx1][j].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[lx1][j].getText().charAt(0))
                       	b[lx1][j].setBackground(Color.pink);   
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;}            
            try
            {        
                        
                        for(j=ly1-1;j>=0;j--)    

                            if(b[lx1][j].getText()==" ")
                            {
                            	b[lx1][j].setBackground(Color.pink);
                            	count++;
                            }
                            else{count=0;break;}
                        if(b[lx1][j].getText()!=" " && b[lx1][ly1].getText().charAt(0)!=b[lx1][j].getText().charAt(0))
                       	b[lx1][j].setBackground(Color.pink);    
                        
                    
                
                
            }
            catch(ArrayIndexOutOfBoundsException e){tk= false;} 

            
    }
// end of display of possible moves

        
}  

