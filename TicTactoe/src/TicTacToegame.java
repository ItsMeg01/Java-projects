
import java.awt.event.*;
import javax.swing.*;
class TicTacToegame extends JFrame 
{
	
	JButton one,two,three,four,five,six,seven,eight,nine;
        JButton btn;
	JTextField tfield;
        int i=0,j=0,count=0;
	public TicTacToegame(String str)
        {
		super(str);	
	}
	public void setButtons()
	{
	 tfield=new JTextField();
	 tfield.setBounds(20,370,250,30);
	 tfield.setEditable(false);
	 btn=new JButton("START GAME");
	 btn.setBounds(90,320,130,30);
         one=new JButton("");
	 one.setBounds(13,13,90,90);
	 two=new JButton("");
	 two.setBounds(110,13,90,90);
	 three=new JButton("");
	 three.setBounds(207,13,90,90); 
	 four=new JButton("");
	 four.setBounds(13,110,90,90); 
	 five=new JButton("");
	 five.setBounds(110,110,90,90);
	 six=new JButton("");
	 six.setBounds(207,110,90,90); 
	 seven=new JButton("");
	 seven.setBounds(13,207,90,90);
	 eight=new JButton("");
	 eight.setBounds(110,207,90,90);
	 nine=new JButton("");
	 nine.setBounds(207,207,90,90);
	 one.addActionListener(new B());
	 two.addActionListener(new C());
	 three.addActionListener(new D());
	 four.addActionListener(new E());
	 five.addActionListener(new F());
	 six.addActionListener(new G());
	 seven.addActionListener(new H());
	 eight.addActionListener(new I());
	 nine.addActionListener(new J());
	 btn.addActionListener(new A());
	 add(one);
	 add(two);
	 add(three);
	 add(four);
	 add(five);
	 add(six);
	 add(seven);
	 add(eight);
	 add(nine);
	 add(btn);
	 add(tfield);	
	} 
	public void setDefault()
	{
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
	}
	public int check()
	{
		count++;		
		if(one.getText()=="X"&&two.getText()=="X"&&three.getText()=="X")
			return 1;
		else if(one.getText()=="X"&&four.getText()=="X"&&seven.getText()=="X")
			return 1;
		else if(one.getText()=="X"&&five.getText()=="X"&&nine.getText()=="X")
			return 1;
		
		else if(two.getText()=="X"&&five.getText()=="X"&&eight.getText()=="X")
			return 1;
		
		else if(three.getText()=="X"&&six.getText()=="X"&&nine.getText()=="X")
			return 1;
		else if(three.getText()=="X"&&five.getText()=="X"&&seven.getText()=="X")
			return 1;
		
		else if(four.getText()=="X"&&five.getText()=="X"&&six.getText()=="X")
			return 1;
		
		else if(seven.getText()=="X"&&eight.getText()=="X"&&nine.getText()=="X")
			return 1;
		
		
		else if(one.getText()=="0"&&two.getText()=="0"&&three.getText()=="0")
			return 2;
		else if(one.getText()=="0"&&four.getText()=="0"&&seven.getText()=="0")
			return 2;
		else if(one.getText()=="0"&&five.getText()=="0"&&nine.getText()=="0")
			return 2;
		
		else if(two.getText()=="0"&&five.getText()=="0"&&eight.getText()=="0")
			return 2;
		
		else if(three.getText()=="0"&&six.getText()=="0"&&nine.getText()=="0")
			return 2;
		else if(three.getText()=="0"&&five.getText()=="0"&&seven.getText()=="0")
			return 2;
		
		else if(four.getText()=="0"&&five.getText()=="0"&&six.getText()=="0")
			return 2;
		
		else if(seven.getText()=="0"&&eight.getText()=="0"&&nine.getText()=="0")
			return 2;
		
		else{
		  if(count==9)
			tfield.setText("Game Draw");
		  return 3;
		}			
			
		
	}
	class A implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
		   i=0;j=0;count=0;
		   one.setText("");
		   two.setText("");
		   three.setText("");
		   four.setText("");
		   five.setText("");
		   six.setText("");
		   seven.setText("");
		   eight.setText("");
		   nine.setText("");
		   one.setEnabled(true);
		   two.setEnabled(true);
		   three.setEnabled(true);
		   four.setEnabled(true);
		   five.setEnabled(true);
		   six.setEnabled(true);
		   seven.setEnabled(true);
		   eight.setEnabled(true);
		   nine.setEnabled(true);
		   tfield.setText("");
		}	
	}
	class B implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    one.setText("X"); 
				i=1;
				one.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				one.setText("0"); 
				i=0;
				one.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class C implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    two.setText("X"); 
				i=1;
				two.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				two.setText("0"); 
				i=0;
				two.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	} 
	class D implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    three.setText("X"); 
				i=1;
				three.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;				
			}
			else{
				three.setText("0"); 
				i=0;
				three.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class E implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    four.setText("X"); 
				i=1;
				four.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				four.setText("0"); 
				i=0;
				four.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class F implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    five.setText("X"); 
				i=1;
				five.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				five.setText("0"); 
				i=0;
				five.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class G implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    six.setText("X"); 
				i=1;
				six.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				six.setText("0"); 
				i=0;
				six.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class H implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    seven.setText("X"); 
				i=1;
				seven.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				seven.setText("0"); 
				i=0;
				seven.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class I implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    eight.setText("X"); 
				i=1;
				eight.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				eight.setText("0"); 
				i=0;
				eight.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}
	class J implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(i==0){
			    nine.setText("X"); 
				i=1;
				nine.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}
			else{
				nine.setText("0"); 
				i=0;
				nine.setEnabled(false);
				j=check();
				if(j==1){
					tfield.setText("Player 1 Won");
					setDefault();
					
				}
				else if(j==2){
					tfield.setText("Player 2 Won");
					setDefault();
				}
				else;
			}	
		 }
	}  
	public static void main(String []args)
	{
	 TicTacToegame jf=new TicTacToegame("Tic Tac Toe");
	 jf.setButtons(); 
	 jf.setSize(325,450);
	 jf.setLocation(100,100);
	 jf.setLayout(null);
	 jf.setVisible(true);
	 jf.setResizable(false);
	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


