package com.ogic.springclouddemoprovider.mapper;

import com.ogic.springclouddemoapi.entity.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProviderMapper {

    @Select("SELECT * FROM demo WHERE id = #{id}")
    public Demo getDemoById(Long id);

    @Select("SELECT * FROM demo")
    public List<Demo> getAllDemo();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO demo(name, sourceDB) VALUES(#{name}, DATABASE())")
    public Boolean addDemo(String name);
}
