import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javac.swing.event.EventListenerList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;


public class DetailsPanel extends JPanel {

	public DetailsPanel(){
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);

		setBorder(BorderFactory.createTitledBorder("Personal Details"));

		JLabel namelabel = new JLabel("Name: ");
		JLabel occupationLabel = new JLabel("Occupation: ");

		final JTextField nameField = new JTextField(10);
		final JTextField occupationField = new JTextField(10);

		JButton addBtn = new JButton("Add");

		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String name = nameField.getText();
				String occupation = occupationField.getText();

				String text = name + ":  " + occupation + "\n";
				System.out.println(text);
			};
		});

		//to add the component to show the application
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.anchor = GridBagConstraints.LINE_END;
		///First Column ///
		gc.weightx = 0.5;    //how much space allocated into the cell
		gc.weighty = 0.5;    //how much space allocated into the cell
		
		gc.gridx = 0;    //increases going left to right
		gc.gridy = 0;    //increases going downward
		add(namelabel, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(occupationLabel, gc);

		gc.anchor = GridBagConstraints.LINE_START;
		///Second Column ///
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		add(occupationField, gc);

		//Final row
		gc.weighty = 10;

		// gc.fill = GridBagConstraints.BOTH;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn, gc);

		public void addDetailListener(DetailListener listener) {

		};

		public void removeDetailListener(DetailListener listener) {
			
		};

	}
}