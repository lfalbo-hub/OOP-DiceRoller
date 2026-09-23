package diceRollerUi;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfDiceCount;
	private JTextField tfFaceCount;
	private JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setBackground(new Color(192, 192, 192));
		
		JLabel lblNewLabel = new JLabel("Number of Dice");
		add(lblNewLabel);
		
		tfDiceCount = new JTextField();
		add(tfDiceCount);
		tfDiceCount.setColumns(10);
		
		JLabel lblNewLabel2 = new JLabel("Number of Faces");
		add(lblNewLabel2);
		
		tfFaceCount = new JTextField();
		add(tfFaceCount);
		tfFaceCount.setColumns(10);
		
		btnNewButton = new JButton("Roll Dice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);

		
	}

}
