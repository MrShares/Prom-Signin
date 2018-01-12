package graphics;

	import java.awt.*;


import javax.swing.*;  


		public class test{ 
		      
			test()  
	        {  
	        JFrame f= new JFrame("Panel Example");    
	        JPanel panel=new JPanel();  
	        panel.setBounds(40,80,200,200);    
	        panel.setBackground(Color.gray);  
			JButton b =new JButton();
			Icon a=new ImageIcon(getClass().getResource("studentcardtemplate.png"));
			b.setIcon(a);
			panel.add(b);
	        f.add(panel);  
	                f.setSize(400,400);    
	                f.setLayout(null);    
	                f.setVisible(true);    
	        
			//Icon a=new ImageIcon(getClass().getResource("studentcardtemplate.bmp"));

	        }
	        public static void main(String args[])  
	        {  
	        	new test();
	            
	        }  
		  
		}  


