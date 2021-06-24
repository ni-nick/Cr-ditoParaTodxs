package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entidades.Clientes;


public class ConectaDataBase7 {

	private Connection conexao = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void CriaConexao() {

		String url = "jdbc:mysql://127.0.0.1:3306/";
		String user = "root";
		String password = "123456";


		try {

			this.conexao =  DriverManager.getConnection(url, user, password);
			this.statement = this.conexao.createStatement();

			//CRIANDO DATA BASE
			String query = "create database if not exists CreditoParaTodxs;";
			String useDB = "USE CreditoParaTodxs;";
			int resultSet = this.statement.executeUpdate(query);
			resultSet = this.statement.executeUpdate(useDB);
			this.statement = this.conexao.createStatement();

		}
		catch(SQLException e) {
			System.out.println("error:  "+e.getMessage());
		}
	}
	
	
	//-------------CADASTRO DOS CLIENTES--------------
	
		public void CriaTabelaClientes(Clientes cliente) {
			
			try {
				String query = "create table if not exists Clientes (IdCliente int primary key auto_increment, NomeCliente varchar(50), CPF varchar(14) , salario float, credito varchar(10), QuantParcelas int, VarParcelas varchar(20);";
				int resulteSet = this.statement.executeUpdate(query);
				this.statement = this.conexao.createStatement();
				
			}catch (SQLException e) {
				System.out.println("error :  "+ e.getMessage());
			}
		}
		
		public boolean CadastrarClientes(Clientes cliente) {
			
			try {
				String query = "insert into Clientes (NomeCliente, CPF, salario, credito, QuantParcelas, VarParcelas) values ('" + cliente.getNomeCliente() + "', '" + cliente.getCPF() +"', '" + cliente.getSalario()+"','" 
																																+ cliente.getCredito() + "','" + cliente.getQuantParcelas() +"','" + cliente.getVarParcelas() +"');";
				int resultSet = this.statement.executeUpdate(query);
				this.statement = this.conexao.createStatement();
				return true;

			}catch (SQLException e) {
				System.out.println("error:  " + e.getMessage());
				return false;
			}
		}
		
		
		//-------------------------CARREGA CLIENTES---------------------------------------------
		
		
		public ArrayList<Clientes> CarregaTodosClientes(){
			
			ArrayList<Clientes> listarClientes = new ArrayList<Clientes>();


			try {			
				String query = "SELECT * FROM Clientes;";
				this.resultSet = this.statement.executeQuery(query);
				this.statement = this.conexao.createStatement();						

				while (this.resultSet.next())
				{
					Clientes cliente = new Clientes();
					
					cliente.setIdCliente(Integer.parseInt(this.resultSet.getString("idCliente")));
					cliente.setNomeCliente(this.resultSet.getString("NomeCliente"));
					cliente.setCPF(this.resultSet.getString("CPF"));
					cliente.setCredito(this.resultSet.getString("credito"));
					cliente.setQuantParcelas(Integer.parseInt(this.resultSet.getString("QuantParcelas")));
					cliente.setVarParcelas(this.resultSet.getString("VarParcelas"));

					 listarClientes.add(cliente);
				}

			}catch (SQLException e) {
				System.out.println("error:  " + e.getMessage());			
			}

			return  listarClientes;	
		}
		
	
	
	



}

