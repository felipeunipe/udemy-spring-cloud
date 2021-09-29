//package com.devsuperior.payroll.config;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.cloud.client.DefaultServiceInstance;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import reactor.core.publisher.Flux;
//
//@Configuration
//public class HrWorkerConfiguration  {
//	
//	@Bean
//	@Primary
//	ServiceInstanceListSupplier serviceInstanceListSupplier() {
//		return new HrWorkerSupplier("hr-worker");
//	}
//
//	class HrWorkerSupplier implements ServiceInstanceListSupplier {
//
//		private final String serviceId;
//
//		public HrWorkerSupplier(String serviceId) {
//			this.serviceId = serviceId;
//		}
//		
//		@Override
//		public Flux<List<ServiceInstance>> get() {
//			
//			return Flux.just(Arrays.asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8001, false),
//					new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8002, false)));
//			
//		}
//		
//		@Override
//		public String getServiceId() {
//			return serviceId;
//		}
//		
//	}
//	
//	
//}
