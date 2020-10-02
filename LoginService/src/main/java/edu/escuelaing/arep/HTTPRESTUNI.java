package edu.escuelaing.arep;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class HTTPRESTUNI {

    static String mainUrl = "http://3.95.38.184:35000";

    public HTTPRESTUNI() {
    }

    public static String getRequest() {
        String path2 = "/hello";
        String url = mainUrl + path2;
        HttpResponse<String> response = Unirest.get(url).asString();
        return response.getBody();
    }

    public static String postRequest(String msg) {
        String path = "/receivedata";
        String url = mainUrl+path;
        HttpResponse<String> response = Unirest.post(url)
                                            .body(msg)
                                            .asString();
        return response.getBody();
    }

    public static void main(String[] args) {
        URLReader.readURL("http://localhost:4567/hello");
    }
}
