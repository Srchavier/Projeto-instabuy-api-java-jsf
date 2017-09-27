package br.com.instabuy.modelo;

import java.util.List;

public class ListEntity{

      private String status;
      private List<Data> data;
      private String type;
      
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
      
	
}
