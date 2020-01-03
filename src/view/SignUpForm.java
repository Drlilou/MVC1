package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import controle.PersonControlle;
import model.Person;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JTextField firstnametextField;
	private JTextField lastnametextField;
	private JTextField pseudotextField;
	private JTextField mailtextField;
	private JTextField telephonetextField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	PersonControlle pc = new PersonControlle();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm(new PersonControlle());
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
	public SignUpForm(PersonControlle pc) {
		setResizable(false);
		setTitle("sign up");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_13 = new JPanel();
		panel.add(panel_13, BorderLayout.NORTH);

		JLabel lblRegistrationForm = new JLabel("Registration form");
		panel_13.add(lblRegistrationForm);
		lblRegistrationForm.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));

		JPanel panel_12 = new JPanel();
		panel.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblAlreadyHaveCompt = new JLabel("already have compt  ");
		lblAlreadyHaveCompt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblAlreadyHaveCompt.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 13));
		lblAlreadyHaveCompt.setForeground(Color.BLUE);
		panel_12.add(lblAlreadyHaveCompt);
		lblAlreadyHaveCompt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new LoginForm(pc).setVisible(true);
			}
		});

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Personal Data",
				TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_6.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(null);

		JLabel lblNewLabel = new JLabel("FirstName");
		lblNewLabel.setBounds(10, 11, 70, 20);
		panel_11.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("LastName");
		lblNewLabel_1.setBounds(238, 11, 60, 20);
		panel_11.add(lblNewLabel_1);

		firstnametextField = new JTextField();
		firstnametextField.setBounds(90, 11, 121, 20);
		panel_11.add(firstnametextField);
		firstnametextField.setColumns(10);

		lastnametextField = new JTextField();
		lastnametextField.setBounds(329, 11, 121, 20);
		panel_11.add(lastnametextField);
		lastnametextField.setColumns(10);

		JPanel panel_8 = new JPanel();
		panel_8.setForeground(Color.BLACK);

		panel_6.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Pseudo");
		lblNewLabel_2.setBounds(10, 23, 88, 27);
		panel_8.add(lblNewLabel_2);

		pseudotextField = new JTextField();
		pseudotextField.setBounds(157, 26, 256, 20);
		panel_8.add(pseudotextField);
		pseudotextField.setColumns(10);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contact ", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 22, 47, 34);
		panel_9.add(lblEmail);

		mailtextField = new JTextField();
		mailtextField.setBounds(74, 29, 124, 20);
		panel_9.add(mailtextField);
		mailtextField.setColumns(10);

		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(251, 22, 65, 34);
		panel_9.add(lblTelephone);

		telephonetextField = new JTextField();
		telephonetextField.setBounds(329, 30, 121, 20);
		panel_9.add(telephonetextField);
		telephonetextField.setColumns(10);

		JLabel lblOb = new JLabel("at least 1 field must be completed");
		lblOb.setForeground(Color.RED);
		lblOb.setBounds(329, 56, 201, 14);
		panel_9.add(lblOb);
		lblOb.setVisible(false);
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PassWord", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.add(panel_10);
		panel_10.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Confirmation");
		lblNewLabel_3.setBounds(243, 23, 61, 35);
		panel_10.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(74, 29, 124, 20);
		panel_10.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(329, 30, 121, 20);
		panel_10.add(passwordField_1);

		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(20, 28, 61, 25);
		panel_10.add(lblNewLabel_4);

		JLabel label = new JLabel("*");
		label.setBounds(208, 33, 46, 14);
		panel_10.add(label);

		JLabel lblPasswordDoitEtre = new JLabel("both of passwords must be equal");
		lblPasswordDoitEtre.setForeground(Color.RED);
		lblPasswordDoitEtre.setBounds(329, 61, 201, 14);
		panel_10.add(lblPasswordDoitEtre);
		lblPasswordDoitEtre.setVisible(false);
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname, lastname, pseudo, email, telephone, mdp, mdpconf;
				firstname = firstnametextField.getText().trim();
				lastname = lastnametextField.getText().trim();
				pseudo = pseudotextField.getText().trim();
				email = mailtextField.getText().trim();
				telephone = telephonetextField.getText().trim();
				mdp = passwordField.getText();
				mdpconf = passwordField_1.getText();
				boolean b = isEmpty();

				if (!b) {
					msg(null, "something wrong ", "Error ", JOptionPane.ERROR_MESSAGE);
					if (!personel) {
						panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"compulsory if no first and last name", TitledBorder.RIGHT, TitledBorder.BOTTOM, null,
								new Color(255, 0, 0)));
					} else {
						panel_8.setBorder(null);
					}
					if (!contact) {
						lblOb.setVisible(true);
					} else {
						lblOb.setVisible(false);
					}
					if (!checkmdp) {
						lblPasswordDoitEtre.setVisible(true);
					} else {
						lblPasswordDoitEtre.setVisible(false);
					}
				} else {
					Person p = new Person(firstname, lastname, pseudo, email, telephone, mdp);

					if (pc.addPerson(p)) {
						msg(null, "User added successfully  ", "Succes ", JOptionPane.INFORMATION_MESSAGE);
						vider();
						panel_8.setBorder(null);
						lblPasswordDoitEtre.setVisible(false);
						lblOb.setVisible(false);

					} else {
						msg(null, "User already exist ", "error ", JOptionPane.ERROR_MESSAGE);

					}

				}

			}
		});
		panel_5.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("reset");
		panel_5.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
	}

	private boolean isEmpty() {
		String firstname, lastname, pseudo, email, telephone, mdp, mdpconf;
		firstname = firstnametextField.getText().trim();
		lastname = lastnametextField.getText().trim();
		pseudo = pseudotextField.getText().trim();
		email = mailtextField.getText().trim();
		telephone = telephonetextField.getText().trim();
		mdp = passwordField.getText();
		mdpconf = passwordField_1.getText();

		personel = (!firstname.isEmpty() && !lastname.isEmpty()) || !pseudo.isEmpty();

		contact = !email.isEmpty() || !telephone.isEmpty();

		checkmdp = mdp.equals(mdpconf) && !mdp.isEmpty();

		return personel && contact && checkmdp;
	}

	boolean personel, contact, checkmdp;

	private void vider() {
		firstnametextField.setText("");
		lastnametextField.setText("");
		pseudotextField.setText("");
		mailtextField.setText("");
		telephonetextField.setText("");
		passwordField.setText("");
		passwordField_1.setText("");

	}

	private void msg(Component c, String message, String title, int messageType) {
		JOptionPane.showMessageDialog(c, message, title, messageType);
	}
}
