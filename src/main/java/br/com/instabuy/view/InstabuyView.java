package br.com.instabuy.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.instabuy.controller.InstabuyApiRest;
import br.com.instabuy.modelo.Data;
import br.com.instabuy.modelo.ListEntity;

@ManagedBean(name = "listaProduto")
@SessionScoped
public class InstabuyView {

	private ListEntity lista;
	private Data selecionado;

	@PostConstruct
	public void init() {
		InstabuyApiRest instabuyApiRest = new InstabuyApiRest();
		lista = instabuyApiRest.lista();
	}

	public void pegarSelecionado(Data data) {
		selecionado = data;
	}

	public ListEntity getLista() {
		return lista;
	}

	public void setLista(ListEntity lista) {
		this.lista = lista;
	}

	public Data getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(Data selecionado) {
		this.selecionado = selecionado;
	}

}
