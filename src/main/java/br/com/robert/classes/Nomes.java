package br.com.robert.classes;

public class Nomes {
	int id;
	String Nome;
	String Saudacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSaudacao() {
		return Saudacao;
	}
	public void setSaudacao(String saudacao) {
		Saudacao = saudacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((Saudacao == null) ? 0 : Saudacao.hashCode());
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nomes other = (Nomes) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Saudacao == null) {
			if (other.Saudacao != null)
				return false;
		} else if (!Saudacao.equals(other.Saudacao))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Nomes [id=" + id + ", Nome=" + Nome + ", Saudacao=" + Saudacao + "]";
	}
	
	
}
