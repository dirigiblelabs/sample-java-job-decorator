package demo.scheduled;

import org.eclipse.dirigible.sdk.job.JobHandler;
import org.eclipse.dirigible.sdk.job.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Strong-interface job style: implement JobHandler for a compile-checked run().
 */
@Scheduled(expression = "0/30 * * * * ?")
public class ReportJob implements JobHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger("app.out");

    @Override
    public void run() {
        LOGGER.info("ReportJob executed (JobHandler)!");
    }
}
