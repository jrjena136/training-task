package com.sh.springbootapi.exp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sh.springbootapi.repository.entity.Sports;
import com.sh.springbootapi.sys.service.ISportsService;


@RestController
@RequestMapping("/api/sports")
public class SportsController {
	
	@Autowired
	ISportsService  iSportsService;
	
	@GetMapping("/")
	public List<Sports> selectAllSports(){
		return iSportsService.selectAllSports();
	}
	
	@PostMapping(path = "/add")
    public Sports addSports(@RequestBody Sports sp) {
    	return iSportsService.addSports(sp);
    }

	
	@GetMapping ("/{id}")
    public Sports selectSportsById(@PathVariable(value = "id") int id) {
    	return iSportsService.selectSportsById(id);
    }
	
	@PutMapping("/update/{id}")
    public Sports updateSports(@RequestBody Sports sp) {
    	return iSportsService.updateSports(sp);
    }
	
	@DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
    	iSportsService.selectSportsById(id);
    }

}