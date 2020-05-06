
package com.woniuxy.clinic.service;

import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;

public interface OrderService {
	

	PageInfo showOrdersByCondition(OrderDto orderDto, Integer currentPage, Integer pageSize);

	Order findOrderInfoByOrder_id(Integer order_id);

	void refund(Integer order_id);

	Patient findPatientInfoByPatient_id(Integer patient_id);

	List<Order_Medicine> findOrder_MedecinesByOrder_id(Integer order_id);

	void pay(Integer order_id);
	
}
