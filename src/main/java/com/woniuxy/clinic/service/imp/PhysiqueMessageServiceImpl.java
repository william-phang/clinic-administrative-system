package com.woniuxy.clinic.service.imp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.PhysiqueMessage;
import com.woniuxy.clinic.exception.PharmacyException;
import com.woniuxy.clinic.mapper.CaseMapper;
import com.woniuxy.clinic.mapper.CaseMessageMapper;
import com.woniuxy.clinic.mapper.PhysiqueMessageMapper;
import com.woniuxy.clinic.service.PhysiqueMessageService;

@Service
public class PhysiqueMessageServiceImpl implements PhysiqueMessageService {

	@Autowired
	PhysiqueMessageMapper physiqueMessageMapper;
	@Autowired
	CaseMessageMapper caseMessageMapper;
	@Autowired
	CaseMapper caseMapper;
	
	
	@Override
	public void addPhysiqueMessage(PhysiqueMessage physiqueMessage) {
		// 插入信息
//		if(true) {
//			throw new PharmacyException("自定义异常");
//		}
		try {
			physiqueMessageMapper.insertPhysiqueMessage(physiqueMessage);
		} catch (PharmacyException e) {
			throw new PharmacyException("数据异常");
		}  catch (Exception e) {
			throw new RuntimeException("数据异常");
		}
	}
	@Override
	public void addCaseMessage(CaseMessage caseMessage) {
		// 插入信息
		try {
			caseMessageMapper.insertCaseMessage(caseMessage);
		} catch (PharmacyException e) {
			throw new PharmacyException("数据异常");
		}  catch (Exception e) {
			throw new RuntimeException("数据异常");
		}
	}

	// 根据数据查询对应主键
	@Override
	public int getCaseMessageId( String casemessage_cahistory, String casemessage_help,
			String casemessage_idea) {
		int caseMessageId = 0;
		try {
			caseMessageId = caseMessageMapper.selectCaseMessageByOther( casemessage_cahistory, casemessage_help, casemessage_idea);
		} catch (PharmacyException e) {
			throw new PharmacyException("数据不完善");
		} catch (Exception e) {
			throw new RuntimeException("联系管理员");
		}
		return caseMessageId;
	}
	@Override
	public int getPhysiqueMessageId(Double physiquemessage_animal, Integer physiquemessage_breathe,
			Integer physiquemessage_pulse, Double physiquemessage_bg, Double physiquemessage_bf) {
		int PhysiqueMessageId = 0;
		try {
			PhysiqueMessageId = physiqueMessageMapper.selectPhysiqueMessageOther(physiquemessage_animal, physiquemessage_breathe, physiquemessage_pulse, physiquemessage_bg, physiquemessage_bf);
		} catch (PharmacyException e) {
			throw new PharmacyException("数据不完善");
		} catch (Exception e) {
			throw new RuntimeException("联系管理员");
		}		
		return PhysiqueMessageId;
	}
	// 关联外键
	@Override
	public void addCaseOtherId(int physiquemessage_id, int casemessage_id,int case_id) {
		if(physiquemessage_id<0 || casemessage_id<0) {
			throw new PharmacyException("数据异常");
		}
		caseMapper.insertID(physiquemessage_id, casemessage_id,case_id);	
	}
	@Override
	public void addCaseOtherId(int casemessage_id,int case_id) {
		caseMapper.insertId(casemessage_id,case_id);
	}
}
