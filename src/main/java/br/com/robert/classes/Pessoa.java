package br.com.robert.classes;

public class Pessoa {
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	
	public enum TipoPessoa{FISICA, JURIDICA}
	
	public Integer codigo;
	public String nome;
	private String documento;
	public TipoPessoa tipo;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	public void setDocumento(String documento) {
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException ("Docuemnto não pode ser nulo ou vasio");
		}
		if(documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
		} else if(documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		}else {
			throw new RuntimeException("Documento invalido para pessoa FISICA ou JURIDICA ");
		}
		
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
}
