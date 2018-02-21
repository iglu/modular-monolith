package app.web;

import java.util.Locale;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.simple.SimpleService;
import app.translated.TranslatedService;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
class GreetingController {

    private final SimpleService simpleService;
    private final TranslatedService translatedService;

    @GetMapping("simple")
    GreetingResponse simple() {
        String greeting = simpleService.getGreeting();
        return new GreetingResponse(greeting);
    }

    @GetMapping("translated")
    GreetingResponse translated(@RequestParam Locale locale) {
        String greeting = translatedService.getGreeting(locale);
        return new GreetingResponse(greeting);
    }
}
