package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCredito2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCredito2 frame = new TelaCredito2();
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
	public TelaCredito2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnR = new JButton("R$15.000");
		btnR.setBounds(10, 47, 93, 23);
		contentPane.add(btnR);
		
		JLabel label = new JLabel("Selecione seu cr\u00E9dito abaixo:");
		label.setBounds(73, -19, 219, 14);
		contentPane.add(label);
		
		JButton btnR_1 = new JButton("R$20.000");
		btnR_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnR_1.setBounds(113, 47, 93, 23);
		contentPane.add(btnR_1);
		
		JButton btnR_2 = new JButton("R$30.000");
		btnR_2.setBounds(249, 47, 89, 23);
		contentPane.add(btnR_2);
		
		JButton btnR_3 = new JButton("R$35.000");
		btnR_3.setBounds(348, 47, 89, 23);
		contentPane.add(btnR_3);
		
		JLabel label_1 = new JLabel("Cr\u00E9dito selecionado (R$):");
		label_1.setBounds(10, 114, 152, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(168, 111, 269, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("       2%");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(168, 149, 71, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("Juros ao m\u00EAs:");
		label_2.setBounds(10, 152, 81, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Quantidade de parcelas:");
		label_3.setBounds(10, 193, 147, 14);
		contentPane.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(168, 190, 71, 20);
		contentPane.add(comboBox);
		
		JLabel label_4 = new JLabel("Valor das parcelas+juros :");
		label_4.setBounds(10, 292, 152, 14);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(168, 289, 123, 20);
		contentPane.add(textField_2);
		
		JButton button_4 = new JButton("Voltar");
		button_4.setBounds(225, 344, 102, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Contratar");
		button_5.setBounds(335, 344, 102, 23);
		contentPane.add(button_5);
		
		JLabel lblSelecioneSeuCrdito = new JLabel("Selecione seu cr\u00E9dito abaixo:");
		lblSelecioneSeuCrdito.setBounds(155, 22, 172, 14);
		contentPane.add(lblSelecioneSeuCrdito);
	}

}
