package com.example.admin.apiadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.apiadmin.db.entity.SampleEntity;
import com.example.admin.apiadmin.db.repository.SampleRepository;

@RequestMapping("/api/sample")
@RestController
public class SampleController {

	@Autowired
	private SampleRepository repository;

	@PostMapping(path = "/")
	public void save(@RequestBody SampleEntity sample) {
		repository.save(sample);
	}
}
