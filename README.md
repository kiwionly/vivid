
Vivid = Google Vision java Client
=================================

Vivid is a simple Google Vision java client which much simple api and less dependencies

```sh
	   RequestBuilder builder = new RequestBuilder()
				  .content(toBase64(new File("test/text.jpg")))
		        .addFeature(FeatureType.TEXT_DETECTION);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test text OCR", requests);
				
		TextAnnotation ann = result.getResponses().get(0).getFullTextAnnotation().get(0);
				
		assertNull(result.getErrors());		
		assertTrue(ann.getText().contains("GPS"));
		assertTrue(ann.getText().contains("3.81730"));
		assertTrue(ann.getText().contains("永泰饼家"));
```

```sh
	compile 'com.alibaba:fastjson:1.+'
	compile 'com.squareup.okhttp3:okhttp:3.+'
```

Refer to unit test for difference scenario.

The Version is sync with Google Vision version. E.g. vivid version 1.0 == Google Vision v1.




