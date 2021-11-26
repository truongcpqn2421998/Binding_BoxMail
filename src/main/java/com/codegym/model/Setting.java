package com.codegym.model;

public class Setting {
    private String language;
    private String size;
    private boolean filter;
    private String signature;

    public Setting() {
    }

    public Setting(String language, String size, boolean filer, String signature) {
        this.language = language;
        this.size = size;
        this.filter = filer;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
