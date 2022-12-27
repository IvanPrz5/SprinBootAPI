package com.example.demoIsr.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoIsr.Entity.Isr2022Entity;
import com.example.demoIsr.Repository.Isr2022Repository;
import com.example.demoIsr.Service.Isr2022Service;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/Isr")
public class Isr2022Controller {
    @Autowired
    private Isr2022Repository isr2022Repository;
    @Autowired
    private Isr2022Service isr2022Service;

    @GetMapping
    public List<Isr2022Entity> datos() {
        return (List<Isr2022Entity>) isr2022Repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Isr2022Entity> data(@PathVariable("id") Integer id){
        return isr2022Repository.findById(id);
    }

    @GetMapping("año/{año}")
    public List<Isr2022Entity> año(@PathVariable("año") Integer año){
        return isr2022Service.getAño(año);
    }

    @GetMapping("periodo/{periodo}")
    public List<Isr2022Entity> periodo(@PathVariable("periodo") String periodo){
        return isr2022Service.getPeriodo(periodo);
    }

    /* @PostMapping
    public void insertar(@RequestBody Isr2022Entity isr) {
        isr2022Repository.save(isr);
    } */
}
