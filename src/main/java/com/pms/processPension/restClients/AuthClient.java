package com.pms.processPension.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.processPension.model.AuthResponse;

/**
 * to access Authorization microservice
 * 
 */
@FeignClient(name = "authorization-service", url = "https://23pmsauthorization-env.eba-ddmxjprc.us-east-1.elasticbeanstalk.com")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
