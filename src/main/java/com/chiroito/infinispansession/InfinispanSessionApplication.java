package com.chiroito.infinispansession;

import org.infinispan.spring.remote.session.configuration.EnableInfinispanRemoteHttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableInfinispanRemoteHttpSession
@SpringBootApplication
public class InfinispanSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfinispanSessionApplication.class, args);
    }
}
