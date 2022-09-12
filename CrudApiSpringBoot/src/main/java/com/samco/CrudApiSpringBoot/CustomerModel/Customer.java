package com.samco.CrudApiSpringBoot.CustomerModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private int customerid;
	private  String customername;
	private String  productcategory;
	private String  productname;
    private String  purchasedate_time_month;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPurchasedate_time_month() {
		return purchasedate_time_month;
	}
	public void setPurchasedate_time_month(String purchasedate_time_month) {
		this.purchasedate_time_month = purchasedate_time_month;
	}
	
	
}


