package com.example.loanmanagement.loanmanagement_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.loanmanagement.loanmanagement_entity.LoanApplicationEntity;

@Component
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationEntity,Long> {
	
	
	
	LoanApplicationEntity findByCustomerName(String customerName);
	
	

}
