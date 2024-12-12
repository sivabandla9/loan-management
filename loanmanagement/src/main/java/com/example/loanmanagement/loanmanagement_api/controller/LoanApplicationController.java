package com.example.loanmanagement.loanmanagement_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.loanmanagement.loanmanagement_entity.LoanApplicationEntity;
import com.example.loanmanagement.loanmanagement_repo.LoanApplicationRepo;


@RestController
@CrossOrigin("*")
public class LoanApplicationController {
	
	
	
	private final LoanApplicationRepo loanApplicationRepository;
	
	public LoanApplicationController(LoanApplicationRepo loanApplicationRepository) {
		this.loanApplicationRepository = loanApplicationRepository;
	}




	@GetMapping("/cusname")
	public String getStatus(@RequestParam String name) {
		
		System.out.println(name);
		
		LoanApplicationEntity loanApplication = loanApplicationRepository.findByCustomerName(name);

        String eligibilityStatus = loanApplication.getEligibilityStatus();
        return eligibilityStatus;
	}

	
	

}
