package com.demo.springboot.app.productos;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.springboot.app.productos.controllers.PriceController;
import com.demo.springboot.app.productos.dto.PriceDto;

@SpringBootTest
class DemoConsultaPricesApplicationTests {

	@Autowired
	private PriceController controller;
	
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void test1() throws Exception {
		LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14,10,0);
		
		PriceDto expectedDto = new PriceDto();
		expectedDto.setBrandId(1l);
		expectedDto.setCurrency("EUR");
		expectedDto.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		expectedDto.setPrice(35.50d);
		expectedDto.setPriceList(1);
		expectedDto.setPriority((short)0);
		expectedDto.setProductId(35455l);
		expectedDto.setStartDate(LocalDateTime.of(2020, 06, 14, 0, 0, 0));
		
		ResponseEntity<PriceDto> expectedResponse = new ResponseEntity(expectedDto,HttpStatus.OK);
		
		assertThat(controller.getProductDetails(date, 35455l, 1l).getBody()).isEqualToComparingFieldByFieldRecursively(expectedDto);
	}
	
	
	@Test
	void test2() throws Exception {
		LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14,16,0);
		
		PriceDto expectedDto = new PriceDto();
		expectedDto.setBrandId(1l);
		expectedDto.setCurrency("EUR");
		expectedDto.setEndDate(LocalDateTime.of(2020, 06, 14, 18, 30, 0));
		expectedDto.setPrice(25.45d);
		expectedDto.setPriceList(2);
		expectedDto.setPriority((short)1);
		expectedDto.setProductId(35455l);
		expectedDto.setStartDate(LocalDateTime.of(2020, 06, 14, 15, 0, 0));
		
		ResponseEntity<PriceDto> expectedResponse = new ResponseEntity(expectedDto,HttpStatus.OK);
		
		assertThat(controller.getProductDetails(date, 35455l, 1l).getBody()).isEqualToComparingFieldByFieldRecursively(expectedDto);
	}
	
	@Test
	void test3() throws Exception {
		LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 14,21,0);
		
		PriceDto expectedDto = new PriceDto();
		expectedDto.setBrandId(1l);
		expectedDto.setCurrency("EUR");
		expectedDto.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		expectedDto.setPrice(35.50d);
		expectedDto.setPriceList(1);
		expectedDto.setPriority((short)0);
		expectedDto.setProductId(35455l);
		expectedDto.setStartDate(LocalDateTime.of(2020, 06, 14, 0, 0, 0));
		
		ResponseEntity<PriceDto> expectedResponse = new ResponseEntity(expectedDto,HttpStatus.OK);
		
		assertThat(controller.getProductDetails(date, 35455l, 1l).getBody()).isEqualToComparingFieldByFieldRecursively(expectedDto);
	}
	
	@Test
	void test4() throws Exception {
		LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 15,10,0);
		
		PriceDto expectedDto = new PriceDto();
		expectedDto.setBrandId(1l);
		expectedDto.setCurrency("EUR");
		expectedDto.setEndDate(LocalDateTime.of(2020, 06, 15, 11, 0, 0));
		expectedDto.setPrice(30.50d);
		expectedDto.setPriceList(3);
		expectedDto.setPriority((short)1);
		expectedDto.setProductId(35455l);
		expectedDto.setStartDate(LocalDateTime.of(2020, 06, 15, 0, 0, 0));
		
		ResponseEntity<PriceDto> expectedResponse = new ResponseEntity(expectedDto,HttpStatus.OK);
		
		assertThat(controller.getProductDetails(date, 35455l, 1l).getBody()).isEqualToComparingFieldByFieldRecursively(expectedDto);
	}
	
	@Test
	void test5() throws Exception {
		LocalDateTime date = LocalDateTime.of(2020, Month.JUNE, 16,21,0);
		
		PriceDto expectedDto = new PriceDto();
		expectedDto.setBrandId(1l);
		expectedDto.setCurrency("EUR");
		expectedDto.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
		expectedDto.setPrice(38.95d);
		expectedDto.setPriceList(4);
		expectedDto.setPriority((short)1);
		expectedDto.setProductId(35455l);
		expectedDto.setStartDate(LocalDateTime.of(2020, 06, 15, 16, 0, 0));
		
		ResponseEntity<PriceDto> expectedResponse = new ResponseEntity(expectedDto,HttpStatus.OK);
		
		assertThat(controller.getProductDetails(date, 35455l, 1l).getBody()).isEqualToComparingFieldByFieldRecursively(expectedDto);
	}

}
