package Portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class D3_Hobbies {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D3_Hobbies window = new D3_Hobbies();
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
	public D3_Hobbies() {
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
		
		JLabel lblHobbies = new JLabel(info.Hobbies);
		lblHobbies.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobbies.setForeground(Color.BLACK);
		lblHobbies.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		lblHobbies.setBounds(235, 69, 280, 29);
		frame.getContentPane().add(lblHobbies);
		
		JLabel lblPaint = new JLabel(info.PaintDraw);
		lblPaint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaint.setForeground(Color.BLACK);
		lblPaint.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPaint.setBounds(30, 325, 280, 29);
		frame.getContentPane().add(lblPaint);
		
		JLabel lblCycling = new JLabel(info.Bike);
		lblCycling.setHorizontalAlignment(SwingConstants.CENTER);
		lblCycling.setForeground(Color.BLACK);
		lblCycling.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCycling.setBounds(449, 325, 280, 29);
		frame.getContentPane().add(lblCycling);
		
		JLabel lblWatching = new JLabel(info.watch);
		lblWatching.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatching.setForeground(Color.BLACK);
		lblWatching.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWatching.setBounds(235, 510, 280, 29);
		frame.getContentPane().add(lblWatching);
		
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
		
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(D3_Hobbies.class.getResource("/Image/7.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}
}
