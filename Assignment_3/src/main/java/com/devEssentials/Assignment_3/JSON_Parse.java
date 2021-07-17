package com.devEssentials.Assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_Parse {

	public static String readUrl(String urlString) throws Exception {
		BufferedReader bufferReader = null;
		try {
			URL url = new URL(urlString);
			bufferReader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];

			while ((read = bufferReader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			return buffer.toString();
		} finally {
			if (bufferReader != null)
				bufferReader.close();
		}
	}

	public static void main(String[] args) throws IOException, JSONException {
		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(readUrl(
					"https://en.wikipedia.org/w/api.php?format=json&action=query&titles=SMALL&prop=revisions&rvprop=content"));
			System.out.println(jsonObj.toString());
			int pageId = jsonObj.getJSONObject("query").getJSONObject("pages").getJSONObject("1808130").getInt("pageid");
			String seeAlso = jsonObj.getJSONObject("query").getJSONObject("pages").getJSONObject("1808130")
					.getJSONArray("revisions").getJSONObject(0).getString("*");
			System.out.println("pageid : " + pageId);
			System.out.println("See Also Link " + seeAlso);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
