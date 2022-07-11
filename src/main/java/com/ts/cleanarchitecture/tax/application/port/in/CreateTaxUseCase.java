package com.ts.cleanarchitecture.tax.application.port.in;

import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

public interface CreateTaxUseCase {

	IndividualIncomeTax createTax(CreateTaxCommand command);
}
