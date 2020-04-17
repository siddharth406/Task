package samProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class Input_table1 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create new form Student from
	 */
	public Input_table1() {
		initComponents();
		MySqlConnection();
	}
	
	private void initComponents() {
		// TODO Auto-generated method stub
		
	}

	public Connection MySqlConnection() {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root" , "LOVE4you");
			JOptionPane.showMessageDialog(null, "Mysql Connection Connected Succesfully...");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Mysql Connection Failed...");
			return null;
	}
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final JTable table = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input_table1 frame = new Input_table1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void Input_table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1270, 821);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("HAMK University of Applied Science");
		label1.setBounds(12, 13, 1278, 46);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("Election Info");
		lblNewLabel.setBounds(489, 72, 210, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\siddh\\OneDrive\\Desktop\\SAM project\\HAMK.jpg"));
		lblNewLabel_1.setBounds(12, 84, 170, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Candidate Informaation");
		lblNewLabel_2.setBounds(489, 133, 134, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("id");
		lblNewLabel_3.setBounds(223, 187, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Candidate Name");
		lblNewLabel_4.setBounds(223, 244, 134, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("age");
		lblNewLabel_5.setBounds(223, 305, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setBounds(223, 379, 117, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("goal");
		lblNewLabel_7.setBounds(223, 408, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Photo");
		lblNewLabel_8.setBounds(997, 171, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(445, 184, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(445, 241, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(445, 302, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(445, 405, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(445, 370, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("label_photo");
		lblNewLabel_9.setBounds(1056, 270, 106, 16);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setBounds(708, 183, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insert/save");
		btnNewButton_1.setBounds(708, 240, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(708, 270, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Date");
		btnNewButton_3.setBounds(708, 375, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("win");
		lblNewLabel_10.setBounds(223, 470, 56, 16);
		contentPane.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(445, 467, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Search Candidate by Name");
		lblNewLabel_11.setBounds(708, 453, 175, 16);
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(935, 450, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Select Photo");
		btnNewButton_4.setBounds(1095, 167, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setBounds(386, 333, 113, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Female");
		chckbxNewCheckBox_1.setBounds(503, 333, 113, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_12 = new JLabel("Gender");
		lblNewLabel_12.setBounds(212, 334, 56, 16);
		contentPane.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Other");
		chckbxNewCheckBox_2.setBounds(620, 333, 113, 25);
		contentPane.add(chckbxNewCheckBox_2);
		table.setBounds(38, 551, 1154, 159);
		contentPane.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
	}
}
