package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConexaoBanco.ConectaDataBase7;
import Entidades.Clientes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class TelaCredito1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSelectCredito;
	private JTextField textField;
	private JTextField txtValorF;
	private JComboBox comboBox;
	private int cont =0;
	private double aux = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCredito1 frame = new TelaCredito1();
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
	public TelaCredito1() {
		setTitle("Cr\u00E9dito 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JOptionPane.showMessageDialog(null, "Infelizmente tivemos um erro em nosso sistema. \n"
									+"Favor utilizar o valor a seguir de R$5.000,00 como base de todos os outros cálculos. \n"
									+"Clique no 'OK' para continuar.");
		

		JButton btnNewButton = new JButton("R$5.000");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtSelectCredito.setText("5.000");

			}

		});
		btnNewButton.setBounds(10, 48, 93, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("R$10.000");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtSelectCredito.setText("10.000");

				if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 1) {
					aux = 10000 * (0.02 * 6);
					double auxiliar = aux +10000;
					auxiliar = auxiliar / 6;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 2) {
					aux = 10000 * (0.02 * 12);
					double auxiliar = aux +10000;
					auxiliar = auxiliar / 12;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));

				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 3) {
					aux = 10000 * (0.02 * 24);
					double auxiliar = aux +10000;
					auxiliar = auxiliar / 24;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));

				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 4) {
					aux = 10000 * (0.02 * 36);
					double auxiliar = aux +10000;
					auxiliar = auxiliar / 36;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));

				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 5) {
					aux = 10000 * (0.02 * 48);
					double auxiliar = aux +10000;
					auxiliar = auxiliar / 48;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));

				}
			}
		});
		btnNewButton_1.setBounds(113, 48, 93, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("R$15.000");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtSelectCredito.setText("15.000");
				
				if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 1) {
					aux = 15000 * (0.02 * 6);
					double auxiliar = aux +15000;
					auxiliar = auxiliar / 6;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 2) {
					aux = 15000 * (0.02 * 12);
					double auxiliar = aux +15000;
					auxiliar = auxiliar / 12;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 3) {
					aux = 15000 * (0.02 * 24);
					double auxiliar = aux +15000;
					auxiliar = auxiliar / 24;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 4) {
					aux = 15000 * (0.02 * 36);
					double auxiliar = aux +15000;
					auxiliar = auxiliar / 36;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 5) {
					aux = 15000 * (0.02 * 48);
					double auxiliar = aux +15000;
					auxiliar = auxiliar / 48;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
			}
		});
		btnNewButton_2.setBounds(249, 48, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("R$20.000");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtSelectCredito.setText("20.000");
				
				if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 1) {
					aux = 20000 * (0.02 * 6);
					double auxiliar = aux +20000;
					auxiliar = auxiliar / 6;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 2) {
					aux = 20000 * (0.02 * 12);
					double auxiliar = aux +20000;
					auxiliar = auxiliar / 12;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 3) {
					aux = 20000 * (0.02 * 24);
					double auxiliar = aux +20000;
					auxiliar = auxiliar / 24;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 4) {
					aux = 20000 * (0.02 * 36);
					double auxiliar = aux +20000;
					auxiliar = auxiliar / 36;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
				
				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 5) {
					aux = 20000 * (0.02 * 48);
					double auxiliar = aux +20000;
					auxiliar = auxiliar / 48;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
				}
			}
		});
		btnNewButton_3.setBounds(348, 48, 89, 23);
		contentPane.add(btnNewButton_3);

		JLabel lblCrditoSelecionado = new JLabel("Cr\u00E9dito selecionado (R$):");
		lblCrditoSelecionado.setBounds(10, 115, 152, 14);
		contentPane.add(lblCrditoSelecionado);

		txtSelectCredito = new JTextField();
		txtSelectCredito.setBounds(168, 112, 269, 20);
		contentPane.add(txtSelectCredito);
		txtSelectCredito.setColumns(10);

		JLabel lblSelecioneSeuCrdito = new JLabel("Selecione seu cr\u00E9dito abaixo:");
		lblSelecioneSeuCrdito.setBounds(133, 11, 219, 14);
		contentPane.add(lblSelecioneSeuCrdito);

		JButton btnConfirmar = new JButton("Contratar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Clientes cliente = new Clientes();
				
				cliente.setCredito(txtSelectCredito.getText());
				cliente.setVarParcelas(txtValorF.getText());
				cliente.setQuantParcelas(cont);
				
				ConectaDataBase7 conectaDB = new ConectaDataBase7();
				conectaDB.CriaConexao();
				
				
				if(conectaDB.CadastrarClientes(cliente)) {
					JOptionPane.showMessageDialog(null, "Crédito selecionado com sucesso.");
					TelaVisualizar visualiza = new TelaVisualizar();
					visualiza.setVisible(true);
					
					
					setVisible(false);
					
				}
				else 
					JOptionPane.showMessageDialog(null, "Crédito inválido. Não foi possível acessar o crédito!");
	
			}
			
	
			
		});
		btnConfirmar.setBounds(335, 345, 102, 23);
		contentPane.add(btnConfirmar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaLogin login = new TelaLogin();
				login.setVisible(true);

				setVisible(false);
			}
		});
		btnVoltar.setBounds(225, 345, 102, 23);
		contentPane.add(btnVoltar);

		JLabel lblQuantidadeDeParcelas = new JLabel("Quantidade de parcelas:");
		lblQuantidadeDeParcelas.setBounds(10, 194, 147, 14);
		contentPane.add(lblQuantidadeDeParcelas);

		comboBox = new JComboBox();
		comboBox.setBounds(168, 191, 71, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {



				if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 1) {
					cont = 6;
					
					aux = 5000 * (0.02 * 6);
					double auxiliar = aux +5000;
					auxiliar = auxiliar / 6;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
					txtSelectCredito.setText("5.000");

				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 2) {
					cont = 12;
					
					aux = 5000 * (0.02 * 12);
					double auxiliar = aux +5000;
					auxiliar = auxiliar / 12;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
					txtSelectCredito.setText("5.000");
				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 3) {
					cont = 24;
					
					aux = 5000 * (0.02 * 24);
					double auxiliar = aux +5000;
					auxiliar = auxiliar / 24;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
					txtSelectCredito.setText("5.000");
				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 4) {
					cont = 36;
					
					aux = 5000 * (0.02 * 36);
					double auxiliar = aux +5000;
					auxiliar = auxiliar / 36;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
					txtSelectCredito.setText("5.000");
				}

				else if(comboBox.getItemCount() != 0 && comboBox.getSelectedIndex() == 5) {
					cont = 48;
					
					aux = 5000 * (0.02 * 48);
					double auxiliar = aux +5000;
					auxiliar = auxiliar / 48;

					txtValorF.setText("R$" +toString().valueOf(auxiliar));
					txtSelectCredito.setText("5.000");
				}

			}

		});
		contentPane.add(comboBox);

		JLabel lblJurosAoMs = new JLabel("Juros ao m\u00EAs:");
		lblJurosAoMs.setBounds(10, 153, 81, 14);
		contentPane.add(lblJurosAoMs);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("       2%");
		textField.setBounds(168, 150, 71, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblValorDasParcelasjuros = new JLabel("Valor das parcelas+juros :");
		lblValorDasParcelasjuros.setBounds(10, 293, 152, 14);
		contentPane.add(lblValorDasParcelasjuros);

		txtValorF = new JTextField();
		txtValorF.setEditable(false);
		txtValorF.setBounds(168, 290, 123, 20);
		contentPane.add(txtValorF);
		txtValorF.setColumns(10);

		PreencheComboBox();
	}

	public void PreencheComboBox() {

		comboBox.addItem(" ");
		comboBox.addItem("6 x");
		comboBox.addItem("12 x");
		comboBox.addItem("24 x");
		comboBox.addItem("36 x");
		comboBox.addItem("48 x");

	}
}
