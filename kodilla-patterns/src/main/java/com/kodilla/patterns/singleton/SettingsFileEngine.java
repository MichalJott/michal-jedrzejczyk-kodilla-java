package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {
    }

    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized(SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings");
        return true;
    }
}