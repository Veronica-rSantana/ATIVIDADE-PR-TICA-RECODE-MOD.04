package br.com.crud.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	import br.com.crud.factory.ConnectionFactory;
	import br.com.crud.model.Passagens;


	public class PassagemDAO {
		public void save(Passagens passagens) {
			
			String sql = "INSERT INTO Passagens(id_passagem, Origem, Destino, DataIda, DataVolta, Valor)" + "VALUES(?,?,?,?,?,?)";

			Connection conn = null;
			PreparedStatement pstm = null;

			try {
				
					conn = ConnectionFactory.createConnectionSQLServer();
					pstm = conn.prepareStatement(sql);
	
					pstm.setInt(1, passagens.getId_passagem());				
					pstm.setString(2, passagens.getOrigem());
					pstm.setString(3, passagens.getDestino());
					pstm.setString(4, passagens.getDataIda());
					pstm.setString(5, passagens.getDataVolta());
					pstm.setFloat(6, passagens.getValor());
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
			String sql = "DELETE FROM Passagens WHERE Id = ?";

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

		public void update(Passagens passagens) {
			String sql = "UPDATE Passagens SET Origem= ?, Destino =?, DataIda=?, DataVolta=?, Valor=? WHERE id_passagem = ?";

			Connection conn = null;
			PreparedStatement pstm = null;

				try {				
						conn = ConnectionFactory.createConnectionSQLServer();
						pstm = conn.prepareStatement(sql);
		
										
						pstm.setString(1, passagens.getOrigem());				
						pstm.setString(2, passagens.getDestino());
						pstm.setString(3, passagens.getDataIda());
						pstm.setString(4, passagens.getDataVolta());				
						pstm.setFloat(5, passagens.getValor());
						pstm.setInt(6, passagens.getId_passagem());
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
		public List<Passagens> getPassagens(){

			String sql = "SELECT * FROM Passagens";

			List<Passagens> passagens = new ArrayList<Passagens>();

				Connection conn = null;
				PreparedStatement pstm = null;			
				ResultSet rset = null;

			try {
					conn = ConnectionFactory.createConnectionSQLServer();	
					pstm = conn.prepareStatement(sql);	
					rset = pstm.executeQuery();
				
				while (rset.next()) {
					Passagens passagem = new Passagens();
					
					passagem.setId_passagem(rset.getInt("id_passagem"));					
					passagem.setOrigem(rset.getString("Origem"));					
					passagem.setDestino(rset.getString("Destino"));
					passagem.setDataIda(rset.getString("DataIda"));
					passagem.setDataVolta(rset.getString("DataVolta"));
					passagem.setValor(rset.getFloat("Valor"));
					
					passagens.add(passagem);
				}
			} catch (Exception e) {
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return passagens;
		}
		
	}
