package com.vodinhminhquang.employeemanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String jobTitle;

    @Column
    private String phone;

    @Column
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;
}
