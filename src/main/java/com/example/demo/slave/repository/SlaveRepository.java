package com.example.demo.slave.repository;

import com.example.demo.slave.entity.Slave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlaveRepository extends JpaRepository<Slave, Long> {
}
