package com.example.springbootmybatis.wang.service;

import com.example.springbootmybatis.wang.mapper.FirstResposityMapper;
import com.example.springbootmybatis.wang.resposity.FirstResposity;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class Test12 {
    @Resource
    private FirstResposityMapper firstResposityMapper;
    public void test1(){
        firstResposityMapper.insert(new FirstResposity("1","1","1","1"));
        firstResposityMapper.insert(new FirstResposity("1","1","1","1"));
        firstResposityMapper.update(new FirstResposity(1l,"1","1","12","1"));
        firstResposityMapper.getOne(1l);
        firstResposityMapper.getAll();
        firstResposityMapper.delete(2l);
        System.out.println(firstResposityMapper.getAll());
    }
}
