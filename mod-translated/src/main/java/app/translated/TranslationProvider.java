package app.translated;

import java.util.Locale;

public interface TranslationProvider {

    boolean match(Locale locale);

    String getGreeting();

}
