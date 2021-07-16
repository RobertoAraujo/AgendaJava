package br.com.robert.classes;

import java.util.Objects;

public class Endereco {
	
	public enum TipoEndereco{
		RESIDENCIAL,
		ENTREGA,
		TRABALHO
	}
	public String endereco;
	public String numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, complemento, endereco, estado, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(estado, other.estado) && Objects.equals(numero, other.numero);
	}
	
	@Override
	public String toString() {
		return "Endereco [endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", estado=" + estado + ", cep=" + cep + "]";
	}
	
	
}
