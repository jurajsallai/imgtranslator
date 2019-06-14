package io.github.imgtranslator.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextDTO {

    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("text")
    private String text;

}
