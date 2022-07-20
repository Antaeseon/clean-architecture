package com.ts.cleanarchitecture.tax.adapter.in.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTaxDto {

	@NotNull
	private Long userId;

	@NotNull
	private String infoType;

	@NotNull
	private Long revenue;

	@NotNull
	private Long cost;

}
