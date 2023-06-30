package com.example.flaskhiringtest.FlaskHiringTest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="MemberClient", url="http://127.0.0.1:9090/transactions")
public interface MemberClient {

    @PostMapping(value="/createTransaction/{memberId}")

}
