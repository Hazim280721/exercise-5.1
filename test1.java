import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test1 {

	private JFrame frame;
	private JTextField textField_Num1;
	private JTextField textField_Num2;
	private JTextField textField_2;
    private JLabel lblNewLabel;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
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
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Num1 = new JTextField();
		textField_Num1.setBounds(80, 91, 136, 31);
		frame.getContentPane().add(textField_Num1);
		textField_Num1.setColumns(10);
		
		textField_Num2 = new JTextField();
		textField_Num2.setBounds(318, 91, 136, 31);
		frame.getContentPane().add(textField_Num2);
		textField_Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField_Num1.getText());
					num2=Integer.parseInt(textField_Num2.getText());
					
					ans=num1+num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(80, 151, 136, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textField_Num1.getText());
					num2=Integer.parseInt(textField_Num2.getText());
					
					ans=num1-num2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(318, 151, 136, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("The Answer Is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(80, 238, 136, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 240, 136, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
