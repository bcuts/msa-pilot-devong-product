import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devong.product.*"})
public class StartApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);
    }
}
