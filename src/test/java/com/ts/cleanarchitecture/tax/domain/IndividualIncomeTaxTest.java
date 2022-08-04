package com.ts.cleanarchitecture.tax.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxCommand;

class IndividualIncomeTaxTest {
	@Test
	public void calcTest() throws Exception {
	    //given
		IndividualIncomeTax individualIncomeTax = new IndividualIncomeTax();
		CreateTaxCommand info = new CreateTaxCommand(1L, "복식부기", 2000L, 500L);
		//when
		individualIncomeTax.setFinancial(info);
	    //then
		Assertions.assertThat(individualIncomeTax.getIncomeAmount()).isEqualTo(1500);
	}
}