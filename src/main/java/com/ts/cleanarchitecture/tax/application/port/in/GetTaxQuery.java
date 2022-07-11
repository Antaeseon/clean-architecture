package com.ts.cleanarchitecture.tax.application.port.in;

import java.util.List;

import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

public interface GetTaxQuery {
	List<IndividualIncomeTax> getTax(Long userId);
}
