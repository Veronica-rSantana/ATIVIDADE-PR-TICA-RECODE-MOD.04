package br.com.crud.model;

public class Cadastro {
	
	private int id_cliente;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String cidade;
	private String estado;
	
	
		public int getId_cliente() {
			return id_cliente;
		}
		public void setId_cliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
	}
}
	