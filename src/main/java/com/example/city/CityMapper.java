package com.example.city;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xukai
 */
@Mapper
public interface CityMapper {

    @Select("select id, name, state, country from cities where state = #{state}")
    CityDO findByState(@Param("state") String state);

}
