package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Destino;


public class DestinoDAO {
	public void save(Destino destino) {
		
		String sql = "INSERT INTO Destino(id_destino, Cidade_destino, Estado_destino)" + "VALUES(?,?,?)";

			Connection conn = null;
			PreparedStatement pstm = null;

		try {			
				conn = ConnectionFactory.createConnectionSQLServer();	
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1,destino.getId_destino());			
				pstm.setString(2, destino.getCidade_Destino());
				pstm.setString(3, destino.getEstado_Destino());				
				pstm.execute();
			} 
		
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {			
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
	public void removeById(int id) {
		String sql = "DELETE FROM Destino WHERE Id = ?";

			Connection conn = null;
			PreparedStatement pstm = null;
				try {
						conn = ConnectionFactory.createConnectionSQLServer();
			
						pstm = conn.prepareStatement(sql);
			
						pstm.setInt(1, id);
			
						pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
					}
				finally {
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
	public void update(Destino destino) {
		String sql = "UPDATE Destino SET Cidade_destino= ?, Estado_destino = ? WHERE id_destino = ?";

			Connection conn = null;
			PreparedStatement pstm = null;

					try {
			
						conn = ConnectionFactory.createConnectionSQLServer();
						pstm = conn.prepareStatement(sql);
								
						pstm.setInt(3, destino.getId_destino());			
						pstm.setString(1, destino.getCidade_Destino());			
						pstm.setString(2, destino.getEstado_Destino());				
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
			}  catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public  List<Destino> getDestino() {

		String sql = "SELECT * FROM Destino";

				List<Destino> destinos = new ArrayList<Destino>();

					Connection conn = null;
					PreparedStatement pstm = null;	
					ResultSet rset = null;
				try {
					conn = ConnectionFactory.createConnectionSQLServer();
					pstm = conn.prepareStatement(sql);
					rset = pstm.executeQuery();
					while (rset.next()) {
				
				Destino destino = new Destino();

					destino.setId_destino(rset.getInt("id_destino"));
					destino.setCidade_Destino(rset.getString("Cidade_destino"));
					destino.setEstado_Destino(rset.getString("Estado_destino"));

				destinos.add(destino);
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
			}  catch (Exception e) {
				e.printStackTrace();
			}
		}
		return destinos;
	}
}
