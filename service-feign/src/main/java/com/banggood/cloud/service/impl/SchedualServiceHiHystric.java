package com.banggood.cloud.service.impl;

import com.banggood.cloud.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by tanbo on 2018/2/8.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return  "sorry "+name;
    }
}
