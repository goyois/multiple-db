package com.example.demo.slave.controller;

import com.example.demo.slave.dto.SlaveDTO;
import com.example.demo.slave.entity.Slave;
import com.example.demo.slave.service.SlaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SlaveController {

    private final SlaveService service;


    @PostMapping("/insert")
    public ResponseEntity insertSlave(@RequestBody SlaveDTO dto) {
        Slave slave = service.insert(dto);
        return ResponseEntity.ok(slave);
    }


    @GetMapping("/findall")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());

    }
}
