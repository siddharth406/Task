package task;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class EXERCISE3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EXERCISE3 frame = new EXERCISE3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EXERCISE3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setForeground(Color.PINK);
		textField.setBackground(Color.WHITE);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) { if(arg0.getKeyCode() == KeyEvent.VK_UP) {
				textField.setText("FORWARD");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_DOWN) {
				textField.setText("BACKWARD");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_LEFT) {
				textField.setText("LEFT");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
				textField.setText("RIGHT");
			}
			}
		});
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}