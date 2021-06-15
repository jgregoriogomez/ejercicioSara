package com.demo.springboot.app.productos.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.demo.springboot.app.productos.models.entity.Price;
import com.fasterxml.jackson.annotation.JsonFormat;

public class PriceDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -700750949806528979L;

	private Long brandId;
	
	@JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime endDate;
	

	private Integer priceList;
	
	
	private Long productId;
	
	
	private Short priority;
	
	
	private Double price;
	
	
	private String currency;

	
	public Long getBrandId() {
		return brandId;
	}


	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}


	public LocalDateTime getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}


	public LocalDateTime getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}


	public Integer getPriceList() {
		return priceList;
	}


	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Short getPriority() {
		return priority;
	}


	public void setPriority(Short priority) {
		this.priority = priority;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public PriceDto(Long brandId, LocalDateTime startDate, LocalDateTime endDate, Integer priceList, Long productId,
			Short priority, Double price, String currency) {
		super();
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.currency = currency;
	}


	public PriceDto() {
		super();
		
	}


	public PriceDto(Price result) {
		super();
		this.brandId = result.getBrandId();
		this.startDate = result.getStartDate();
		this.endDate = result.getEndDate();
		this.priceList = result.getPriceList();
		this.productId = result.getProductId();
		this.priority = result.getPriority();
		this.price = result.getPrice();
		this.currency = result.getCurrency();
	}
	
	
}
