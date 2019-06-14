package io.github.imgtranslator;

import io.github.imgtranslator.ocrspace.client.OCRSpaceClient;
import io.github.imgtranslator.ocrspace.dto.ImageReponseDTO;
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
public class OCRSpaceClientTest {

	@Autowired
	OCRSpaceClient ocrSpaceClient;

	@Value("${ocrspace.apikey}")
	private String apiKey;

	private Logger logger = LoggerFactory.getLogger(OCRSpaceClientTest.class);

	// TODO use diff image and compare if it contains text from that pic

	@Test
	public void getTextFromImgTest() {
		String imageUrl = "https://www.kirupa.com/flash/images/single_column_text.png";
		ImageReponseDTO reponse = ocrSpaceClient.getTextFromImage(apiKey, imageUrl);
		Assert.assertNotNull(reponse.getParsedResults().get(0).getParsedText());
		logger.info(reponse.getParsedResults().get(0).getParsedText());
	}

}
