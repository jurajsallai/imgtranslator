package io.github.imgtranslator.ocrspace.client;

import io.github.imgtranslator.ocrspace.dto.ImageReponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OCRSpaceClient {

    private Logger logger = LoggerFactory.getLogger(OCRSpaceClient.class);

    @Value("${ocrspace.url}")
    private String ocrSpaceURL;

    private RestTemplate restTemplate;

    @Autowired
    public OCRSpaceClient(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public ImageReponseDTO getTextFromImage(String apiKey, String imageUrl) {
        try {
            return restTemplate.getForObject(ocrSpaceURL, ImageReponseDTO.class, apiKey, imageUrl);
        } catch (Exception e) {
            logger.error("error during communication with OCRSpace API");
            throw e;
        }
    }



}
