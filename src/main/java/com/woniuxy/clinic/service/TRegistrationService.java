
package com.woniuxy.clinic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.dto.TRegistrationDto;
import com.woniuxy.clinic.entity.TRegistration;

public interface TRegistrationService {

	
	List<TRegistration> findUsersByPage(Integer currentPage, Integer pageSize ,TRegistrationDto dto);

	int selectByPageCount(@Param("dto")TRegistrationDto dto);
}
