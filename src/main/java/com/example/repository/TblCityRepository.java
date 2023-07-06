package com.example.repository;

import com.example.entity.TblCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblCityRepository extends JpaRepository<TblCity, Integer> {}
