package javaStudy.maven.maven_study;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@Provides
public class Sample {
	private int id;
	private String name;

}
