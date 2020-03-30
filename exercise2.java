import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class exercise2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercise2 frame = new exercise2();
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
	public exercise2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) { if(arg0.getKeyCode() == KeyEvent.VK_UP) {
				textField.setText("Up");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_DOWN) {
				textField.setText("Down");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_LEFT) {
				textField.setText("Left");
			}
			else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
				textField.setText("Right");
			}
			}
		});
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
	}

}
