package com.blaise2s.eventful.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
@JsonInclude(Include.NON_NULL)
public class Trial {

    @JsonCreator
    public Trial(@JsonProperty("trial_name") String trialName) {
        this.trialName = trialName;
    }

    @NonNull
    @JsonProperty("trial_name")
    private String trialName;
}
