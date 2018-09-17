package biblioteca.modelos;

import java.util.Calendar;

import biblioteca.daos.AlunoDao;
import biblioteca.daos.LivroDao;

public class Emprestimo {

	public final static int DIAS_DE_DURACAO = 14;
	public final static int MAXIMO_LIVROS = 3;

	private Calendar dataEmp;
	private Calendar dataDev;
	private long livro;
	private long aluno;

	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Livro getLivro() {
		return new LivroDao().getLivroById(livro);
	}

	public void setLivro(Livro livro) {
		this.livro = livro.getId();
	}

	public Aluno getAluno() {
		return new AlunoDao().getAlunoById(aluno);
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno.getId();
	}

	public Calendar getDataEmp() {
		return dataEmp;
	}

	public void setDataEmp(Calendar dataEmp) {
		this.dataEmp = dataEmp;
	}

	public Calendar getDataDev() {
		return dataDev;
	}

	public void setDataDev(Calendar dataDev) {
		this.dataDev = dataDev;
	}

}
