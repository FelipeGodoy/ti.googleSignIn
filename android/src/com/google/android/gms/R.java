package com.google.android.gms;

import org.appcelerator.titanium.util.TiRHelper;
import org.appcelerator.titanium.util.TiRHelper.ResourceNotFoundException;

public class R {

    public static class attr {
        public static int adSize;
        public static int adUnitId;
        public static int allowShortcuts;
        // ... more ...
    }

    public static class color {
        // ...
    }

    public static class drawable {
        // ...
    }

    public static class id {
        // ...
    }

    public static class integer {
        // ...
    }

    public static class string {
        // ...
    }

    public static class styleable {
        // ...
        public static final int[] AdsAttrs = {
            styleable.AdsAttrs_adSize,
            styleable.AdsAttrs_adSizes,
            styleable.AdsAttrs_adUnitId,
        };
        // ... more ...
    }

    public static void initialize() {
        R.attr.adSize = getResource("attr.adSize");
        R.attr.adUnitId = getResource("attr.adUnitId");
        R.attr.allowShortcuts = getResource("attr.allowShortcuts");
        // ... more ...
    }

    private static int getResource(String path) {
        int id = 0;
        try {
            id = TiRHelper.getResource(path);
        } catch (ResourceNotFoundException e) {}
        return id;
    }
}
