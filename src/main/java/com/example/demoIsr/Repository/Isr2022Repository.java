package com.example.demoIsr.Repository;

import org.springframework.stereotype.Repository;

import com.example.demoIsr.Entity.Isr2022Entity;
/* import com.example.demoIsr.Service.Isr2022Service; */

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Isr2022Repository extends JpaRepository<Isr2022Entity, Integer> {
    public List<Isr2022Entity> findByAñoAndPeriodo(Integer año, String periodo);
    /* public List<Isr2022Entity> findByPeriodo(String periodo); */
}
