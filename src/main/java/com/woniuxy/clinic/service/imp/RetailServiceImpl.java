
package com.woniuxy.clinic.service.imp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.Retail_Medicine;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.CaseMapper;
import com.woniuxy.clinic.mapper.CaseMessageMapper;
import com.woniuxy.clinic.mapper.OrderMapper;
import com.woniuxy.clinic.mapper.RetailMapper;
import com.woniuxy.clinic.service.CaseService;
import com.woniuxy.clinic.service.OrderService;
import com.woniuxy.clinic.service.RetailService;

@Service
public class RetailServiceImpl implements RetailService {
	
	@Autowired
	RetailMapper retailMapper;

//	@Override
//	public List<Order> selectPaidOrders() {
//		List<Order> orders = new ArrayList<Order>();
//		orders = orderMapper.selectPaidOrders();
//		return orders;
//	}
	

	@Override
	public void insertRetailMedecines(Integer medical_id) {
		
		boolean flag = true;
		List<Integer> drug_sns = retailMapper.selectDrug_sn();
		if(drug_sns != null) {
			for (Integer drug_sn : drug_sns) {
				if (drug_sn.equals(medical_id)) {
					retailMapper.updateRetail_Medicine_Number(medical_id);
					flag = false;
					break;
				}
			}
			if(flag) {
				retailMapper.insertRetail_Medicine(medical_id);
			}
		}
	}

	@Override
	public PageInfo showRetailMedicines(Integer currentPage, Integer pageSize) {
		Integer beginIndex = pageSize*(currentPage-1);
		try {
			//查询总条数
			Integer total = retailMapper.selectRetailMedicinesNum();
			List<Retail_Medicine> retail_medicines = retailMapper.selectRetailMedicines(beginIndex, pageSize);
			PageInfo<Retail_Medicine> pageInfo = new PageInfo<>(retail_medicines);
			pageInfo.setTotal(total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void addOne(Integer drug_sn) {
		retailMapper.addOne(drug_sn);
	}

	@Override
	public void delete(Integer drug_sn) {
		retailMapper.delete(drug_sn);
		
	}

	@Override
	public void reduceOne(Integer drug_sn) {
		retailMapper.reduceOne(drug_sn);
		
	}

	@Override
	public List<Retail_Medicine> findRetailMedince() {
		return retailMapper.findRetailMedince();
	}

	@Override
	public void saveOrderInfo(Double total) {
		
		retailMapper.deleteAll();
		String order_sn = (int)(Math.random()*100000)+"";
		Date d = new Date();
		//System.out.println(total);
		SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String createdate = p.format(d);
		Order order = new Order(null, order_sn, "零售", null, null, null, d, total, "2", null);
		retailMapper.saveOrderInfo(order);
//		Integer order_id = retailMapper.selectOrderID(order);
//		for (Retail_Medicine retail_Medicine : retail_medicines) {
//			retailMapper.saveOrderMedicineInfo(order_id,retail_Medicine);
//		}
		
	}

	@Override
	public void savePayInfo(Double total) {
		retailMapper.deleteAll();		
		String order_sn = (int)(Math.random()*100000)+"";
		Date d = new Date();
		SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String createdate = p.format(d);
		Order order = new Order(null, order_sn, "零售", null, null, null, d, total, "1", null);
		retailMapper.saveOrderInfo(order);
	}

	

	



	
	
}
