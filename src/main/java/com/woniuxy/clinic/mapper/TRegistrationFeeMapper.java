package com.woniuxy.clinic.mapper;

import com.woniuxy.clinic.dto.TAdditionalFeeDto;
import com.woniuxy.clinic.dto.TRegistrationFeeDto;
import com.woniuxy.clinic.entity.TAdditionalFee;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TRegistrationFee;
import com.woniuxy.clinic.entity.TRegistrationFeeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TRegistrationFeeMapper {
    int countByExample(TRegistrationFeeExample example);

    int deleteByExample(TRegistrationFeeExample example);

    int deleteByPrimaryKey(Integer regis_id);

    int insert(TRegistrationFee record);

    int insertSelective(TRegistrationFee record);

    List<TRegistrationFee> selectByExample(TRegistrationFeeExample example);

    TRegistrationFee selectByPrimaryKey(Integer regis_id);

    int updateByExampleSelective(@Param("record") TRegistrationFee record, @Param("example") TRegistrationFeeExample example);

    int updateByExample(@Param("record") TRegistrationFee record, @Param("example") TRegistrationFeeExample example);

    int updateByPrimaryKeySelective(TRegistrationFee record);

    int updateByPrimaryKey(TRegistrationFee record);
    
    List<TRegistrationFee> selectByWhere(TRegistrationFee tRegistrationFee);
    
    //分页查询
    List<TRegistrationFee> selectAlltTRegistrationFeesByCondition(
			@Param("TRegistrationFee")TRegistrationFee tRegistrationFee,
			@Param("pageIndex")Integer pageIndex, 
			@Param("pageSize")Integer pageSize);
    
    //查询总条数
    int selectAlltTRegistrationFeesCount(@Param("tRegistrationFee")TRegistrationFee tRegistrationFee);
    
    List<TRegistrationFee> selectByPage(@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize,@Param("dto") TRegistrationFeeDto dto);
    
    int selectByPageCount(@Param("dto")TRegistrationFeeDto dto);
}