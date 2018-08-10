package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Curso;

public class CursoJdbcDAO {
	private Connection conn;

	public CursoJdbcDAO(Connection conn){
		this.conn = conn;
	}
	
public void salvar(Curso curso) throws SQLException{
	String sql = "insert into curso (nome,cargaHoraria) values ('"+curso.getNome()+"','"+curso.getCargaHoraria()+"')";
	System.out.println(sql);
	PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
	prepareStatement.executeUpdate();
	prepareStatement.close();
}

public void deletar(int idSelect) throws SQLException {
	String sql = "delete from curso where idCurso='"+idSelect+"'";		
	System.out.println(sql);
	PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
	prepareStatement.executeUpdate();
	prepareStatement.close();
}

public void atualizar(int idSelect, Curso curso) throws SQLException {
	String sql = "update curso set nome='"+curso.getNome()+"',cargaHoraria='"+curso.getCargaHoraria()+"'where idCurso = '"+idSelect+"'";
	System.out.println(sql);
	PreparedStatement prepareStatement;
	try {
		prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}		
}


}
