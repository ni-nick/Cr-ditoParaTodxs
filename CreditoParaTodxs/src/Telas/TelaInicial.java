package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSejaBemVindo = new JLabel("Credito para Todxs");
		lblSejaBemVindo.setForeground(new Color(128, 0, 128));
		lblSejaBemVindo.setBackground(Color.WHITE);
		lblSejaBemVindo.setFont(new Font("Frank Ruehl CLM", Font.BOLD, 18));
		lblSejaBemVindo.setBounds(83, 35, 168, 40);
		contentPane.add(lblSejaBemVindo);
		
		JLabel lblOJeitoDe = new JLabel("O melhor jeito de possuir o cr\u00E9dito pessoal");
		lblOJeitoDe.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOJeitoDe.setBounds(47, 73, 204, 14);
		contentPane.add(lblOJeitoDe);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin login = new TelaLogin();
				login.setVisible(true);
				
				setVisible(false);
			}
		});
		btnLogin.setBounds(67, 157, 140, 32);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setBounds(24, 225, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(60, 250, 46, 14);
		contentPane.add(label_1);
		
		JButton btnSobreOAplicativo = new JButton("Sobre o aplicativo");
		btnSobreOAplicativo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Crédito para Todxs é um app voltado para a consulta de crédito pessoal. \n"
						+ "De forma rápida e simples você consegue saber os créditos disponíveis para você, \n"
						+ "basta apenas informar seu salário. \n"
						+ "Crédito para Todxs é a melhor opção para adquirir seu crédito pessoal.");
			}
		});
		btnSobreOAplicativo.setBounds(67, 200, 140, 32);
		contentPane.add(btnSobreOAplicativo);
		
		JLabel lblSejaBemVindo_1 = new JLabel("Seja Bem Vindo ao");
		lblSejaBemVindo_1.setForeground(new Color(128, 0, 128));
		lblSejaBemVindo_1.setFont(new Font("Frank Ruehl CLM", Font.BOLD, 18));
		lblSejaBemVindo_1.setBackground(Color.WHITE);
		lblSejaBemVindo_1.setBounds(27, 11, 168, 40);
		contentPane.add(lblSejaBemVindo_1);
	}
}
