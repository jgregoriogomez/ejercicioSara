package com.demo.springboot.app.productos.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.app.productos.dto.PriceDto;
import com.demo.springboot.app.productos.models.entity.Price;
import com.demo.springboot.app.productos.models.service.IPriceService;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {

	@Autowired
	private IPriceService priceService;
	
	@GetMapping("/{localDate}/{idProduct}/{idBrand}")
	public ResponseEntity<PriceDto> getProductDetails(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDateTime localDateTime,
			@PathVariable Long idProduct,
			@PathVariable Long idBrand) {
		
		Price result = priceService.findProductByfilters(localDateTime, idProduct, idBrand);
		if(result==null) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		PriceDto dto = new PriceDto(result);
		return new ResponseEntity(dto,HttpStatus.OK);
	}
}
