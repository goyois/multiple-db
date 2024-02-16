package com.example.demo.master.service;

import com.example.demo.master.dto.MasterDTO;
import com.example.demo.master.entity.Master;
import com.example.demo.master.repo.MasterRepository;
import com.example.demo.slave.dto.SlaveDTO;
import com.example.demo.slave.entity.Slave;
import com.example.demo.slave.repository.SlaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MasterService {
    private final MasterRepository masterRepository;

    public MasterService(MasterRepository masterRepository) {
        this.masterRepository = masterRepository;
    }

    public Master insert(MasterDTO dto) {
        Master master = Master.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .build();
        return masterRepository.save(master);
    }

    public List<Master> findAll() {
        return masterRepository.findAll();
    }
}
