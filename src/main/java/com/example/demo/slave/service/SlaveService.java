package com.example.demo.slave.service;


import com.example.demo.slave.dto.SlaveDTO;
import com.example.demo.slave.entity.Slave;
import com.example.demo.slave.repository.SlaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SlaveService {

    private final SlaveRepository slaveRepository;


    public SlaveService(SlaveRepository slaveRepository) {
        this.slaveRepository = slaveRepository;
    }

    public Slave insert(SlaveDTO dto) {
        Slave slave = Slave.builder()
                .role(dto.getRole())
                .build();
        return slaveRepository.save(slave);
    }

    public List<Slave> findAll() {
        return slaveRepository.findAll();
    }
}
