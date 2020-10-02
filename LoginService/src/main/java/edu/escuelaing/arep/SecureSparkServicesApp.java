package edu.escuelaing.arep;

import static spark.Spark.*;

import java.math.BigInteger;
import java.security.MessageDigest;

import spark.Request;
import spark.Response;

public class SecureSparkServicesApp {

    private static String cuser = "aquiles@gmail.com";
    private static String cpass = "a9d27598d9b4fe779b18d398a665691f06df6fb7800c805670c07c5f3efa9bd5"; //aca123
    public static void main(String[] args) {
        port(getPort());

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("keystores/ecikeylogstore.p12", "aca123", null, null); 

        get("/hello", (req, res) -> "Hello Heroku");
        get("/index", (req, res) -> indexDataPage(req, res));
        get("/processdata", (req, res) -> processDataPage(req, res));
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/senddata", (req, res) -> sendData(req, res));
    }

    private static String processDataPage(Request req, Response res) {
        String name = req.queryParams("value");
        String pass = req.queryParams("pass");

        String toReturn ="";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(pass.getBytes("utf8"));
            toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(!name.equals(cuser) || !toReturn.equals(cpass)){
            res.redirect("/index");
        }
        System.out.println(toReturn);
        System.out.println("process: "+name+" pw: "+pass);
        res.redirect("/inputdata");
        return "";
    }

    private static String sendData(Request req, Response res) {
        String msg = req.queryParams("numbers");
        System.out.println("send"+msg);
        String response = RESTinsert(msg);
        System.out.println(response);
        return response;
    }

    private static String indexDataPage(Request req, Response res) {

        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Login</h2>"
                + "<form action=\"/processdata\">"
                + "  <br>"
                + "  <input type=\"text\" name=\"value\">"
                + "  <br>"
                + " <input type=\"password\" name=\"pass\">"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Enviar\">"
                + "</form>"
                + "<p> Presione enviar para loguearse</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>CALCULADORA</h2>"
                + "<p> Esta calculadora permite calcular Promedio y la desviacion estandar de los datos</p>"
                + "<form action=\"/senddata\">"
                + "  ingrese los datos separados por comas<br>"
                + "  <input type=\"text\" name=\"numbers\">"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Enviar\">"
                + "</form>"
                + "<p> Presione enviar para procesar los datos</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String RESTinsert(String msg) {
        String data = null;
        data = HTTPRESTUNI.postRequest(msg);
        return data;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001; //returns default port if heroku-port isn't set (i.e. on localhost)
    } 
}
