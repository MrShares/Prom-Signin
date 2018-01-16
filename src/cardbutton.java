

import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;  


		public class cardButton{ 
		      
			JPanel completeCard = new JPanel();
			cardButton()  
	        {  
			
			completeCard.setSize(400, 287);
			JButton studentCard =new JButton();
			Icon cardImg=new ImageIcon(getClass().getResource("studentcardtemplate.png"));
			studentCard.setIcon(cardImg);        
            studentCard.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                        System.out.println("pressed");
                }  
                });
            completeCard.add(studentCard);
            }  
			
			
			
	        public void createAndDisplayButton(Student x)  
	        {  
	        	completeCard.setLayout(new FlowLayout());
	        	String name = x.getName();
	        	String StudId =Integer.toString(x.getStudID());
	        	JLabel nameLabel = new JLabel();
	        	JLabel StudIdLabel = new JLabel();
	        	StudIdLabel.setText(StudId);
	        	nameLabel.setText(name);
	        	nameLabel.setLocation(85, 37);
	        	StudIdLabel.setLocation(115, 160);
	        	completeCard.add(nameLabel);
	        	completeCard.add(StudIdLabel);
	        	 
	        	JFrame f= new JFrame("test");
	        	
	            f.setSize(1000,1300);  
	            f.setLayout(null);  
	            f.setVisible(true);  
	            f.add(completeCard); //////////
	        	
	        }  
	        public static void main(String[] args)
	        {
	        	cardButton test = new cardButton();
	        	Student a = new Student ("smith", "bob", 111111, false);
	        	test.createAndDisplayButton(a);
	        	
	        	
	        }
	        
		  
} 