package com.example.demoIsr.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoIsr.Entity.Isr2022Entity;
import com.example.demoIsr.Repository.Isr2022Repository;


@Service
public class Isr2022Service {
    @Autowired
    Isr2022Repository isr2022Repository;
    public List<Isr2022Entity> getAño(Integer anio) {
        return isr2022Repository.findByAño(anio);
    }
    public List<Isr2022Entity> getPeriodo(String periodo){
        return isr2022Repository.findByPeriodo(periodo);
    }
}
