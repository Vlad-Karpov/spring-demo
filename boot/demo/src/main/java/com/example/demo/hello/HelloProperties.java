package com.example.demo.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties("hello")
public class HelloProperties {

    /**
     * Префикс.
     */
    String prefix;
    /**
     * Суфикс.
     */
    String suffix = "!";

    /**
     * получить Префикс.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * установить Префикс.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * получить Суфикс.
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * уствновить Суфикс.
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

}
