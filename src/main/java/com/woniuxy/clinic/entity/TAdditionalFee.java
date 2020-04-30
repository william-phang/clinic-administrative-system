
package com.woniuxy.clinic.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TAdditionalFee {
    private Integer additional_id;

    private String additional_name;

    private BigDecimal additional_fee;

    private BigDecimal additional_cost;

    private Date additional_date;

    private String additional_founder;

    private String additional_state;

    public Integer getAdditional_id() {
        return additional_id;
    }

    public void setAdditional_id(Integer additional_id) {
        this.additional_id = additional_id;
    }

    public String getAdditional_name() {
        return additional_name;
    }

    public void setAdditional_name(String additional_name) {
        this.additional_name = additional_name == null ? null : additional_name.trim();
    }

    public BigDecimal getAdditional_fee() {
        return additional_fee;
    }

    public void setAdditional_fee(BigDecimal additional_fee) {
        this.additional_fee = additional_fee;
    }

    public BigDecimal getAdditional_cost() {
        return additional_cost;
    }

    public void setAdditional_cost(BigDecimal additional_cost) {
        this.additional_cost = additional_cost;
    }

    public Date getAdditional_date() {
        return additional_date;
    }

    public void setAdditional_date(Date additional_date) {
        this.additional_date = additional_date;
    }

    public String getAdditional_founder() {
        return additional_founder;
    }

    public void setAdditional_founder(String additional_founder) {
        this.additional_founder = additional_founder == null ? null : additional_founder.trim();
    }

    public String getAdditional_state() {
        return additional_state;
    }

    public void setAdditional_state(String additional_state) {
        this.additional_state = additional_state == null ? null : additional_state.trim();
    }

	@Override
	public String toString() {
		return "TAdditionalFee [additional_id=" + additional_id + ", additional_name=" + additional_name
				+ ", additional_fee=" + additional_fee + ", additional_cost=" + additional_cost + ", additional_date="
				+ additional_date + ", additional_founder=" + additional_founder + ", additional_state="
				+ additional_state + "]";
	}
    
    
}