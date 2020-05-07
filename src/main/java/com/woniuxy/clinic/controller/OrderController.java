
package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.dto.DrugDto;
import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Case;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.service.CaseService;
import com.woniuxy.clinic.service.OrderService;
import com.woniuxy.clinic.tool.CommonResult;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	@ResponseBody
	@RequestMapping("/order/orderList")
	public CommonResult showOrders(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize,OrderDto orderDto) {
		PageInfo info = null;
        try {
        	info = orderService.showOrdersByCondition(orderDto,currentPage,pageSize);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
	
	@RequestMapping("/order/editOrderInfo/{order_id}&{patient_id}")
    public ModelAndView editAdmin(@PathVariable("order_id")Integer order_id,@PathVariable("patient_id")Integer patient_id){
        Order order = orderService.findOrderInfoByOrder_id(order_id);
        Patient patient = orderService.findPatientInfoByPatient_id(patient_id);
        List<Order_Medicine> order_medicines = orderService.findOrder_MedecinesByOrder_id(order_id);
        ModelAndView modelAndView = new ModelAndView("page/retail/order_edit");
        modelAndView.addObject("order",order);
        modelAndView.addObject("patient",patient);
        modelAndView.addObject("medicines",order_medicines);
        return modelAndView;
    }
	
	@ResponseBody
	@RequestMapping("/order/refund/{order_id}")
	public CommonResult refund(@PathVariable("order_id")Integer order_id) {
		try {
			orderService.refund(order_id);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("退款失败");
		}
		return CommonResult.success("退款成功");
	}
	
	@ResponseBody
	@RequestMapping("/order/pay/{order_id}")
	public CommonResult pay(@PathVariable("order_id")Integer order_id) {
		try {
			orderService.pay(order_id);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("支付失败");
		}
		return CommonResult.success("支付成功");
	}
}
