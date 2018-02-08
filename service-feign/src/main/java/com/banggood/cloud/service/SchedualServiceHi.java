package com.banggood.cloud.service;

import com.banggood.cloud.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tanbo on 2018/2/7.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
