package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            String name = split[0];
            int size = Integer.parseInt(split[1]);
            Font newFont = new Font(name, size);
            cache.put(font, newFont);
            return newFont;
        }
    }

}
