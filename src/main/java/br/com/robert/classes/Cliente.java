package br.com.robert.classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
		public int id;
		public String nome;
		public String cpf;	
		public List<Endereco> endereco;
	
	// methodo que noa deixa endereço ser null
	public void adicionadoEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new  NullPointerException("Endereço não pode ser nulo!");
		}
		if(endereco.cep == null) {
			throw new NullPointerException("Cep não pode ser nulo");
		}
		getEnderecos().add(endereco);
	}
	
	private List<Endereco> getEnderecos(){
		if(endereco == null) {
			endereco = new ArrayList<Endereco>();
		}
		return endereco;
	}
	
}
