package com.ts.cleanarchitecture.tax.application.port.out;

import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

public interface CreateTaxPort {
	IndividualIncomeTax createTax(IndividualIncomeTax individualIncomeTax);
}
