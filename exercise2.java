package task;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;

public class exercise2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDown_1;
	private JTextField txtLeft;
	private JTextField txtRight;
	private JTextField txtDown;
	private JTextField txtUp;

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
		
		txtDown_1 = new JTextField();
		txtDown_1.setText("down");
		contentPane.add(txtDown_1, BorderLayout.WEST);
		txtDown_1.setColumns(10);
		
		txtLeft = new JTextField();
		txtLeft.setText("left");
		contentPane.add(txtLeft, BorderLayout.SOUTH);
		txtLeft.setColumns(10);
		
		txtRight = new JTextField();
		txtRight.setText("right");
		contentPane.add(txtRight, BorderLayout.NORTH);
		txtRight.setColumns(10);
		
		txtDown = new JTextField();
		txtDown.setBackground(Color.BLACK);
		txtDown.setForeground(Color.WHITE);
		txtDown.setText("center");
		contentPane.add(txtDown, BorderLayout.CENTER);
		txtDown.setColumns(10);
		
		txtUp = new JTextField();
		txtUp.setText("up");
		contentPane.add(txtUp, BorderLayout.EAST);
		txtUp.setColumns(10);
	}

}
