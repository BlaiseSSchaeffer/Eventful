package com.blaise2s.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.NonNull;

public class EventfulConfiguration extends Configuration {

    @NonNull
    @JsonProperty("application_name")
    private String applicationName;

    @JsonProperty("application_name")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("application_name")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
