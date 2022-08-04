package com.ts.cleanarchitecture.tax.domain;

import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxCommand;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IndividualIncomeTax {

	/*
	종합소득세 id
	 */
	@Getter
	private Long id;

	/*
	신고안내유형
	 */
	@Getter
	private String infoType;


	/*
	안내유형
	 */
	@Getter
	private String type;

	/*
	종합소득세 userId
	 */
	@Getter
	private Long userId;
	/*
	매출액
	 */
	@Getter
	private Long revenue;
	/*
	소득금액
	 */
	@Getter
	private Long incomeAmount;
	/*
	소득공제
	 */
	@Getter
	private Long incomeDeduction;
	/*
	과세표준
	 */
	@Getter
	private Long taxBase;
	/*
	산출세액
	 */
	@Getter
	private Long caculatedTax;
	/*
	세액공제
	 */
	@Getter
	private Long taxCredit;
	/*
	가산세
	 */
	@Getter
	private Long penalty;
	/*
	기납부세액
	 */
	@Getter
	private Long prepaidTax;

	/*
	납부할세액
	 */
	@Getter
	private Long taxPayment;

	public boolean setFinancial(CreateTaxCommand command) {
		this.revenue = command.getRevenue();
		this.userId= command.getUserId();
		this.infoType=command.getInfoType();
		return calculateIncomeAmount(command);
	}

	/*
	소득금액 계산 ( 매출액 - 필요경비[ 주요경비 + 기타경비 ] )
	 */
	private boolean calculateIncomeAmount(CreateTaxCommand command) {

		this.incomeAmount = this.revenue - command.getCost();
		return incomeAmount > 0;
	}


	//TODO : 각각 세금 계산 로직 추가
	/*
	소득공제액 세팅
	 */

	/*
	과세표준 금액 세팅
	 */

	/*
	산출세액 금액 세팅
	 */

	/*
	세액공제액 금액 세팅
	 */

	/*
	가산세 금액 세팅
	 */

	/*
	기납부세액 금액 세팅
	 */

	/*
	납부할 세액 금액 세팅
	 */


}
