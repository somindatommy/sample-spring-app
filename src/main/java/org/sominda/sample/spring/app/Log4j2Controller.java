package org.sominda.sample.spring.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2Controller {

    private static final Logger log = LogManager.getLogger(Log4j2Controller.class);

    @RequestMapping("/log/print")
    public String displayLogs() {

        log.info("This is an info log");
        log.debug("This is an debug log");
        log.error("This is an error log");
        return "Logs have printed in the terminal";
    }
}
