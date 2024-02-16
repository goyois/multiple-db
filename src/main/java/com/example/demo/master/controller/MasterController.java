package com.example.demo.master.controller;

import com.example.demo.master.dto.MasterDTO;
import com.example.demo.master.entity.Master;
import com.example.demo.master.service.MasterService;
import com.example.demo.slave.dto.SlaveDTO;
import com.example.demo.slave.entity.Slave;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MasterController {

    private final MasterService service;


    @PostMapping("/master/insert")
    public ResponseEntity insertMaster(@RequestBody MasterDTO dto) {
        Master master = service.insert(dto);
        return ResponseEntity.ok(master);
    }


    @GetMapping("/master/findall")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(service.findAll());

    }
}
