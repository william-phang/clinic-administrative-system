package com.woniuxy.clinic.service;

import com.woniuxy.clinic.entity.CaseMessage;
import com.woniuxy.clinic.entity.PhysiqueMessage;

public interface PhysiqueMessageService {
	void addPhysiqueMessage(PhysiqueMessage physiqueMessage);
	void addCaseMessage(CaseMessage caseMessage);
	int getCaseMessageId(String casemessage_cahistory,String casemessage_help,String casemessage_idea);
	int getPhysiqueMessageId(Double physiquemessage_animal,Integer physiquemessage_breathe,Integer physiquemessage_pulse,Double physiquemessage_bg,Double physiquemessage_bf);
	void addCaseOtherId(int physiquemessage_id,int casemessage_id,int case_id);
	// 只有病历详情信息
	void addCaseOtherId(int casemessage_id,int case_id);
}
