import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class paneluser extends JPanel {
	

	
	private JLabel lblemail;
	private JLabel lblname;
	private JLabel lbldob;
	private JLabel lblphn;
	private JTextField tfemail;
	private JTextField tfname;
	private JTextField tfphn;
	private JTextField tfdob;
	private JTextField tfpass;
	private JLabel lblpass;


	public paneluser()
	{
		
		this.setLayout(new GridLayout(5,5,2,2));
		
		lblemail = new JLabel("Email:");
		lblname = new JLabel("UserName:");
		lbldob = new JLabel("DOB:");
		lblphn = new JLabel("Phone:");
		lblpass = new JLabel("Pass:");
		
		tfemail = new JTextField(10);
		tfname = new JTextField(10);
		tfdob = new JTextField(10);
		tfphn = new JTextField(10);
		tfpass = new JTextField(10);
		
	
		addComponents();
		
	}

	private void addComponents() {
		
		add(lblemail);
		add(getTfemail());
		add(lblname);
		add(getTfname());
		add(lbldob);
		add(getTfdob());
		add(lblphn);
		add(getTfphn());
		add(lblpass);
		add(getTfpass());
		
	}
	



	public JTextField getTfemail() {
		return tfemail;
	}




	public JTextField getTfname() {
		return tfname;
	}




	public JTextField getTfdob() {
		return tfdob;
	}




	public JTextField getTfphn() {
		return tfphn;
	}




	public JTextField getTfpass() {
		return tfpass;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
