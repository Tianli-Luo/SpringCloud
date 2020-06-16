package com.ltl.springcloud.service;


import com.ltl.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Tianly
 */
@FeignClient("accountService")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult<?> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
