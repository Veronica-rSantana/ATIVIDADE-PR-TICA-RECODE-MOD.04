package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cadastro;

public class CadastroDAO {
	
	
	public void save(Cadastro cadastro) {
		String sql = "INSERT INTO Cadastro(Nome,Cpf,Email,Telefone,Cidade,Estado)" + "VALUES(?,?,?,?,?,?)";

			Connection conn = null;
			PreparedStatement pstm = null;
		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cadastro.getNome());			
			pstm.setString(2, cadastro.getCpf());
			pstm.setString(3, cadastro.getEmail());
			pstm.setString(4, cadastro.getTelefone());
			pstm.setString(5, cadastro.getCidade());
			pstm.setString(6, cadastro.getEstado());
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
				try {
						if (pstm != null) {
							pstm.close();
						}
						if (conn != null) {
							conn.close();
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM cadastro WHERE id_cliente = ?";

			Connection conn = null;
			PreparedStatement pstm = null;

			try {
					conn = ConnectionFactory.createConnectionSQLServer();		
					pstm = conn.prepareStatement(sql);		
					pstm.setInt(1, id);		
					pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
						if (pstm != null) {
							pstm.close();
						}
		
						if (conn != null) {
							conn.close();
						}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Cadastro cadastro) {
		String sql = "UPDATE cadastro SET Nome = ?, Cpf =?,Email =?,Telefone =?,Cidade =?,Estado = ? WHERE id_cliente = ?";

			Connection conn = null;
			PreparedStatement pstm = null;

		try {
			
			conn = ConnectionFactory.createConnectionSQLServer();			
			pstm = conn.prepareStatement(sql);	
			
			pstm.setInt(1,cadastro.getId_cliente());
			pstm.setString(2, cadastro.getNome());
			pstm.setString(3, cadastro.getCpf());
			pstm.setString(4, cadastro.getEmail());
			pstm.setString(5, cadastro.getTelefone());
			pstm.setString(6,cadastro.getCidade());
			pstm.setString(7,cadastro.getEstado());
			pstm.execute();

		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			
				try {
						if (pstm != null) {
							pstm.close();
						}
						if (conn != null) {
							conn.close();
						}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Cadastro> getCadastro() {

		String sql = "SELECT * FROM cadastro";

			List<Cadastro> cadastros = new ArrayList<Cadastro>();

				Connection conn = null;
				PreparedStatement pstm = null;
				ResultSet rset = null;

				try {
					conn = ConnectionFactory.createConnectionSQLServer();		
					pstm = conn.prepareStatement(sql);		
					rset = pstm.executeQuery();
					
				while (rset.next()) {
			Cadastro cadastro = new Cadastro();

				cadastro.setId_cliente(rset.getInt("id_cliente"));
				cadastro.setNome(rset.getString("Nome"));
				cadastro.setCpf(rset.getString("Cpf"));
				cadastro.setEmail(rset.getString("Email"));
				cadastro.setTelefone(rset.getString("Telefone"));
				cadastro.setCidade(rset.getString("Cidade"));
				cadastro.setEstado(rset.getString("Estado"));
				
				cadastros.add(cadastro);
			}
		} 
			catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if (rset != null) {
						rset.close();
					}
					if (pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cadastros;
	}
}
