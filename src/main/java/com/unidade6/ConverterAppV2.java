package com.unidade6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class ConverterAppV2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterAppV2 frame = new ConverterAppV2();
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
	public ConverterAppV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 135);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 258, 96);
		getContentPane().add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 105, 20);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setBounds(143, 11, 105, 20);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Fahrenheit:");
		lblNewLabel_1.setBounds(143, 66, 105, 14);
		panel.add(lblNewLabel_1);

		JButton btnNewButton = new JButton();
		btnNewButton.setAction(action);
		btnNewButton.setText("Converter");
		btnNewButton.addActionListener((event -> {
			String value = textField.getText();

			double fahrenheit = (Double.parseDouble(value) * 9 / 5) + 32;

			lblNewLabel_1.setText("Fahrenheit: " + fahrenheit);
		}));
		btnNewButton.setBounds(10, 62, 105, 23);
		panel.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

}
