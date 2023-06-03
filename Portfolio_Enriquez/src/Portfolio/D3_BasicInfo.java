package Portfolio;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class D3_BasicInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D3_BasicInfo window = new D3_BasicInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public D3_BasicInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 798, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(0,0);
		frame.setLocationRelativeTo(null);
		
		//Instantiation of the subclass that inherited all the variables and methods of the subclasses and parent class
		Info4_SH info = new Info4_SH();
		
		//Display inherited Variables
		JLabel lblBasicInformation = new JLabel(info.BasicInfo);
		lblBasicInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicInformation.setForeground(new Color(0, 0, 0));
		lblBasicInformation.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 22));
		lblBasicInformation.setBounds(254, 70, 244, 26);
		frame.getContentPane().add(lblBasicInformation);
		
		JLabel lblname = new JLabel(info.name);
		lblname.setHorizontalAlignment(SwingConstants.LEFT);
		lblname.setForeground(new Color(0, 0, 0));
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblname.setBounds(27, 370, 254, 20);
		frame.getContentPane().add(lblname);
		
		JLabel lblBirthdate = new JLabel(info.birth);
		lblBirthdate.setHorizontalAlignment(SwingConstants.LEFT);
		lblBirthdate.setForeground(new Color(0, 0, 0));
		lblBirthdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBirthdate.setBounds(27, 410, 267, 20);
		frame.getContentPane().add(lblBirthdate);
		
		JLabel lblGender = new JLabel(info.Gender);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(27, 450, 103, 20);
		frame.getContentPane().add(lblGender);
		
		JLabel lblNationality = new JLabel(info.Nationality);
		lblNationality.setHorizontalAlignment(SwingConstants.LEFT);
		lblNationality.setForeground(Color.BLACK);
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNationality.setBounds(27, 490, 169, 20);
		frame.getContentPane().add(lblNationality);
		
		JLabel lblAddress = new JLabel(info.address);
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setForeground(new Color(0, 0, 0));
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(462, 370, 169, 20);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblOcupation = new JLabel(info.School);
		lblOcupation.setHorizontalAlignment(SwingConstants.LEFT);
		lblOcupation.setForeground(new Color(0, 0, 0));
		lblOcupation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOcupation.setBounds(462, 410, 219, 20);
		frame.getContentPane().add(lblOcupation);
		
		JLabel lblContact = new JLabel(info.contact);
		lblContact.setHorizontalAlignment(SwingConstants.LEFT);
		lblContact.setForeground(new Color(0, 0, 0));
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContact.setBounds(462, 450, 203, 20);
		frame.getContentPane().add(lblContact);
		
		JLabel lblEmail = new JLabel(info.email);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(462, 490, 254, 20);
		frame.getContentPane().add(lblEmail);
		
		//BackButton
		JLabel lblBackButton = new JLabel(info.Backbutton());
		lblBackButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackButton.setForeground(new Color(0, 0, 0));
		lblBackButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 14));
		lblBackButton.setBounds(20, 5, 109, 38);
		frame.getContentPane().add(lblBackButton);
		
		lblBackButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D2_MainFrame.main(null);
				frame.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblBackButton.setForeground(Color.blue);
			}
			public void mouseExited(MouseEvent e) {
			lblBackButton.setForeground(Color.BLACK);
			}	
			
		});
		//display inherited variable
		JTextArea txtADescript = new JTextArea(info.descript);
		txtADescript.setToolTipText("");
		txtADescript.setForeground(new Color(0, 40, 40));
		txtADescript.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtADescript.setEditable(false);
		txtADescript.setColumns(5);
		txtADescript.setBackground(new Color(0, 0, 0, 0));
		txtADescript.setBounds(267, 186, 434, 110);
		frame.getContentPane().add(txtADescript);
		
		//display background
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(D1_Front.class.getResource("/Image/3.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
		
	}
}
