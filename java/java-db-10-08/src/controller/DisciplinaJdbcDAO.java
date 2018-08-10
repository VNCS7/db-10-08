package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.*;

public class DisciplinaJdbcDAO {
	private Connection conn;
	
	public DisciplinaJdbcDAO(Connection conn){
		this.conn = conn;
	}
	
	public void salvar(Disciplina disciplina) throws SQLException{
		String sql = "insert into disciplina (nomeDisciplina,cargaHoraria) values ('"+disciplina.getNomeDisciplina()+"','"+disciplina.getCargaHoraria()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
	}
}
