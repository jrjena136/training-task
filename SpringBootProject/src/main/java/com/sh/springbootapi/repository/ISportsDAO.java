package com.sh.springbootapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sh.springbootapi.repository.entity.Sports;

@Repository
public interface ISportsDAO extends JpaRepository<Sports, Integer>{
	
}