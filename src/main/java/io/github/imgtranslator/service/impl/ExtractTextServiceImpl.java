package io.github.imgtranslator.service.impl;

import io.github.imgtranslator.ocrspace.client.OCRSpaceClient;
import io.github.imgtranslator.ocrspace.dto.ImageReponseDTO;
import io.github.imgtranslator.ocrspace.dto.ParsedResultsDTO;
import io.github.imgtranslator.service.ExtractTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExtractTextServiceImpl implements ExtractTextService {

    @Value("${ocrspace.apikey}")
    private String apiKey;

    private OCRSpaceClient ocrSpaceClient;

    @Autowired
    public ExtractTextServiceImpl(OCRSpaceClient ocrSpaceClient) {
        this.ocrSpaceClient = ocrSpaceClient;
    }

    @Override
    public String extractText(String imageUrl) {
        ImageReponseDTO imageReponse = ocrSpaceClient.getTextFromImage(apiKey, imageUrl);
        if (imageReponse.getIsErroredOnProcessing()) {
            return "Error during reading an image.";
        }
        StringBuilder extractedText = new StringBuilder();
        for (ParsedResultsDTO result : imageReponse.getParsedResults()) {
            extractedText.append(result.getParsedText());
        }
        return extractedText.toString();
    }
}
