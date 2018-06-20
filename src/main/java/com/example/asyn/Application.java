package com.example.asyn;

import org.springframework.boot.SpringApplication;

/**
 * @author zzf
 * @date 18/5/8 09:36.
 */
//@SpringBootApplication
//@EnableAsync
public class Application {

    public static void main(String[] args) {
        // close the application context to shut down the custom ExecutorService
        SpringApplication.run(Application.class, args).close();
    }

//    @Bean
//    public Executor asyncExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(2);
//        executor.setMaxPoolSize(2);
//        executor.setQueueCapacity(500);
//        executor.setThreadNamePrefix("GithubLookup-");
//        executor.initialize();
//        return executor;
//    }
}
