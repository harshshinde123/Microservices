package com.example.greet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "welcome")
public interface fignclient {
        @GetMapping("/welcome")
       public  String welcome();
}
