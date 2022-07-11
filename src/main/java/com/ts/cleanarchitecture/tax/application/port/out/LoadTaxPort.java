package com.ts.cleanarchitecture.tax.application.port.out;

import java.util.List;

import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

public interface LoadTaxPort {

	List<IndividualIncomeTax> loadTax(Long userId);
}
