package com.example.demo.master.repo;

import com.example.demo.master.entity.Master;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends JpaRepository<Master, Long> {

}
