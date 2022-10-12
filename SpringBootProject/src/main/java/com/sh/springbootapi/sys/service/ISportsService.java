package com.sh.springbootapi.sys.service;

import java.util.List;

import com.sh.springbootapi.repository.entity.Sports;

public interface ISportsService {
	Sports addSports(Sports var1);

    Sports updateSports(Sports var1);

    void deleteById(int var1);

    Sports selectSportsById(int var1);

    List<Sports> selectAllSports();
}