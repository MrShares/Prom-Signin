
import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;  
		public class cardbutton{ 
			JFrame f= new JFrame("test");
			JLayeredPane completeCard = new JLayeredPane();
			cardbutton(int x)  
	        {  
			
			completeCard.setBounds(0 + (401* x - (x+1)), 0 +(288 * x - (x+1)), 400, 287);
			JButton studentCard =new JButton();
			Icon cardImg=new ImageIcon(getClass().getResource("studentcardtemplate.png"));
			studentCard.setIcon(cardImg);        
            studentCard.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                        System.out.println("pressed");
                }  
                });
            studentCard.setBounds(0, 0, 400, 287);
            completeCard.add(studentCard,new Integer(1));
            }  
			
			
			
	        public void createAndDisplayButton(Student x)  
	        {  
	        	String name = x.getName();
	        	String StudId =Integer.toString(x.getStudID());
	        	JLabel nameText = new JLabel(name);
	        	JLabel StudIdText = new JLabel(StudId);
	        	nameText.setBounds(77, 40, 161, 12);
	        	StudIdText.setBounds(110, 158, 90, 15);
	        	
	        	completeCard.add(nameText, new Integer(3));
	        	completeCard.add(StudIdText,new Integer(3));
 

	            
	        	
	        }  
	        
	        public void addframe()
	        {
	        	
	        	
	        	
	            f.setSize(1000,1300);  
	            f.add(completeCard);
	            f.setLayout(null);  
	            f.setVisible(true); 
	        }
	        public static void main(String[] args)
	        {
	        	cardbutton test = new cardbutton(0);
	        	Student a = new Student ("smith000000000000000", "bob", 111111, false);
	        	test.createAndDisplayButton(a);
	        	cardbutton test1 = new cardbutton(1);
	        	test1.createAndDisplayButton(a);
	        	test.addframe();
	        	test1.addframe();
	        	
	        	
	        }
		}
