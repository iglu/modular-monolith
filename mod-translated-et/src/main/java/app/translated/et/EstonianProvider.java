package app.translated.et;

import java.util.Locale;

import org.springframework.stereotype.Component;

import app.translated.TranslationProvider;

@Component
class EstonianProvider implements TranslationProvider {

    @Override
    public boolean match(Locale locale) {
      return locale.getLanguage().equals("et");
    }

    @Override
    public String getGreeting() {
        return "Tere hommikut, maailm!";
    }
}
