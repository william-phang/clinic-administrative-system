package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.dto.DrugDto;
import com.woniuxy.clinic.entity.TDrug;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TDrugMapper {
	List<TDrug> selectDrugsByCondition(@Param("drug") DrugDto drugDto, @Param("beginIndex") Integer beginIndex, @Param("pageSize") Integer pageSize);
	
	Integer selectDrugsNumByCondition(@Param("drug") DrugDto drugDto);
	
	TDrug findDrugInfoByDrug_sn(Integer drug_sn);

	void updateDrugInfoByDrug_sn(@Param("tDrug")TDrug tDrug);

	void insertDrugInfo(@Param("tDrug")TDrug tDrug);

	void editDrugInfoStatus( @Param("drug_sn") Integer drug_sn, @Param("status") Integer status);
}