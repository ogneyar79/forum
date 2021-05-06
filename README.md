# TRAINING PROJECT SPRING BOOT
[![Build Status](https://travis-ci.com/ogneyar79/forum.svg?branch=master)](https://travis-ci.com/ogneyar79/forum)
## FORUM CAR  SALES



Here use set up server by method __Main__.

```java

@SpringBootApplication
public class Main extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
```