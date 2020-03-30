package dice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	}

	public class View extends javax.swing.JFrame {

	    private Controller controller;

	    public View() {
	        initComponents();
	    }

	    public void RegisterController (Controller controller) {
	        this.controller = controller;
	    }
	    
	    public void setDiceNumber (int value) {
	        jTextField1.setText(String.valueOf(value));
	    }
	 
	    // Clip –Possibly generated code here!!
	}
	}


