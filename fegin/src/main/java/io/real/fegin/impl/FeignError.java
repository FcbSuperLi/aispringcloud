package io.real.fegin.impl;

import io.real.entity.Student;
import io.real.fegin.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String getIndex() {
        return "服务器维护中。。。。。";
    }
}
