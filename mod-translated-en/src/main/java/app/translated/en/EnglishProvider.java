package app.translated.en;

import java.util.Locale;

import org.springframework.stereotype.Component;

import app.translated.TranslationProvider;

@Component
class EnglishProvider implements TranslationProvider {

    @Override
    public boolean match(Locale locale) {
      return locale.getLanguage().equals("en");
    }

    @Override
    public String getGreeting() {
        return "Good morning, World!";
    }
}
