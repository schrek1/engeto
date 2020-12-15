import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClass {


    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        long start = System.currentTimeMillis();

        // create a client
        var client = HttpClient.newHttpClient();

        // create a request
        var userRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/users")).build();
        var albumsRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
        var photosRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/photos")).build();

        // use the client to send the request
        var userResponse = client.send(userRequest, HttpResponse.BodyHandlers.ofString());
        var albumsResponse = client.send(albumsRequest, HttpResponse.BodyHandlers.ofString());
        var photosResponse = client.send(photosRequest, HttpResponse.BodyHandlers.ofString());


        long end = System.currentTimeMillis();


        System.out.println(end - start + "ms");

        System.out.println(userResponse.body().substring(0,20));
        System.out.println(albumsResponse.body().substring(0,20));
        System.out.println(photosResponse.body().substring(0,20));
    }

}
