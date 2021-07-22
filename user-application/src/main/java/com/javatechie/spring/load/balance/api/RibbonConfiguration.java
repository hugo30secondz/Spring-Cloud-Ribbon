package com.javatechie.spring.load.balance.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class RibbonConfiguration {
	@Autowired
	IClientConfig ribbonclinet;

	@Bean
	public IPing ping(IClientConfig ribbonclinet) {
		return new PingUrl();
	}
	
	/*@Bean
	public IRule rule(IClientConfig ribbonclinet) {
		return new AvailabilityFilteringRule();
	}*/
}
