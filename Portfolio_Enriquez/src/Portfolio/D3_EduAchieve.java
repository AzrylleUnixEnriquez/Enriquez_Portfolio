package Portfolio;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class D3_EduAchieve extends Info1_D1D2{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D3_EduAchieve window = new D3_EduAchieve();
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
	public D3_EduAchieve() {
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
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		//Instantiation of the subclass that inherited all the variables and methods of the subclasses and parent class
		Info4_SH info = new Info4_SH();
		
		//display inherited variables
		JTextArea txtHS = new JTextArea(info.educationHS);
		txtHS.setForeground(new Color(0, 0, 0));
		txtHS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHS.setEditable(false);
		txtHS.setBackground(new Color(0, 0, 0, 0));
		txtHS.setBounds(93, 166, 243, 38);
		frame.getContentPane().add(txtHS);
		
		JTextArea txtSHS = new JTextArea(info.educationSHS);
		txtSHS.setForeground(new Color(0, 0, 0));
		txtSHS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSHS.setEditable(false);
		txtSHS.setBackground(new Color(0, 0, 0, 0));
		txtSHS.setBounds(93, 288, 247, 55);
		frame.getContentPane().add(txtSHS);
		
		JTextArea txtCollege = new JTextArea(info.educationCollege);
		txtCollege.setForeground(new Color(0, 0, 0));
		txtCollege.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCollege.setEditable(false);
		txtCollege.setBackground(new Color(0, 0, 0, 0));
		txtCollege.setBounds(93, 430, 244, 55);
		frame.getContentPane().add(txtCollege);
		
		
		JTextArea txtAreaAchievement = new JTextArea(info.achieve1);
		txtAreaAchievement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAreaAchievement.setBackground(new Color(0,0,0,0));
		txtAreaAchievement.setEditable(false);
		txtAreaAchievement.setForeground(new Color(0, 0, 0));
		txtAreaAchievement.setBounds(523, 482, 152, 38);
		frame.getContentPane().add(txtAreaAchievement);
		
		
		JLabel lblEducation = new JLabel(info.edu);
		lblEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEducation.setForeground(new Color(0, 0, 0));
		lblEducation.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblEducation.setBounds(45, 64, 280, 29);
		frame.getContentPane().add(lblEducation);
		
		JLabel lblAchievement = new JLabel(info.Achieve);
		lblAchievement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement.setForeground(Color.BLACK);
		lblAchievement.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblAchievement.setBounds(440, 64, 280, 29);
		frame.getContentPane().add(lblAchievement);
		
		//Back Button
		JLabel lblBackButton = new JLabel(info.Backbutton());
		lblBackButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackButton.setForeground(new Color(0, 40,40));
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
			lblBackButton.setForeground(Color.BLACK);;
			}	
					
		});
		
		//display Background
		JLabel lblBG = new JLabel("");
		lblBG.setHorizontalAlignment(SwingConstants.CENTER);
		lblBG.setForeground(new Color(255, 255, 255));
		lblBG.setIcon(new ImageIcon(D3_EduAchieve.class.getResource("/Image/4.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}
}
