package com.ts.cleanarchitecture.tax.adapter.out.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class IndividualIncomeTaxJpaEntity {

	@Id @GeneratedValue
	private Long id;

	/*
	신고안내유형
	 */
	private String infoType;

	/*
	안내유형
	 */
	private String type;

	/*
	종합소득세 userId
	 */
	private Long userId;
	/*
	매출액
	 */
	private Long revenue;
	/*
	소득금액
	 */
	private Long incomeAmount;
	/*
	소득공제
	 */
	private Long incomeDeduction;
	/*
	과세표준
	 */
	private Long taxBase;
	/*
	산출세액
	 */
	private Long caculatedTax;
	/*
	세액공제
	 */
	private Long taxCredit;
	/*
	가산세
	 */
	private Long penalty;
	/*
	기납부세액
	 */
	private Long prepaidTax;

	/*
	납부할세액
	 */
	private Long taxPayment;


}
