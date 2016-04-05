import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	
	private DetailsPanel detailsPanel;

	//constructor
	public MainFrame(String title){
		super(title);

		//Set layout manager
		setLayout(new BorderLayout());

		//Create Swing component
		final JTextArea textArea = new JTextArea();
		// JButton button = new JButton("Click me");

		detailsPanel = new DetailsPanel();

		//Add Swing component to content pane
		Container c = getContentPane();

		c.add(textArea, BorderLayout.CENTER);
		// c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.WEST);

		detailsPanel.addDetailListener(new DetailListener(){
			public void detailEventOccured(DetailEvent event){
				
			}
		});

		//Add behaviour
		// button.addActionListener(new ActionListener() {
			
		// 	public void actionPerformed(ActionEvent e){
		// 		textArea.append("Hello\n");
		// 	}
		// });
	}
}