package com.sh.springbootapi.sys.service;


import java.util.List;

import com.sh.base.core.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.sh.springbootapi.repository.ISportsDAO;
import com.sh.springbootapi.repository.entity.Sports;
import org.springframework.stereotype.Service;

@Service
public class SportsServiceImp implements ISportsService {
    
	@Autowired
	ISportsDAO dao;
    
	@Override
    public Sports addSports(Sports sp) {
        return dao.save(sp);
    }
    @Override
    public Sports updateSports(Sports sp) {
        return dao.save(sp);
    }
    @Override
    public void deleteById(int sid) {
        dao.deleteById(sid);
    }
    @Override
    public Sports selectSportsById(int sid) throws DataNotFoundException {
        return dao.findById(sid).get();
    }
    @Override
    public List<Sports> selectAllSports() {
        return dao.findAll();
    }

}