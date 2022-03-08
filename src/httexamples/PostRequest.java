package httexamples;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class PostRequest {

    public static final String URL_POST = "http://httpbin.org/forms/post";

    //public static final String FILE_JSON = "C:\\Users\\lucas\\IdeaProjects\\ExerciciosPraticosMetodosJava\\src\\httexamples\\pedido.json";

    public static void main(String[] args) throws FileNotFoundException {
        // cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // criar a requisição para a url informada
        HttpRequest request = HttpRequest.newBuilder()
                //.POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}
