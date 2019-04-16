package JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void SFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrame frame = new SecondFrame();
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
	public SecondFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(255, 114, 129, 45);
		contentPane.add(btnSignUp);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login nw = new Login();
				nw.LogIn();
				setVisible(false);
			}
		});
		btnLogin.setBounds(50, 114, 129, 45);
		contentPane.add(btnLogin);
		
		JLabel lblLoginOrCrea = new JLabel("Login or Create an Account");
		lblLoginOrCrea.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginOrCrea.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginOrCrea.setBounds(10, 30, 416, 45);
		contentPane.add(lblLoginOrCrea);
	}

}
