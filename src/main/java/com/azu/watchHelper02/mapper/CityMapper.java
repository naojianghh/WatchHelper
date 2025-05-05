package com.azu.watchHelper02.mapper;

import com.azu.watchHelper02.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {
    @Select("SELECT id, name FROM cities")
    List<City> getAllCities();
}
