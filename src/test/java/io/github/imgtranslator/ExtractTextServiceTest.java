package io.github.imgtranslator;

import io.github.imgtranslator.ocrspace.dto.ImageReponseDTO;
import io.github.imgtranslator.service.ExtractTextService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExtractTextServiceTest {

    @Autowired
    ExtractTextService extractTextService;

    @Value("${ocrspace.apikey}")
    private String apiKey;

    private Logger logger = LoggerFactory.getLogger(OCRSpaceClientTest.class);

    @Test
    public void getTextFromImgTest() {
        String imageUrl = "https://www.kirupa.com/flash/images/single_column_text.png";
        String reponse = extractTextService.extractText(imageUrl);
        Assert.assertNotNull(reponse);
        logger.info(reponse);
    }

}
