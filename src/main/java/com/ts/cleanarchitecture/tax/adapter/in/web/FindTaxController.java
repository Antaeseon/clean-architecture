package com.ts.cleanarchitecture.tax.adapter.in.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ts.cleanarchitecture.tax.application.port.in.GetTaxQuery;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class FindTaxController {
	private final GetTaxQuery getTaxQuery;


	@GetMapping("/user/{userId}/tax")
	public ResponseEntity<List<IndividualIncomeTax>> getTaxList(@PathVariable("userId") Long userId){
		return ResponseEntity.ok().body(getTaxQuery.getTax(userId));
	}
}
