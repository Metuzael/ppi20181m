package biblioteca.modelos;

import java.util.Calendar;

import biblioteca.daos.EmprestimoDao;

public class Livro {

	private long id;
	private String titulo;
	private String autor;
	private String editora;
	private Calendar dataPub;
	private int edicao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Calendar getDataPub() {
		return dataPub;
	}

	public void setDataPub(Calendar dataPub) {
		this.dataPub = dataPub;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isDisponivel() {

		try {
			if (new EmprestimoDao().getListaByLivro(this).isEmpty()
					|| new EmprestimoDao().getListaByLivro(this).size() == 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return true;
		}
	}
}
