package com.ogic.springclouddemoprovider.service;

import com.ogic.springclouddemoapi.entity.Demo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProviderService {
    public Demo getDemo(Long id);
    public List<Demo> getAll();
    public Boolean add(String name);
}
