package com.ts.cleanarchitecture.tax.adapter.in.web;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ts.cleanarchitecture.tax.adapter.in.dto.CreateTaxDto;
import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxCommand;
import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxUseCase;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class TaxController {

	private final CreateTaxUseCase createTaxUseCase;

	@PostMapping("/tax")
	IndividualIncomeTax createTax(@RequestBody CreateTaxDto createTaxDto){

		CreateTaxCommand createTaxCommand = new CreateTaxCommand(
			createTaxDto.getUserId(),
			createTaxDto.getInfoType(),
			createTaxDto.getRevenue(),
			createTaxDto.getCost()
		);

		return createTaxUseCase.createTax(createTaxCommand);

	}
}
