package com.jharbes.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
