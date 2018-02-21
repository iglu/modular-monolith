package app.web;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.simple.SimpleService;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
class GreetingController {

    private final SimpleService simpleService;

    @GetMapping("simple")
    GreetingResponse simple() {
        String greeting = simpleService.getGreeting();
        return new GreetingResponse(greeting);
    }

}
