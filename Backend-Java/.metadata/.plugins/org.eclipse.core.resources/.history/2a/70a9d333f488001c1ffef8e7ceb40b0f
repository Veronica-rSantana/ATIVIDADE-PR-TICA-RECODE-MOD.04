package br.com.crud.teste;
import java.util.Date;

import br.com.crud.dao.ContatoDAO;
import br.com.crud.model.Contato;

public class TesteCrud {

	public static void main(String[] args) {
		ContatoDAO contatoDAO = new ContatoDAO();
		
		// ------------ Cria um contato e salva no banco
		Contato contato = new Contato();
		contato.setNome("Izadora");
		contato.setIdade(25);
		contato.setDataCadastro(new Date());
		
		contatoDAO.save(contato);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		/*Contato contato1 = new Contato();
		contato1.setId(1);
		contato1.setNome("Izadora");
		contato1.setIdade(25);
		contato1.setDataCadastro(new Date());
		
		contatoDAO.update(contato1);*/
		
		// ------------ Remove o contato com id
		// contatoDAO.removeById(2);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("Nome: " + c.getNome());
		}
	}
}
