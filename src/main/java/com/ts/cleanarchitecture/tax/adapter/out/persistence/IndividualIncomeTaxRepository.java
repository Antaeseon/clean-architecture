package com.ts.cleanarchitecture.tax.adapter.out.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface IndividualIncomeTaxRepository extends JpaRepository<IndividualIncomeTaxJpaEntity,Long> {

	List<IndividualIncomeTaxJpaEntity> findByUserId(Long userId);
}
