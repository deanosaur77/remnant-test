package com.remnant.thirdparty.valr;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class ValrSigner{
	    /**
	     * Signs the request payload using the api key secret
	     *
	     * @param apiKeySecret - the api key secret
	     * @param timestamp    - the unix timestamp of this request e.g. Clock.systemUTC().millis()
	     * @param verb         - Http verb - GET, POST, PUT or DELETE
	     * @param path         - path excluding host name, e.g. '/v1/withdraw
	     * @param body         - http request body as a string, optional
	     * @return the signature of the request
	     */
	    public static String signRequest(String apiKeySecret, String timestamp, String verb, String path, String body, String subAccountId) {
	        try {
	        	System.out.println(verb + path + body);
	        	
	            Mac hmacSHA512 = Mac.getInstance("HmacSHA512");
	            SecretKeySpec secretKeySpec = new SecretKeySpec(apiKeySecret.getBytes(), "HmacSHA512");
	            hmacSHA512.init(secretKeySpec);
	            hmacSHA512.update(timestamp.getBytes());
	            hmacSHA512.update(verb.toUpperCase().getBytes());
	            hmacSHA512.update(path.getBytes());
	            hmacSHA512.update(body.getBytes());
	            hmacSHA512.update(subAccountId.getBytes());
	            byte[] digest = hmacSHA512.doFinal();
	            return toHexString(digest);
	        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
	            throw new RuntimeException("Unable to sign request", e);
	        }
	    }
	    
	    private static String toHexString(byte[] a) {
	        StringBuilder sb = new StringBuilder(a.length * 2);
	        for (byte b : a)
	            sb.append(String.format("%02x", b));
	        return sb.toString();
	    }
}

