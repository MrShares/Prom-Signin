import javax.swing.*;
import java.awt.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.util.*;
import javax.swing.SwingUtilities;
 class LiveSearch 
{
	JFrame search = new JFrame("");
	AutoCompleteDecorator decorator;
	JComboBox combobox;

	public LiveSearch() 
	{
		combobox = new JComboBox(new Object[]{" ","Jakob","Eion","Nathan","Jake","Jeff","Nate"});
		AutoCompleteDecorator.decorate(combobox);
		search.setSize(400,80);
		search.setLocationRelativeTo(null);
		search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		search.setLayout(new FlowLayout());
		
		combobox.setEditable(true);
		
		search.add(combobox);
		search.setVisible(true);
	}
	
	class MKeyListener extends KeyAdapter
	{
		
	}
	public static void main(String [] args) 
	{
		LiveSearch check = new LiveSearch();
		
	}
}