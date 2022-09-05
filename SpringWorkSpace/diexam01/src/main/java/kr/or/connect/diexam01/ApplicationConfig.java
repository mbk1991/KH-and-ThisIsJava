package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//나는 Config 파일이에요 알려주는 역할
@Configuration
public class ApplicationConfig {
	// XML대신에 이렇게 사용하는 방법.
	// Bean을등록하는 것도 메소드를 만드는 것처럼 사용하는 것이다.

	@Bean
	public Car car(Engine e) {
		Car c = new Car();
		return c;
	}

	@Bean
	public Engine engine() {
		return new Engine();
	}
}
