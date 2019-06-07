package com.ogic.springclouddemoprovider.service.impl;

import com.ogic.springclouddemoapi.entity.Demo;
import com.ogic.springclouddemoprovider.mapper.ProviderMapper;
import com.ogic.springclouddemoprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderMapper providerMapper;

    @Override
    public Demo getDemo(Long id) {
        return providerMapper.getDemoById(id);
    }

    @Override
    public List<Demo> getAll() {
        return providerMapper.getAllDemo();
    }

    @Override
    public Boolean add(String name) {
        return providerMapper.addDemo(name);
    }
}
