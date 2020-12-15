import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BetterHttpClass {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        CompletableFuture<HttpResponse<String>> users = CompletableFuture.supplyAsync(() -> {
            try {
                var userRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/users")).build();
                return HttpClient.newHttpClient().send(userRequest, HttpResponse.BodyHandlers.ofString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<HttpResponse<String>> albums = CompletableFuture.supplyAsync(() -> {
            try {
                var userRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
                return HttpClient.newHttpClient().send(userRequest, HttpResponse.BodyHandlers.ofString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<HttpResponse<String>> photos = CompletableFuture.supplyAsync(() -> {
            try {
                var userRequest = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/photos")).build();
                return HttpClient.newHttpClient().send(userRequest, HttpResponse.BodyHandlers.ofString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });


        CompletableFuture.allOf(users, albums, photos);


        long end = System.currentTimeMillis();


        System.out.println(end - start + "ms");

        System.out.println(users.get().body().substring(0, 20));
        System.out.println(albums.get().body().substring(0, 20));
        System.out.println(photos.get().body().substring(0, 20));
    }

}
