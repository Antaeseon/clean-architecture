package com.ts.cleanarchitecture.tax.application.service;

import java.util.List;

import com.ts.cleanarchitecture.tax.application.port.in.GetTaxQuery;
import com.ts.cleanarchitecture.tax.application.port.out.LoadTaxPort;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetTaxService implements GetTaxQuery {

	private final LoadTaxPort loadTaxPort;

	@Override
	public List<IndividualIncomeTax> getTax(Long userId) {
		return loadTaxPort.loadTax(userId);
	}
}
