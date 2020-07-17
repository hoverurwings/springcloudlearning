package com.shanks.feign;

import com.shanks.entity.Student;
import com.shanks.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)//访问成功执行逗号前，访问失败回到实现类，此举为了演示容错
public interface FeignProvideClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();


    @GetMapping("/student/index")
    public String index();
}
