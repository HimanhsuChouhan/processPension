package com.pms.processPension.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.processPension.model.Pensioner;

/**
 * To access Pensioner detail microservice
 * 
 */
@FeignClient(name = "pensioner-detail-service", url = "http://23pmspensionerdetail-env.eba-jqbhgzqp.us-east-1.elasticbeanstalk.com")
public interface PensionerDetailClient {

	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
	public Pensioner getPensionerDetailByAadhaar(@RequestHeader("Authorization") String token,
			@PathVariable long aadhaarNumber);

	@PostMapping("/UpdatePensioner")
	public boolean updatePensioner(@RequestHeader("Authorization") String token,
			@RequestBody Pensioner updatedPensioner);

}
