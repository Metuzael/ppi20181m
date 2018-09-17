package biblioteca.comandos.funcoes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.daos.AlunoDao;
import biblioteca.modelos.Aluno;

public class AdicionarAluno implements Comando{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
					
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String dataText = request.getParameter("dataNascimento");
        String endereco = request.getParameter("endereco");
		
        Calendar data = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataText);
			data = Calendar.getInstance();
			data.setTime(date);
		} catch (Exception e) {
			
		}
	
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setDataNascimento(data);
		aluno.setEndereco(endereco);
		
		AlunoDao dao = new AlunoDao();
	    dao.inserirAluno(aluno);
	
		
	    return "AlunoCadastrado.jsp" ;
	

    }
}

