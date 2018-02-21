package app.translated;

import java.util.List;
import java.util.Locale;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import app.simple.SimpleService;

@Component
@RequiredArgsConstructor
public class TranslatedService {

    private final List<TranslationProvider> providers;
    private final SimpleService simpleService;

    public String getGreeting(Locale locale) {
        return providers.stream()
            .filter(provider -> provider.match(locale))
            .map(TranslationProvider::getGreeting)
            .findFirst()
            .orElseGet(simpleService::getGreeting);
    }

}
