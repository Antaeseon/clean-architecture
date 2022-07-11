package com.ts.cleanarchitecture.tax.application.port.in;

import javax.validation.constraints.NotNull;

import com.ts.cleanarchitecture.common.SelfValidating;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class CreateTaxCommand extends SelfValidating<CreateTaxCommand> {

	@NotNull
	private Long userId;

	@NotNull
	private String infoType;

	@NotNull
	private Long revenue;

	@NotNull
	private Long cost;

	public CreateTaxCommand(@NotNull Long userId, @NotNull String infoType,
		@NotNull Long revenue, @NotNull Long cost) {
		this.userId = userId;
		this.infoType = infoType;
		this.revenue = revenue;
		this.cost = cost;
		this.validateSelf();
	}
}
