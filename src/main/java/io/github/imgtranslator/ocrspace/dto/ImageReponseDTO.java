package io.github.imgtranslator.ocrspace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ImageReponseDTO
{
    @JsonProperty("IsErroredOnProcessing")
    private boolean isErroredOnProcessing;
    @JsonProperty("ParsedResults")
    private List<ParsedResultsDTO> parsedResults;
    @JsonProperty("ProcessingTimeInMilliseconds")
    private String processingTimeInMilliseconds;
    @JsonProperty("SearchablePDFURL")
    private String searchablePDFURL;
    @JsonProperty("OCRExitCode")
    private String ocrExitCode;

    public boolean getIsErroredOnProcessing ()
    {
        return isErroredOnProcessing;
    }

    public void setIsErroredOnProcessing (boolean isErroredOnProcessing)
    {
        this.isErroredOnProcessing = isErroredOnProcessing;
    }

    public List<ParsedResultsDTO> getParsedResults()
    {
        return parsedResults;
    }

    public void setParsedResults(List<ParsedResultsDTO> parsedResults)
    {
        this.parsedResults = parsedResults;
    }

    public String getProcessingTimeInMilliseconds ()
    {
        return processingTimeInMilliseconds;
    }

    public void setProcessingTimeInMilliseconds (String processingTimeInMilliseconds)
    {
        this.processingTimeInMilliseconds = processingTimeInMilliseconds;
    }

    public String getSearchablePDFURL ()
    {
        return searchablePDFURL;
    }

    public void setSearchablePDFURL (String searchablePDFURL)
    {
        this.searchablePDFURL = searchablePDFURL;
    }

    public String getOCRExitCode ()
    {
        return ocrExitCode;
    }

    public void setOCRExitCode (String ocrExitCode)
    {
        this.ocrExitCode = ocrExitCode;
    }

}
