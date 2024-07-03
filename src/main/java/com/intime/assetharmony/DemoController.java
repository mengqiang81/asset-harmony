package com.intime.assetharmony;

import java.time.Duration;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author chigui.meng
 * @date 24/10/2023 9:11 pm
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private final PersonMapper personMapper;

    Logger logger = org.slf4j.LoggerFactory.getLogger(DemoController.class);

    DemoController(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello world!");
    }

    @GetMapping("/list")
    public Flux<Person> list() {
        logger.info("1111");
        return personMapper
            .findAll()
            .delayElements(Duration.ofSeconds(2));
    }
}
