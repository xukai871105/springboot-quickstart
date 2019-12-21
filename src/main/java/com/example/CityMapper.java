package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("select id, name, state, country from cities where state = #{state}")
    CityDo findByState(@Param("state") String state);

}
