package com.demo.springboot.app.productos.models.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.app.productos.models.dao.PriceDao;
import com.demo.springboot.app.productos.models.entity.Price;

@Service
public class PriceServiceImpl implements IPriceService{
	
	@Autowired
	private PriceDao priceDao;

	@Override
	public Price findProductByfilters(LocalDateTime localDateTime, Long idProduct, Long IdBrand) {
		// TODO Auto-generated method stub
		List<Price> lp = priceDao.getPriceByFilters(localDateTime, IdBrand, idProduct);
		if(lp.isEmpty()) {
			return null;
		}
		if(lp.size()==1) {
			return lp.get(0);
		}
		Comparator<Price> comparator = Comparator.comparing(Price::getPriority);
		return lp.stream().max(comparator).get();
	}
	
	
	

}
