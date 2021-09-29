package com.devsuperior.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.payroll.entities.Payment;
import com.devsuperior.payroll.entities.Worker;
import com.devsuperior.payroll.feignclients.WorkerFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	@CircuitBreaker(name = "teste", fallbackMethod = "getPaymentFallBack")
	public Payment getPayment(long workerId, int days) {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}
	
	public Payment getPaymentFallBack(long workerId, int days, Throwable teste) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment("fallBack", worker.getDailyIncome(), days);
		
	}

}
