package br.com.robert;

import br.com.robert.classes.Cliente;
import br.com.robert.classes.Endereco;

public class Primeiro {

	public static void main(String[] args) {
		
//		Nomes nome = new Nomes();
//		nome.setId(1);
//		nome.setNome("Roberto Araujo de Moraes");
//		nome.setSaudacao("Seja bem vindo ao priemrio programa em java!");
//		
//		System.out.println("Hello "+ nome.getId()+" "+nome.getSaudacao()+" "+nome.getNome());
		
		
		Endereco endereco = new Endereco();
		//endereco.cep = "00000-000";
		
		Cliente cliente = new Cliente();
		try {
			cliente.adicionadoEndereco(endereco);	
			System.out.println("Endereço adicionado com sucesso! ");
		} catch (Exception e) {
			System.out.println("Houve um erro ou adicionar enderço " + e.getMessage());
		}
	}
	

}
