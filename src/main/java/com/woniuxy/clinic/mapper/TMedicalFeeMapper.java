
package com.woniuxy.clinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.woniuxy.clinic.dto.TMedicalFeeDto;
import com.woniuxy.clinic.entity.TMedicalFee;
import com.woniuxy.clinic.entity.TMedicalFeeExample;

@Mapper
public interface TMedicalFeeMapper {
    int countByExample(TMedicalFeeExample example);

    int deleteByExample(TMedicalFeeExample example);

    int deleteByPrimaryKey(Integer medical_id);

    int insert(TMedicalFee record);

    int insertSelective(TMedicalFee record);

    List<TMedicalFee> selectByExample(TMedicalFeeExample example);

    TMedicalFee selectByPrimaryKey(Integer medical_id);

    int updateByExampleSelective(@Param("record") TMedicalFee record, @Param("example") TMedicalFeeExample example);

    int updateByExample(@Param("record") TMedicalFee record, @Param("example") TMedicalFeeExample example);

    int updateByPrimaryKeySelective(TMedicalFee record);

    int updateByPrimaryKey(TMedicalFee record);
    
    List<TMedicalFee> selectByWhere(TMedicalFee tMedicalFee);
    
    //查询总条数
    int selectAlltMedicalFeesCount(@Param("tMedicalFee")TMedicalFee tMedicalFee);
    
    List<TMedicalFee> selectByPage(@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize,@Param("dto") TMedicalFeeDto dto);
    
    int selectByPageCount(@Param("dto")TMedicalFeeDto dto);
}