package io.github.imgtranslator.rest.controller;

import io.github.imgtranslator.service.ExtractTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TranslatorController {

    private ExtractTextService extractTextService;

    @Autowired
    public TranslatorController(ExtractTextService extractTextService) {
        this.extractTextService = extractTextService;
    }

    @GetMapping("/text")
    public String getTextFromImage(String imageUrl) {
        return extractTextService.extractText(imageUrl);
    }

    @GetMapping("/translation")
    public String getTranslantionFromImage(String imageUrl, String language) {
        // TODO
        return "translation from "+imageUrl+ " in " + language;
    }

}
