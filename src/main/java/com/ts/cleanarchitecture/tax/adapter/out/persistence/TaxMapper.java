package com.ts.cleanarchitecture.tax.adapter.out.persistence;

import org.springframework.stereotype.Component;

import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

@Component
public class TaxMapper {
	IndividualIncomeTax mapToDomainEntity(IndividualIncomeTaxJpaEntity jpaEntity) {
		return new IndividualIncomeTax(jpaEntity.getId(),
			jpaEntity.getInfoType(),
			jpaEntity.getType(),
			jpaEntity.getUserId(),
			jpaEntity.getRevenue(),
			jpaEntity.getIncomeAmount(),
			jpaEntity.getIncomeDeduction(),
			jpaEntity.getTaxBase(),
			jpaEntity.getCaculatedTax(),
			jpaEntity.getTaxCredit(),
			jpaEntity.getPenalty(),
			jpaEntity.getPrepaidTax(),
			jpaEntity.getTaxPayment());
	}


}
