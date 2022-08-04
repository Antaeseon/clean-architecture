package com.ts.cleanarchitecture.tax.adapter.in.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ts.cleanarchitecture.tax.adapter.in.dto.CreateTaxDto;
import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxCommand;
import com.ts.cleanarchitecture.tax.application.port.in.CreateTaxUseCase;
import com.ts.cleanarchitecture.tax.domain.IndividualIncomeTax;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.validation.constraints.NotNull;

@WebMvcTest(controllers = CreateTaxController.class)
class CreateTaxControllerTest {

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CreateTaxUseCase createTaxUseCase;

	@Test
	void testCreateTax() throws Exception {
		CreateTaxDto request = new CreateTaxDto(1L, "type", 1000L, 500L);

		given(createTaxUseCase.createTax(any())).willReturn(new IndividualIncomeTax(
			1L, "type", "type", 1L, 500L, 1000L, 1000L, 500L, 200L, 300L, 400L, 500L, 1000L
		));

		mockMvc.perform(post("/tax")
			.header("Content-Type", "application/json")
			.content(this.objectMapper.writeValueAsString(request)))
			.andExpect(status().isOk());

	}

}