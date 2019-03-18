package com.example.springbootmybatis.wang.mapper;

import com.example.springbootmybatis.wang.resposity.FirstResposity;

import java.util.List;

public interface FirstResposityMapper {

    List<FirstResposity> getAll();

    FirstResposity getOne(Long id);

    void insert(FirstResposity user);

    void update(FirstResposity user);

    void delete(Long id);
}
