import javax.swing.*;
import java.awt.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class LiveSearch 
{
	JFrame search = new JFrame("");
	AutoCompleteDecorator decorator;
	JComboBox combobox;

	public LiveSearch() 
	{
		combobox = new JComboBox(new Object[]{" ","Jakob","Eion","Nathan"});
		AutoCompleteDecorator.decorate(combobox);
		search.setSize(400,400);
		search.setLocationRelativeTo(null);
		search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		search.setLayout(new FlowLayout());
		
		search.add(combobox);
		search.setVisible(true);
	}
	public static void main(String [] args) 
	{
		LiveSearch check = new LiveSearch();
		
	}
}