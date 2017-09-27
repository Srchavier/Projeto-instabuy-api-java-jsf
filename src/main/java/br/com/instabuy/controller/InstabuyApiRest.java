package br.com.instabuy.controller;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.com.instabuy.modelo.Data;
import br.com.instabuy.modelo.ListEntity;

public class InstabuyApiRest {

	public ListEntity lista() {
		ObjectMapper mapper = new ObjectMapper();
		Client cliente = Client.create();
		try {
			WebResource webResource = cliente
					.resource("https://instabuy.com.br/apiv2_2/product.json?subcategory_id=57eec92f072d415b67c24175");
			String json = webResource.get(String.class);
			ListEntity lista = mapper.readValue(json, ListEntity.class);
			return lista;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			System.out.println(" JSON incorreto está sendo gerado");
		} catch (JsonMappingException e) {
			e.printStackTrace();
			System.out.println("problemas fatais com o mapeamento de conteúdo");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ocorreu uma exceção de E/S de algum tipo");
		}
		System.out.println("erro, sua classe está null!!!!");
		return null;

	}
	
	public static void main(String[] args){
		InstabuyApiRest is = new InstabuyApiRest();
		ListEntity ff = is.lista();
		System.out.println(ff.getStatus());
		for (Data string : ff.getData()) {
			System.out.println(string.getName());

		}
	}
}
