package io.github.imgtranslator.ocrspace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParsedResultsDTO
{
    @JsonProperty("TextOrientation")
    private String textOrientation;
    @JsonProperty("ParsedText")
    private String parsedText;
    @JsonProperty("FileParseExitCode")
    private String fileParseExitCode;
    @JsonProperty("ErrorDetails")
    private String errorDetails;
    @JsonProperty("ErrorMessage")
    private String errorMessage;
    @JsonProperty("TextOverlay")
    private TextOverlayDTO textOverlay;

    public String getTextOrientation ()
    {
        return textOrientation;
    }

    public void setTextOrientation (String textOrientation)
    {
        this.textOrientation = textOrientation;
    }

    public String getParsedText ()
    {
        return parsedText;
    }

    public void setParsedText (String parsedText)
    {
        this.parsedText = parsedText;
    }

    public String getFileParseExitCode ()
    {
        return fileParseExitCode;
    }

    public void setFileParseExitCode (String fileParseExitCode)
    {
        this.fileParseExitCode = fileParseExitCode;
    }

    public String getErrorDetails ()
    {
        return errorDetails;
    }

    public void setErrorDetails (String errorDetails)
    {
        this.errorDetails = errorDetails;
    }

    public String getErrorMessage ()
    {
        return errorMessage;
    }

    public void setErrorMessage (String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public TextOverlayDTO getTextOverlay ()
    {
        return textOverlay;
    }

    public void setTextOverlay (TextOverlayDTO textOverlay)
    {
        this.textOverlay = textOverlay;
    }

}