package com.demo.springboot.app.productos.models.service;

import java.time.LocalDateTime;

import com.demo.springboot.app.productos.models.entity.Price;

public interface IPriceService {

	public Price findProductByfilters(LocalDateTime localDateTime,Long idProduct, Long IdBrand );
}
