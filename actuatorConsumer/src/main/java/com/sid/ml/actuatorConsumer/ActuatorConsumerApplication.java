package com.sid.ml.actuatorConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import com.sid.ml.actuatorConsumer.model.MetricsEntity;
import com.sid.ml.actuatorConsumer.repository.ActuatorRepository;

@SpringBootApplication
@EnableScheduling
public class ActuatorConsumerApplication {
	
	@Autowired
	private ActuatorRepository actuatorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ActuatorConsumerApplication.class, args);
	}
	
	@Scheduled(fixedDelay = 30000, initialDelay = 1000)
	public void scheduleFixedRateWithInitialDelayTask() {
	  
	    long now = System.currentTimeMillis() / 1000;
	    System.out.println(
	      "Fixed rate task with one second initial delay - " + now);
	    RestTemplate restTemplate = new RestTemplate();
	    String resourceUrl = "http://localhost:8080/metrics";
	    MetricsEntity metrics = restTemplate.getForObject(resourceUrl, MetricsEntity.class);
	    actuatorRepository.save(metrics);
	    System.out.println(metrics.getMemFree());
	}

}
