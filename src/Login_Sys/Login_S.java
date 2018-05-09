package Login_Sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import FrostAL_PRO.App_Pro;

public class Login_S {

	private JFrame frame;
	private JTextField userNameInput;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(200, 200, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("FrostAL\u00AE Cryogenic Software");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto Lt", Font.PLAIN, 22));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(0, 22, 312, 27);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblUserName.setBounds(32, 92, 80, 14);
		frame.getContentPane().add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblPassword.setBounds(32, 134, 80, 14);
		frame.getContentPane().add(lblPassword);

		userNameInput = new JTextField();
		userNameInput.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		userNameInput.setBounds(105, 89, 205, 20);
		frame.getContentPane().add(userNameInput);
		userNameInput.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		passwordField.setBounds(105, 131, 205, 20);
		frame.getContentPane().add(passwordField);

		JLabel lblPlease = new JLabel("Please enter your username and password");
		lblPlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlease.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		lblPlease.setBounds(64, 58, 226, 14);
		frame.getContentPane().add(lblPlease);
		Image img = new ImageIcon(this.getClass().getResource("/logo_r.png")).getImage();
		Image imgNexelia = new ImageIcon(this.getClass().getResource("/nexelia.png")).getImage();

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String password = passwordField.getText();
				String userName = userNameInput.getText();

				if (password.contentEquals("admin") && userName.contentEquals("admin")) {
					passwordField.setText(null);
					userNameInput.setText(null);

					App_Pro.main(null);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					userNameInput.setText(null);
				}

			}
		});
		btnNewButton.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setBounds(32, 174, 80, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userNameInput.setText(null);
				passwordField.setText(null);

			}
		});
		btnNewButton_1.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		btnNewButton_1.setBackground(SystemColor.window);
		btnNewButton_1.setBounds(131, 174, 80, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		btnNewButton_2.setVerticalAlignment(SwingConstants.CENTER);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_2.setForeground(SystemColor.textText);
		btnNewButton_2.setFont(new Font("Roboto Lt", Font.PLAIN, 11));
		btnNewButton_2.setEnabled(true);
		btnNewButton_2.setBackground(SystemColor.window);
		btnNewButton_2.setBounds(230, 174, 80, 23);
		frame.getContentPane().add(btnNewButton_2);
		
				JLabel lblALlogo = new JLabel("");
				lblALlogo.setHorizontalAlignment(SwingConstants.CENTER);
				lblALlogo.setIcon(new ImageIcon(img));
				lblALlogo.setBounds(310, 35, 164, 173);
				frame.getContentPane().add(lblALlogo);
				
				JLabel lblNexelia = new JLabel("");
				lblNexelia.setBounds(10, 197, 464, 142);
				lblNexelia.setHorizontalAlignment(SwingConstants.CENTER);
				lblNexelia.setIcon(new ImageIcon(imgNexelia));
				frame.getContentPane().add(lblNexelia);

	}
}
