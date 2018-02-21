package app.translated.de;

import java.util.Locale;

import org.springframework.stereotype.Component;

import app.translated.TranslationProvider;

@Component
class GermanProvider implements TranslationProvider {

    @Override
    public boolean match(Locale locale) {
      return locale.getLanguage().equals("de");
    }

    @Override
    public String getGreeting() {
        return "Guten Morgen, Welt!";
    }
}
