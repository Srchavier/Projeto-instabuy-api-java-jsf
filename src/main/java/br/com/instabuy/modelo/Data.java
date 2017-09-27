package br.com.instabuy.modelo;

import java.math.BigDecimal;
import java.util.List;

public class Data {
	private String store_id;
    private List<Labels> labels;
    private boolean visible;
    private String id;
    private String thumb;
    private boolean service;
    private String unit_type;
    private List<Pc> pc;
    private int increment_value;
    private List<String> variation_products;
    private String model_frame;
    private int installment_starting;
    private String subdomain;
    private List<String> related_products;
    private boolean has_promotion;
    private String description;
    private String brand;
    private List<String> photos;
	private boolean multi;
    private String  name;
    private String subCategory_id;
    private BigDecimal price_starting;
    private String  model_name;
    
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public List<Labels> getLabels() {
		return labels;
	}
	public void setLabels(List<Labels> labels) {
		this.labels = labels;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public boolean isService() {
		return service;
	}
	public void setService(boolean service) {
		this.service = service;
	}
	public String getUnit_type() {
		return unit_type;
	}
	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}
	public List<Pc> getPc() {
		return pc;
	}
	public void setPc(List<Pc> pc) {
		this.pc = pc;
	}
	public int getIncrement_value() {
		return increment_value;
	}
	public void setIncrement_value(int increment_value) {
		this.increment_value = increment_value;
	}
	public List<String> getVariation_products() {
		return variation_products;
	}
	public void setVariation_products(List<String> variation_products) {
		this.variation_products = variation_products;
	}
	public String getModel_frame() {
		return model_frame;
	}
	public void setModel_frame(String model_frame) {
		this.model_frame = model_frame;
	}
	public int getInstallment_starting() {
		return installment_starting;
	}
	public void setInstallment_starting(int installment_starting) {
		this.installment_starting = installment_starting;
	}
	public String getSubdomain() {
		return subdomain;
	}
	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	public List<String> getRelated_products() {
		return related_products;
	}
	public void setRelated_products(List<String> related_products) {
		this.related_products = related_products;
	}
	public boolean isHas_promotion() {
		return has_promotion;
	}
	public void setHas_promotion(boolean has_promotion) {
		this.has_promotion = has_promotion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	public boolean isMulti() {
		return multi;
	}
	public void setMulti(boolean multi) {
		this.multi = multi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubCategory_id() {
		return subCategory_id;
	}
	public void setSubCategory_id(String subCategory_id) {
		this.subCategory_id = subCategory_id;
	}
	public BigDecimal getPrice_starting() {
		return price_starting;
	}
	public void setPrice_starting(BigDecimal price_starting) {
		this.price_starting = price_starting;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
    
    
}
