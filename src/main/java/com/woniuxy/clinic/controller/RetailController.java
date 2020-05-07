
package com.woniuxy.clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.woniuxy.clinic.common.CommonResult;
import com.woniuxy.clinic.dto.OrderDto;
import com.woniuxy.clinic.entity.Order;
import com.woniuxy.clinic.entity.Order_Medicine;
import com.woniuxy.clinic.entity.Patient;
import com.woniuxy.clinic.entity.Retail_Medicine;
import com.woniuxy.clinic.entity.TDrug;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.service.PharmacyService;
import com.woniuxy.clinic.service.RetailService;

@Controller
public class RetailController {
	@Autowired
	RetailService retailService;
//	PharmacyService pharmacyService;

	@RequestMapping("/retail")
	public String test1() {
		return "page/retail/retail";
	}
	
	@RequestMapping("/orderl")
	public String test2() {
		return "page/retail/order_list";
	}
	

	@RequestMapping("/retail/medicines")
	public String medecineList() {
		return "page/retail/medicine_list";
	}
	
	@ResponseBody
	@RequestMapping("/retail/save")
	public CommonResult saveOrderInfo(@RequestParam("retail_medicines")Object[] retail_medicines,@RequestParam("total")Double total) {
		try {
			//System.out.println(total);
			//System.out.println("aaa");
			//System.out.println(retail_medicines);
			for (Object retail_medicine : retail_medicines) {
				System.out.println(retail_medicine);
			}
			retailService.saveOrderInfo(total);
			//System.out.println("saveOrderInfo");
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("保存失败");
		}
		return CommonResult.success("保存成功");
	}
	
	@ResponseBody
	@RequestMapping("/retail/payInfo")
	public CommonResult savePayInfo(Double total) {
		try {
			//System.out.println("aaa");
			retailService.savePayInfo(total);
			//System.out.println("saveOrderInfo");
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("收款失败");
		}
		return CommonResult.success("收款成功");
	}

	// 批量添加
	@ResponseBody
	@DeleteMapping("/retail/addmedicines/{medical_ids}")
	public Object insertRetailMedecines(@PathVariable("medical_ids") List<Integer> medical_ids) {

		for (Integer medical_id : medical_ids) {
			retailService.insertRetailMedecines(medical_id);
		}
		CommonResult<Retail_Medicine> result = new CommonResult<Retail_Medicine>(0L, "成功", null);
		return result;
	}


	@ResponseBody
	@RequestMapping("/retail/medicineslist")
	public CommonResult showOrders(@RequestParam(value="page",defaultValue = "1",required = false) Integer currentPage,
            @RequestParam(value="limit",defaultValue = "5",required = false) Integer pageSize) {
		PageInfo info = null;
        try {
        	info = retailService.showRetailMedicines(currentPage,pageSize);
            return CommonResult.success(info);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
	}
	
	@ResponseBody
	@RequestMapping("/retail/addone/{drug_sn}")
	public CommonResult addOne(@PathVariable("drug_sn")Integer drug_sn) {
		try {
			retailService.addOne(drug_sn);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("添加失败");
		}
		return CommonResult.success("添加成功");
	}
	
	@ResponseBody
	@RequestMapping("/retail/reduceone/{drug_sn}")
	public CommonResult reduceOne(@PathVariable("drug_sn")Integer drug_sn) {
		try {
			retailService.reduceOne(drug_sn);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("减少失败");
		}
		return CommonResult.success("减少成功");
	}
	
	@ResponseBody
	@RequestMapping("/retail/delete/{drug_sn}")
	public CommonResult delete(@PathVariable("drug_sn")Integer drug_sn) {
		try {
			retailService.delete(drug_sn);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed("退款失败");
		}
		return CommonResult.success("退款成功");
	}
	
	@RequestMapping("/retail/pay")
    public ModelAndView editAdmin(){
		double total=0;
		List<Retail_Medicine> retail_medicines = retailService.findRetailMedince();
		for (Retail_Medicine retail_Medicine : retail_medicines) {
			total =total + retail_Medicine.getRetail_amount()*retail_Medicine.getRetail_medicine_number();
		}
        //Patient patient = orderService.findPatientInfoByPatient_id(patient_id);
        //List<Order_Medicine> order_medicines = orderService.findOrder_MedecinesByOrder_id(order_id);
        ModelAndView modelAndView = new ModelAndView("page/retail/pay");
        modelAndView.addObject("retail_medicines",retail_medicines);
        modelAndView.addObject("total",total);
        //modelAndView.addObject("patient",patient);
        //modelAndView.addObject("medicines",order_medicines);
        return modelAndView;
    }
}
