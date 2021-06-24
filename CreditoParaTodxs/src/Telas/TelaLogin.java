package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConexaoBanco.ConectaDataBase7;
import Entidades.Clientes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JTextField txtCPF;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Login Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 43, 70, 14);
		contentPane.add(lblNome);

		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(103, 40, 307, 20);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 87, 57, 14);
		contentPane.add(lblCpf);

		txtCPF = new JTextField();
		txtCPF.setBounds(103, 84, 307, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JLabel lblSalrioMensalr = new JLabel("Sal\u00E1rio mensal (R$):");
		lblSalrioMensalr.setBounds(10, 158, 139, 14);
		contentPane.add(lblSalrioMensalr);

		JLabel label = new JLabel("");
		label.setBounds(103, 263, 46, 14);
		contentPane.add(label);

		txtSalario = new JTextField();
		txtSalario.setBounds(172, 155, 179, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaInicial inicio = new TelaInicial();
				inicio.setVisible(true);

				setVisible(false);
			}
		});
		btnVoltar.setBounds(80, 289, 113, 23);
		contentPane.add(btnVoltar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Clientes cliente = new Clientes();

				cliente.setNomeCliente(txtNomeCliente.getText());
				cliente.setCPF(txtCPF.getText());
				cliente.setSalario(Float.parseFloat(txtSalario.getText()));


				ConectaDataBase7 conectaDB = new ConectaDataBase7();
				conectaDB.CriaConexao();


				if(cliente.getSalario() <1500) {
					JOptionPane.showMessageDialog(null, "Desculpe saldo muito baixo. Valor mínimo a ser inserido R$1500,00");
				}
				
				else if(conectaDB.CadastrarClientes(cliente)) {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!  Verifique seu crédito disponível.");
				}
				else
					JOptionPane.showMessageDialog(null, "Cadastro inválido. Não foi possível cadastrar cliente!");



				if(cliente.getSalario() >= 1500 && cliente.getSalario() <= 5000 ) {
					TelaCredito1 credito1 = new TelaCredito1();
					credito1.setVisible(true);
				}


				else if (cliente.getSalario() >= 5001 && cliente.getSalario() <= 15000) {
					TelaCredito2 credito2 = new TelaCredito2();
					credito2.setVisible(true);

				}

				else if (cliente.getSalario() >= 15001 && cliente.getSalario() <= 25000) {
					TelaCredito3 credito3 = new TelaCredito3();
					credito3.setVisible(true);

				}
				else if (cliente.getSalario() >= 25001 && cliente.getSalario() <= 40000 || cliente.getSalario() > 40000) {
					TelaCredito4 credito4 = new TelaCredito4();
					credito4.setVisible(true);

				}

				setVisible(false);
			}
		});
		btnCadastrar.setBounds(326, 289, 113, 23);
		contentPane.add(btnCadastrar);

		JLabel lblFavorInserirValores = new JLabel("Favor inserir valores sem pontua\u00E7\u00E3o");
		lblFavorInserirValores.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblFavorInserirValores.setBounds(182, 179, 179, 14);
		contentPane.add(lblFavorInserirValores);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtNomeCliente.setText("");
				txtCPF.setText("");
				txtSalario.setText("");
			}
		});
		btnLimpar.setBounds(203, 288, 113, 23);
		contentPane.add(btnLimpar);
	}
}
