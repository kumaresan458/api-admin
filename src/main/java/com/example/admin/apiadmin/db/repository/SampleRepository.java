package com.example.admin.apiadmin.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.admin.apiadmin.db.entity.SampleEntity;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

}
