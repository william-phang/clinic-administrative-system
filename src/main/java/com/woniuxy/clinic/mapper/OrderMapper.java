package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {



	void setOrderToRefunded(@Param("order") Order order);

	Integer selectOrdersNumByCondition(@Param("order") OrderDto orderDto);

	List<Order> selectOrdersByCondition(@Param("order") OrderDto orderDto, @Param("beginIndex") Integer beginIndex,@Param("pageSize") Integer pageSize);

	Order findOrderInfoByOrder_id(Integer order_id);

	void refund(@Param("order_id") Integer order_id);

	Patient findPatientInfoByPatient_id(Integer patient_id);

	List<Order_Medicine> findOrder_MedecinesByOrder_id(Integer order_id);

	void pay(Integer order_id);

}