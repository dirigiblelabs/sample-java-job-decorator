package demo.scheduled;

import org.eclipse.dirigible.engine.java.annotations.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates {@code @Scheduled}: fires every second via Quartz. Each execution logs a line that
 * the integration test asserts on to confirm the job was picked up by the runtime.
 */
@Scheduled(expression = "* * * * * ?")
public class CleanupJob {

    private static final Logger LOGGER = LoggerFactory.getLogger("app.out");

    public void run() {
        LOGGER.info("CleanupJob executed!");
    }

}
