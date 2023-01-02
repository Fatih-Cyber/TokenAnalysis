package com.example.tokenanalysis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,updatable = false)
    private LocalDateTime timeCreated;
    @Column(nullable = false,updatable = false)
    private Long createdBy;

    private boolean enabled;
    @Column(nullable = false)
    private LocalDateTime lastUpdateDateTime;
    @Column(nullable = false)
    private Long updatedBy;
    @PrePersist
    private void onPrePersist(){
        this.timeCreated = LocalDateTime.now();
        this.lastUpdateDateTime=LocalDateTime.now();
        this.enabled=true;
        this.createdBy=1L;
        this.updatedBy=1L;
    }

    @PreUpdate
    private void onPreUpdate(){
        this.lastUpdateDateTime=LocalDateTime.now();
        this.updatedBy=1L;
    }
}
