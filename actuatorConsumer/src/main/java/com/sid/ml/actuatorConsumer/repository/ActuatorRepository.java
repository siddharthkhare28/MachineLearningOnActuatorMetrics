package com.sid.ml.actuatorConsumer.repository;

import org.springframework.data.repository.CrudRepository;

import com.sid.ml.actuatorConsumer.model.MetricsEntity;

public interface ActuatorRepository extends CrudRepository<MetricsEntity, Integer> {

}
