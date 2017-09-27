package br.com.instabuy.modelo;

import java.math.BigDecimal;

public class Pc {

	
	 private String internalCode;
     private int installment;
     private BigDecimal qtd_stock;
     private BigDecimal price;
     private BigDecimal valid_price;
     private BigDecimal promotionPrice;
     private String expirationPromotion;
     private String model;
     private String id;
     
	public String getInternalCode() {
		return internalCode;
	}
	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	public int getInstallment() {
		return installment;
	}
	public void setInstallment(int installment) {
		this.installment = installment;
	}
	public BigDecimal getQtd_stock() {
		return qtd_stock;
	}
	public void setQtd_stock(BigDecimal qtd_stock) {
		this.qtd_stock = qtd_stock;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getValid_price() {
		return valid_price;
	}
	public void setValid_price(BigDecimal valid_price) {
		this.valid_price = valid_price;
	}
	public BigDecimal getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(BigDecimal promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getExpirationPromotion() {
		return expirationPromotion;
	}
	public void setExpirationPromotion(String expirationPromotion) {
		this.expirationPromotion = expirationPromotion;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
     
     
}
