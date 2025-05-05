package com.azu.watchHelper02.mapper;

import com.azu.watchHelper02.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MovieMapper {
    List<Movie> selectHotMovies(@Param("cityId") Integer cityId, @Param("cityName") String cityName);
}
