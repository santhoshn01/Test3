import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        logger.info("Starting DemoApplication...");
        SpringApplication.run(DemoApplication.class, args);
        logger.info("DemoApplication started successfully.");
    }

}
