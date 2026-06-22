package demo.scheduled;

import org.eclipse.dirigible.sdk.component.Component;
import org.eclipse.dirigible.sdk.job.Scheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Method-level scheduling (Spring's @Scheduled-on-a-method style): a @Component bean can host one or
 * more scheduled methods and use injected collaborators.
 */
@Component
public class Maintenance {

    private static final Logger LOGGER = LoggerFactory.getLogger("app.out");

    @Scheduled(expression = "0/45 * * * * ?")
    public void purgeTempFiles() {
        LOGGER.info("Maintenance.purgeTempFiles executed (method-level @Scheduled)!");
    }
}
