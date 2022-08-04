package com.ts.cleanarchitecture.tax.application.service;

import org.springframework.stereotype.Service;

import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxCommand;
import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxUseCase;
import com.ts.cleanarchitecture.tax.application.port.out.CreateTaxPort;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateTaxService implements CreateTaxUseCase {

	private final CreateTaxPort createTaxPort;

	@Override
	public IndividualIncomeTax createTax(CreateTaxCommand command) {

		IndividualIncomeTax individualIncomeTax = new IndividualIncomeTax();
		//제무제표 기반 정보 세팅
		if(!individualIncomeTax.setFinancial(command)){
			throw new IllegalArgumentException("재무제표 내용이 잘못되었습니다.");
		}

		//TODO: 세금 계산 rule 적용 예정

		return createTaxPort.createTax(individualIncomeTax);

	}
}
