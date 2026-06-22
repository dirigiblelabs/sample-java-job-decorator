package demo.scheduled;

import org.eclipse.dirigible.sdk.component.Component;
import org.eclipse.dirigible.sdk.job.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Strong-interface job style: a {@code @Component} that implements {@link JobHandler} and supplies
 * its own cron schedule — no {@code @Scheduled} annotation. Fires every second; each execution logs
 * a line that the integration test asserts on to confirm the job was picked up by the runtime.
 */
@Component
public class CleanupJob implements JobHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger("app.out");

    @Override
    public String cron() {
        return "* * * * * ?";
    }

    @Override
    public void run() {
        LOGGER.info("CleanupJob executed!");
    }
}
