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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class TelaVisualizar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JTextField txtCPF;
	private JTextField txtCredito;
	private JTextField txtValorParcelas;
	private JTextField txtQuant;
	private JComboBox comboBox;

	private ArrayList<Clientes> listarClientes = new ArrayList<Clientes>();

	ConectaDataBase7 conectaDB = new ConectaDataBase7();




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizar frame = new TelaVisualizar();
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
	public TelaVisualizar() {
		setTitle("Visualizador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.conectaDB.CriaConexao();

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(14, 120, 46, 14);
		contentPane.add(lblNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(14, 156, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblCrdito = new JLabel("Cr\u00E9dito: ");
		lblCrdito.setBounds(14, 195, 64, 14);
		contentPane.add(lblCrdito);

		JLabel lblValorDasParcelas = new JLabel("Valor das parcelas:");
		lblValorDasParcelas.setBounds(14, 256, 121, 14);
		contentPane.add(lblValorDasParcelas);

		JLabel lblQuantVezes = new JLabel("n\u00BA parcelas:");
		lblQuantVezes.setBounds(318, 256, 70, 14);
		contentPane.add(lblQuantVezes);

		txtNomeCliente = new JTextField();
		txtNomeCliente.setEditable(false);
		txtNomeCliente.setBounds(88, 117, 395, 20);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setEditable(false);
		txtCPF.setBounds(88, 153, 169, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		txtCredito = new JTextField();
		txtCredito.setEditable(false);
		txtCredito.setBounds(88, 192, 169, 20);
		contentPane.add(txtCredito);
		txtCredito.setColumns(10);

		txtValorParcelas = new JTextField();
		txtValorParcelas.setEditable(false);
		txtValorParcelas.setBounds(147, 253, 132, 20);
		contentPane.add(txtValorParcelas);
		txtValorParcelas.setColumns(10);

		txtQuant = new JTextField();
		txtQuant.setEditable(false);
		txtQuant.setBounds(398, 253, 60, 20);
		contentPane.add(txtQuant);
		txtQuant.setColumns(10);

		JButton btnContratar = new JButton("Confirmar");
		btnContratar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Obrigado pela escolha. Crédito para Todxs, a melhor opção de crédito pessoal.");

				TelaInicial inico = new TelaInicial();
				inico.setVisible(true);

				setVisible(false);
			}
		});
		btnContratar.setBounds(376, 312, 107, 23);
		contentPane.add(btnContratar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaLogin login = new TelaLogin();
				login.setVisible(true);

				JOptionPane.showMessageDialog(null, "Caso você volte o crédito já vai estar contratado, essa é apenas \n"
						+ "uma tela de visualização.");

				setVisible(false);
			}
		});
		btnVoltar.setBounds(259, 312, 107, 23);
		contentPane.add(btnVoltar);

		comboBox = new JComboBox();
		comboBox.setBounds(51, 24, 408, 20);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				
				
				if(comboBox.getItemCount()!=0 && comboBox.getSelectedIndex() > 0) {
					txtNomeCliente.setText(listarClientes.get(comboBox.getSelectedIndex()).getNomeCliente());
					txtCPF.setText(listarClientes.get(comboBox.getSelectedIndex()).getCPF());
					txtValorParcelas.setText(listarClientes.get(comboBox.getSelectedIndex()).getVarParcelas());
					//txtQuant.setText(listarClientes.get(comboBox.getSelectedIndex()).getQuantParcelas());
					txtCredito.setText(listarClientes.get(comboBox.getSelectedIndex()).getCredito());
			
				}

			}
		});
		contentPane.add(comboBox);

		PreencheLista();
	}

	private void PreencheLista () {	
		
		if(listarClientes.size() == 0)
			listarClientes= this.conectaDB.CarregaTodosClientes();

		comboBox.removeAllItems();

		for (int index = 0; index < listarClientes.size(); index++)
			comboBox.addItem(listarClientes.get(index).getNomeCliente() + " " + listarClientes.get(index).getCPF());				

		return;
	}
}
