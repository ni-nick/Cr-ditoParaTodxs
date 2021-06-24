package Entidades;

public class Clientes {
	
	private int IdCliente;
	private String NomeCliente;
	private String CPF;
	private float salario;
	private String credito;
	private int QuantParcelas;
	private String VarParcelas;
	

	public int getIdCliente() {
		return IdCliente;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public String getCPF() {
		return CPF;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	public String getCredito() {
		return credito;
	}
	public int getQuantParcelas() {
		return QuantParcelas;
	}
	public String getVarParcelas() {
		return VarParcelas;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public void setQuantParcelas(int quantParcelas) {
		QuantParcelas = quantParcelas;
	}
	public void setVarParcelas(String varParcelas) {
		VarParcelas = varParcelas;
	}

	
	

}
