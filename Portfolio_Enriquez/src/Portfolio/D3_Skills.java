package Portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class D3_Skills {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D3_Skills window = new D3_Skills();
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
	public D3_Skills() {
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
		frame.setLocationRelativeTo(null);
		
		//Instantiation of the subclass that inherited all the variables and methods of the subclasses and parent class
		Info4_SH info = new Info4_SH();
		//Display inherited variables
		JLabel lblAdaptability = new JLabel(info.Adaptability);
		lblAdaptability.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdaptability.setForeground(new Color(0, 0, 0));
		lblAdaptability.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdaptability.setBounds(431, 179, 114, 25);
		frame.getContentPane().add(lblAdaptability);
		
		JLabel lblTimeManagement = new JLabel(info.Time);
		lblTimeManagement.setHorizontalAlignment(SwingConstants.LEFT);
		lblTimeManagement.setForeground(new Color(0, 0, 0));
		lblTimeManagement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTimeManagement.setBounds(431, 266, 167, 25);
		frame.getContentPane().add(lblTimeManagement);
		
		JLabel lblPerseverance = new JLabel(info.Perseverance);
		lblPerseverance.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerseverance.setForeground(new Color(0, 0, 0));
		lblPerseverance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPerseverance.setBounds(431, 353, 114, 25);
		frame.getContentPane().add(lblPerseverance);
		
		JLabel lblGrammar = new JLabel(info.Grammar);
		lblGrammar.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrammar.setForeground(new Color(0, 0, 0));
		lblGrammar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrammar.setBounds(431, 439, 143, 25);
		frame.getContentPane().add(lblGrammar);
		
		JLabel lblTechSkills = new JLabel(info.Tech);
		lblTechSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblTechSkills.setForeground(Color.BLACK);
		lblTechSkills.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblTechSkills.setBounds(41, 69, 280, 29);
		frame.getContentPane().add(lblTechSkills);
		
		JLabel lblPersonalSkills = new JLabel(info.Personal);
		lblPersonalSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalSkills.setForeground(Color.BLACK);
		lblPersonalSkills.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblPersonalSkills.setBounds(427, 69, 280, 29);
		frame.getContentPane().add(lblPersonalSkills);
		//A JLable that is a Back Button
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
		
		//display background
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(D1_Front.class.getResource("/Image/5.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}

}
