package view;

import java.sql.Connection;

import controller.*;
import controller.JdbUtil;
import model.*;


public class Exec {
	public static void main(String args[]){
		Alunos alunos = new Alunos();
		Curso cursos = new Curso();
		try{
				alunos.setNome("Vinícius Alves");
				alunos.setEndereco("Milagre dos Peixes");
				alunos.setBairro("Castro Alves");
				alunos.setIdCurso(1);		
				
				cursos.setNome("Desnevolvimento de Sistemas");
				cursos.setCargaHoraria(1000);
				
				
				Connection connection = JdbUtil.getConnection();
				
				AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
				CursoJdbcDAO cursosJdbcDao = new CursoJdbcDAO(connection);
				DisciplinaJdbcDAO disciplinaJdbcDao = new DisciplinaJdbcDAO(connection);
				
				
				
				
			
				
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
