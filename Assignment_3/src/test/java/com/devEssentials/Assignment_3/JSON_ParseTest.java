package com.devEssentials.Assignment_3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.devEssentials.Assignment_3.JSON_Parse;


@RunWith(MockitoJUnitRunner.class)
public class JSON_ParseTest {

	@InjectMocks
	JSON_Parse jsoneg;
	
	@Test	
	public void  readUrl() throws Exception  {
		String urlString="https://en.wikipedia.org/w/api.php?format=json&action=query&titles=SMALL&prop=revisions&rvprop=content";
		JSON_Parse.readUrl( urlString);
		Assert.assertEquals("https://en.wikipedia.org/w/api.php?format=json&action=query&titles=SMALL&prop=revisions&rvprop=content", urlString);
	}
	
	@Test(expected=MalformedURLException.class)
	public void  readUrlNull() throws Exception  {
		JSON_Parse.readUrl( null);
		try {
			Mockito.when(JSON_Parse.readUrl( null)).thenThrow(MalformedURLException.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}