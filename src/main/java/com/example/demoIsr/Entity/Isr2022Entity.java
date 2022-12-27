package com.example.demoIsr.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "isr2022", catalog = "isrdata", schema = "")
public class Isr2022Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Float limInf;
    @Column
    private Float limSup;
    @Column
    private Float cuota;
    @Column
    private Float porcentaje;
    @Column
    private String periodo;
    @Column
    private Integer año;
}
