

	import java.awt.*;
	import java.awt.event.*;  

import javax.swing.*;  


		public class test{ 
		      
			test()  
	        {  
	        JFrame f= new JFrame("Panel Example");    
	        JPanel panel=new JPanel();  
	        panel.setBounds(0,0,400,287);    
			JButton b =new JButton();
			Icon a=new ImageIcon(getClass().getResource("studentcardtemplate.png"));
			b.setIcon(a);
			panel.add(b);
			JPanel panel2=new JPanel();  
	        panel2.setBounds(0,287,400,574);    
			JButton c =new JButton();
			c.setIcon(a);
			panel2.add(c);
	        f.add(panel);  
	        f.add(panel2);
	        f.setSize(1000,1000);    
	        f.setLayout(null);    
	        f.setVisible(true);    
	        
	        

	        
            b.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                        System.out.println("pressed");
                }  
                });}  

			
			
	        public static void main(String args[])  
	        {  
	        	new test();

	            
	        }  
		  
		}  


