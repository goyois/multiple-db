package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Tx {

    @Autowired
    @Qualifier("masterTransactionManager")
    private PlatformTransactionManager masterTransactionManager;

    @Autowired
    @Qualifier("slaveTransactionManager")
    private PlatformTransactionManager slaveTransactionManager;

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new ChainedTransactionManager(masterTransactionManager, slaveTransactionManager);
    }
}
