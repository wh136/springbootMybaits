package com.citybrain.agenthub.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    List listUser();
}