package hello.springboot.config;

import java.io.UnsupportedEncodingException;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="boot")
public class Configinfo {
	private String name;

	public String getName() throws UnsupportedEncodingException {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
