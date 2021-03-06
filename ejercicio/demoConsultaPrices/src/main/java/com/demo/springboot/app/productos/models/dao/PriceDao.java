package com.demo.springboot.app.productos.models.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.springboot.app.productos.models.entity.Price;

public interface PriceDao extends JpaRepository<Price, Long> {

	@Query("select p from Price p where  p.startDate <=?1 and p.endDate>=?1 and p.brandId=?2 and p.productId=?3")
	//@Query("select p from Price p where p.startDate >=?1 and p.endDate<=?1 and p.brandId=?2 and p.productId=?3")
	public List<Price> getPriceByFilters(LocalDateTime date, Long brandId, Long productId);
}
