package io.github.imgtranslator.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranslationDTO {

    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("language")
    private String language;
    @JsonProperty("translation")
    private String translation;
    @JsonProperty("original")
    private String original;


}
