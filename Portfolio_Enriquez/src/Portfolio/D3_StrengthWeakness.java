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

public class D3_StrengthWeakness {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D3_StrengthWeakness window = new D3_StrengthWeakness();
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
	public D3_StrengthWeakness() {
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
				
		
		Info4_SH info = new Info4_SH();
		JLabel lblStrengths = new JLabel(info.Strengths);
		lblStrengths.setHorizontalAlignment(SwingConstants.LEFT);
		lblStrengths.setForeground(new Color(0, 0, 0));
		lblStrengths.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStrengths.setBounds(28, 117, 267, 321);
		frame.getContentPane().add(lblStrengths);
		
		JLabel lblWeaknesses = new JLabel(info.Weaknesses);
		lblWeaknesses.setHorizontalAlignment(SwingConstants.LEFT);
		lblWeaknesses.setForeground(new Color(0, 0, 0));
		lblWeaknesses.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWeaknesses.setBounds(438, 117, 267, 321);
		frame.getContentPane().add(lblWeaknesses);
						
		JLabel lblStrength = new JLabel(info.lblStrength);
		lblStrength.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength.setForeground(Color.BLACK);
		lblStrength.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblStrength.setBounds(39, 68, 280, 29);
		frame.getContentPane().add(lblStrength);
						
		JLabel lblWeakness = new JLabel(info.lblWeakness);
		lblWeakness.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeakness.setForeground(Color.BLACK);	
		lblWeakness.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblWeakness.setBounds(425, 68, 280, 29);
		frame.getContentPane().add(lblWeakness);
		
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
		lblBG.setIcon(new ImageIcon(D3_StrengthWeakness.class.getResource("/Image/6.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}

}
