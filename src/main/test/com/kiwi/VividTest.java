package com.kiwi;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Base64.Encoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kiwi.request.FeatureType;
import com.kiwi.request.Request;
import com.kiwi.request.RequestBuilder;
import com.kiwi.response.EntityAnnotation;
import com.kiwi.response.FaceAnnotation;
import com.kiwi.response.ImageProperties;
import com.kiwi.response.Result;
import com.kiwi.response.SafeSearchAnnotation;
import com.kiwi.response.TextAnnotation;

public class VividTest
{		
	private static final String key = "AIzaSyAtZOz5_ndljG1lMeC2-kTE9TzrXmZUU9s";
	private Vivid vivid;
		
	private static final String TEST_DIR = "src/main/test/";

	@Before
	public void setUp() throws Exception
	{
		vivid = new Vivid(key);
	}
	
	@Test
	public void testError() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
		         .imageUri("http://www.github.com/logo.jpg");

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test error", requests);
		
		assertNotNull(result.getErrors());
	}
	
	@Test
	public void testFace() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				 .content(toBase64(new File(TEST_DIR + "face.jpg")))
		         .addFeature(FeatureType.FACE_DETECTION);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test face expression", requests);
		
		FaceAnnotation face = result.getResponses().get(0).getFaceAnnotations().get(0);
		
		assertNull(result.getErrors());
		
		assertEquals("VERY_LIKELY", face.getJoyLikelihood());
	}
	
	@Test
	public void testSafeSearch() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				.content(toBase64(new File(TEST_DIR + "safe.jpg")))
				.addFeature(FeatureType.SAFE_SEARCH_DETECTION);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test safe search", requests);
				
		SafeSearchAnnotation safe = result.getResponses().get(0).getSafeSearchAnnotation();
		
		assertNull(result.getErrors());
		assertEquals("LIKELY", safe.getAdult());
	}
	
	@Test
	public void testImageProperties() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				 .content(toBase64(new File(TEST_DIR + "safe.jpg")))
		         .addFeature(FeatureType.IMAGE_PROPERTIES);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test image properties", requests);
				
		ImageProperties ann = result.getResponses().get(0).getImagePropertiesAnnotation();
		
		assertNull(result.getErrors());
		assertEquals(156.0, ann.getDominantColors().getColors().get(0).getColor().getRed(), 0.0);
	}
	
	@Test
	public void testOCR() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				.content(toBase64(new File(TEST_DIR + "text.jpg")))
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
	}
	
	@Test
	public void testLandmark() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				.content(toBase64(new File(TEST_DIR + "landmark.jpg")))
		        .addFeature(FeatureType.LANDMARK_DETECTION);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test text OCR", requests);
				
		EntityAnnotation ann = result.getResponses().get(0).getLandmarkAnnotations().get(0);
				
		assertNull(result.getErrors());		
		assertEquals(36.424045, ann.getLocations().get(0).getLatLng().getLatitude(), 0.0);
		assertEquals(25.427427, ann.getLocations().get(0).getLatLng().getLongitude(), 0.0);
	}


	@Test
	public void testRequest() throws IOException
	{
		RequestBuilder builder = new RequestBuilder()
				.content(toBase64(new File(TEST_DIR + "text.jpg")))
		        .addFeature(FeatureType.LABEL_DETECTION)
		        .addFeature(FeatureType.WEB_DETECTION, 1)
		        .addFeature(FeatureType.SAFE_SEARCH_DETECTION)
		        .addCropHintsParam(3.4f);

		Request request = builder.build();

		List<Request> requests = new ArrayList<>();
		requests.add(request);
		
		Result result = post("test request", requests);
		
		assertNull(result.getErrors());
	}

	private Result post(String action, List<Request> requests) throws IOException
	{
		long start = System.currentTimeMillis();
		
		Result result = vivid.post(requests);
		
		long end = System.currentTimeMillis() - start;
		
		System.out.println(action + ", time query = " + end);
		
		return result;
	}
	
	public String toBase64(File file) throws IOException
	{
		byte[] bytes = Files.readAllBytes(file.toPath());

		Encoder encoder = Base64.getEncoder();
		String base64 = encoder.encodeToString(bytes);

		return base64;
	}
	
	@After
	public void tearDown() throws Exception
	{
		vivid = null;
	}

}
