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
import javax.swing.JTextArea;

public class D2_MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D2_MainFrame window = new D2_MainFrame();
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
	public D2_MainFrame() {
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
		//Creates a Jlabel 
		//Display inherited variables and makes the Jlabel buttons
		JLabel lblBasicInfoButton = new JLabel(info.BasicInfo);
		lblBasicInfoButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicInfoButton.setForeground(new Color(0, 0, 0));
		lblBasicInfoButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		lblBasicInfoButton.setBounds(490, 130, 154, 47);
		frame.getContentPane().add(lblBasicInfoButton);
		lblBasicInfoButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			D3_BasicInfo.main(null);
			frame.dispose();
			}
			public void mouseEntered(MouseEvent e) {
			lblBasicInfoButton.setForeground(Color.blue);
			}
			public void mouseExited(MouseEvent e) {
			lblBasicInfoButton.setForeground(Color.BLACK);
			}
			
		});
	
		JLabel lblEduAchieveButton = new JLabel(info.EducationAchieve);
		lblEduAchieveButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblEduAchieveButton.setForeground(new Color(0, 0, 0));
		lblEduAchieveButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		lblEduAchieveButton.setBounds(490, 213, 154, 47);
		frame.getContentPane().add(lblEduAchieveButton);
		lblEduAchieveButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D3_EduAchieve.main(null);
				frame.dispose();
				}
			public void mouseEntered(MouseEvent e) {
				lblEduAchieveButton.setForeground(Color.blue);
				}
			public void mouseExited(MouseEvent e) {
				lblEduAchieveButton.setForeground(Color.BLACK);;
				}	
						
			});
		
		JLabel lblSkills = new JLabel(info.Skills);
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(new Color(0, 0, 0));
		lblSkills.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		lblSkills.setBounds(490, 295, 154, 53);
		frame.getContentPane().add(lblSkills);
		lblSkills.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D3_Skills.main(null);
				frame.dispose();
				}
			public void mouseEntered(MouseEvent e) {
				lblSkills.setForeground(Color.blue);
				}
			public void mouseExited(MouseEvent e) {
				lblSkills.setForeground(Color.BLACK);;
				}	
						
			});
		
		JLabel StrengthWeakness = new JLabel(info.SW);
		StrengthWeakness.setHorizontalAlignment(SwingConstants.CENTER);
		StrengthWeakness.setForeground(new Color(0, 0, 0));
		StrengthWeakness.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		StrengthWeakness.setBounds(490, 373, 154, 53);
		frame.getContentPane().add(StrengthWeakness);
		StrengthWeakness.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D3_StrengthWeakness.main(null);
				frame.dispose();
				}
			public void mouseEntered(MouseEvent e) {
				StrengthWeakness.setForeground(Color.blue);
				}
			public void mouseExited(MouseEvent e) {
				StrengthWeakness.setForeground(Color.BLACK);;
				}	
						
			});
		
		JLabel lblHobbies = new JLabel(info.Hobbies);
		lblHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies.setForeground(new Color(0, 0, 0));
		lblHobbies.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
		lblHobbies.setBounds(490, 455, 154, 53);
		frame.getContentPane().add(lblHobbies);
		lblHobbies.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D3_Hobbies.main(null);
				frame.dispose();
				}
			public void mouseEntered(MouseEvent e) {
				lblHobbies.setForeground(Color.blue);
				}
			public void mouseExited(MouseEvent e) {
				lblHobbies.setForeground(Color.BLACK);;
				}	
						
			});
		
		//Back Button
		JLabel lblBackButton = new JLabel(info.Backbutton());
		lblBackButton.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackButton.setForeground(new Color(0, 0, 0));
		lblBackButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 14));
		lblBackButton.setBounds(20, 5, 109, 38);
		frame.getContentPane().add(lblBackButton);
		lblBackButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				D1_Front.main(null);
				frame.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				lblBackButton.setForeground(Color.blue);
			}
			public void mouseExited(MouseEvent e) {
				lblBackButton.setForeground(Color.BLACK);;
			}	
			
		});
		
		JLabel lblAbout = new JLabel(info.Myself);
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblAbout.setForeground(new Color(0, 0, 0));
		lblAbout.setBounds(491, 49, 138, 30);
		frame.getContentPane().add(lblAbout);
		
		//Display Background
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(D1_Front.class.getResource("/Image/2.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}
}
