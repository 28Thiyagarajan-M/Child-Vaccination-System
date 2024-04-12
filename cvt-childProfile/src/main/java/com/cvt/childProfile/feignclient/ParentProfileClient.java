package com.cvt.childProfile.feignclient;

import com.cvt.childProfile.model.ParentProfileRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:9100", path = "/parentProfile" ,name = "parent")
public interface ParentProfileClient {

    @GetMapping("/test")
    String t();

    @PostMapping("")
    ParentProfileRequest addParentProfile(@RequestBody ParentProfileRequest parentProfileRequest);

}
