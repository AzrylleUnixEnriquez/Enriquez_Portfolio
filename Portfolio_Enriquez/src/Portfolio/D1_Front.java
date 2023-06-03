package Portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class D1_Front {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D1_Front window = new D1_Front();
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
	public D1_Front() {
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
		
		//creates a JLabel
		//Display inherited variables
		JLabel lblPortfolioButton = new JLabel(info.Portfolio);
		lblPortfolioButton.setBounds(633, 506, 130, 38);
		lblPortfolioButton.setForeground(new Color(0, 0, 0));
		lblPortfolioButton.setHorizontalAlignment(SwingConstants.LEFT);
		lblPortfolioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(lblPortfolioButton);
		lblPortfolioButton.addMouseListener(new MouseAdapter() {
			@Override
			
			//Turns the JLabel into a button
			public void mouseClicked(MouseEvent e) {
			D2_MainFrame.main(null);
			frame.dispose();
			}
			//When the mouse hover into the JLabel, change the text color of the label to blue
			public void mouseEntered(MouseEvent e) {
			lblPortfolioButton.setForeground(Color.blue);
			}
			//When the mouse does not hover into the JLabel, change the text color of the label to green
			public void mouseExited(MouseEvent e) {
			lblPortfolioButton.setForeground(Color.BLACK);
			}
		});
		//Creates a JTextArea
		//Display inherited variable
		JTextArea txtareaShortDescript = new JTextArea(info.Front);
		txtareaShortDescript.setToolTipText("");
		txtareaShortDescript.setColumns(5);
		txtareaShortDescript.setEditable(false); //Disable edit
		txtareaShortDescript.setBounds(375, 198, 409, 140);
		txtareaShortDescript.setBackground(new Color(0,0,0,0));
		txtareaShortDescript.setForeground(new Color(0, 0, 0));
		txtareaShortDescript.setFont(new Font("Rockwell", Font.BOLD, 20));
		frame.getContentPane().add(txtareaShortDescript);
		
		
		//Display Background
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(D1_Front.class.getResource("/Image/1.png")));
		lblBG.setBounds(0, 0, 784, 574);
		frame.getContentPane().add(lblBG);
	}
}
