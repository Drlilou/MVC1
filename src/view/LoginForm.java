package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

import controle.PersonControlle;
import model.Person;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class LoginForm extends JFrame {
	PersonControlle pc;

	public LoginForm() {
		this(new PersonControlle());

	}

	public LoginForm(PersonControlle pc) {
		this.pc = pc;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 344);
		setResizable(false);
		setTitle("Log in ");

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Login Form",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(282, 69, 311, 204);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(6, 19, 76, 14);
		panel_4.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(6, 64, 46, 14);
		panel_4.add(lblNewLabel_1);

		username = new JTextField();
		username.setBounds(92, 16, 153, 20);
		panel_4.add(username);
		username.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(92, 61, 153, 20);
		panel_4.add(passwordField);

		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pseudo = username.getText().trim(), password = passwordField.getText();
				if (!pseudo.isEmpty() && !password.isEmpty()) {
					Person peron = new Person(pseudo, password);
					if (pc.loginPerson(peron)) {
						msg(null, "User Exist ", "Succes ", JOptionPane.INFORMATION_MESSAGE);
						vider();
					} else {
						msg(null, "User n'exist pas ", "Error ", JOptionPane.ERROR_MESSAGE);
					}

				} else {
					msg(null, "username or password empty ", "Error ", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnNewButton.setBounds(62, 124, 89, 23);
		panel_4.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vider();
			}
		});
		btnNewButton_1.setBounds(156, 124, 89, 23);
		panel_4.add(btnNewButton_1);

		JLabel lblAlreadyHaveA = new JLabel("don't have compts ");
		lblAlreadyHaveA.setBounds(92, 92, 112, 14);
		panel_4.add(lblAlreadyHaveA);

		JLabel lblClickMe = new JLabel("click me");
		lblClickMe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblClickMe.setForeground(Color.BLUE);
		lblClickMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new SignUpForm(pc).setVisible(true);
			}
		});
		lblClickMe.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 15));
		lblClickMe.setBounds(214, 92, 60, 14);
		panel_4.add(lblClickMe);

		JLabel lblTravailDe = new JLabel("    Login  Form");
		lblTravailDe.setFont(new Font("Yu Gothic UI", Font.BOLD | Font.ITALIC, 25));
		lblTravailDe.setBounds(10, 120, 200, 68);
		panel_3.add(lblTravailDe);

	}

	private void vider() {
		username.setText("");
		passwordField.setText("");
	}

	private void msg(Component c, String message, String title, int messageType) {
		JOptionPane.showMessageDialog(c, message, title, messageType);
	}

	JButton submit, cancel;
	private JTextField username;
	private JPasswordField passwordField;
}