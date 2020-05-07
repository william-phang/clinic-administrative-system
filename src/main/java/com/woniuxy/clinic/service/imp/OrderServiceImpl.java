
package com.woniuxy.clinic.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.CaseMapper;
import com.woniuxy.clinic.mapper.CaseMessageMapper;
import com.woniuxy.clinic.mapper.OrderMapper;
import com.woniuxy.clinic.service.CaseService;
import com.woniuxy.clinic.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderMapper orderMapper;

//	@Override
//	public List<Order> selectPaidOrders() {
//		List<Order> orders = new ArrayList<Order>();
//		orders = orderMapper.selectPaidOrders();
//		return orders;
//	}
	

	@Override
	public PageInfo showOrdersByCondition(OrderDto orderDto,Integer currentPage, Integer pageSize) {
		Integer beginIndex = pageSize*(currentPage-1);
		try {
			//查询总条数
			Integer total = orderMapper.selectOrdersNumByCondition(orderDto);
			List<Order> orders = orderMapper.selectOrdersByCondition(orderDto,beginIndex, pageSize);
			PageInfo<Order> pageInfo = new PageInfo<>(orders);
			pageInfo.setTotal(total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Order findOrderInfoByOrder_id(Integer order_id) {
		return orderMapper.findOrderInfoByOrder_id(order_id);
	}

	@Override
	public void refund(Integer order_id) {
		orderMapper.refund(order_id);		
	}

	@Override
	public Patient findPatientInfoByPatient_id(Integer patient_id) {
		return orderMapper.findPatientInfoByPatient_id(patient_id);
	}

	@Override
	public List<Order_Medicine> findOrder_MedecinesByOrder_id(Integer order_id) {
		return orderMapper.findOrder_MedecinesByOrder_id(order_id);
	}

	@Override
	public void pay(Integer order_id) {
		orderMapper.pay(order_id);		
		
	}

	



	
	
}
