package com.theironyard;

import com.theironyard.models.Room;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

    //public static Room room = new Room();

    private final Log logger = LogFactory.getLog(GameApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}
}
