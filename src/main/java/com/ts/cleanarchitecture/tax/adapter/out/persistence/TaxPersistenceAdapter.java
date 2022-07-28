package com.ts.cleanarchitecture.tax.adapter.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ts.cleanarchitecture.common.PersistenceAdapter;
import com.ts.cleanarchitecture.tax.application.port.out.CreateTaxPort;
import com.ts.cleanarchitecture.tax.application.port.out.LoadTaxPort;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import lombok.RequiredArgsConstructor;

@Service
@PersistenceAdapter
@RequiredArgsConstructor
public class TaxPersistenceAdapter implements CreateTaxPort, LoadTaxPort {

	private final IndividualIncomeTaxRepository individualIncomeTaxRepository;
	private final TaxMapper taxMapper;
	@Override
	public IndividualIncomeTax createTax(IndividualIncomeTax individualIncomeTax) {
		IndividualIncomeTaxJpaEntity findTax = individualIncomeTaxRepository.findById(individualIncomeTax.getId())
			.orElseThrow(() -> new IllegalArgumentException("잘못된 ID를 입력하셨습니다."));

		return taxMapper.mapToDomainEntity(findTax);

	}

	@Override
	public List<IndividualIncomeTax> loadTax(Long userId) {
		List<IndividualIncomeTaxJpaEntity> findList = individualIncomeTaxRepository.findByUserId(userId);
		return findList.stream()
			.map(taxMapper::mapToDomainEntity)
			.collect(Collectors.toList());
	}
}
