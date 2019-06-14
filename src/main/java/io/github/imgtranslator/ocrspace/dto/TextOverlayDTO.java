package io.github.imgtranslator.ocrspace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TextOverlayDTO
{
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Lines")
    private List<String> lines;
    @JsonProperty("HasOverlay")
    private String hasOverlay;

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public List<String> getLines ()
    {
        return lines;
    }

    public void setLines (List<String> lines)
    {
        this.lines = lines;
    }

    public String getHasOverlay ()
    {
        return hasOverlay;
    }

    public void setHasOverlay (String hasOverlay)
    {
        this.hasOverlay = hasOverlay;
    }


}