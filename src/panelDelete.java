import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelDelete extends JPanel{
	
	JButton btdelete;
	private JLabel lblid3;
	public JTextField tfid3;
	private Font f4;
	public panelDelete()
	{
		
		f4 = new Font(Font.SERIF, Font.PLAIN, 15);
		setVisible(false);
		btdelete = new JButton("Delete");

		lblid3 = new JLabel("ID :");
		tfid3 = new JTextField(15);
		tfid3.setText("suggested for deletion");

		add(lblid3);
		add(tfid3);
		lblid3.setBounds(2, 2, 10, 10);
		tfid3.setBounds(2, 2, 10, 10);

//		add(btdelete);

//		add(pnl_delete);
		tfid3.setFont(f4);
		lblid3.setFont(f4);

		setBounds(20, 150, 300, 400);
		setAutoscrolls(true);
	
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	
}
