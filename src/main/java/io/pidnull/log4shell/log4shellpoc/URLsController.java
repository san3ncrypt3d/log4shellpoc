package io.pidnull.log4shell.log4shellpoc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class URLsController {

    private static final Logger logger = LogManager.getLogger("log4shellpoc logger");

	@GetMapping("/")
	public String slash() {
		return "The app have an endpoint /api for logging -san3ncrypt3d";
	}

    @GetMapping("/api")
    public String slashapi(@RequestHeader("User-Agent") String ua) {
        logger.info("User agent used was: " + ua);
        return "GET request to /api is successful.";
    }

}
