package sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("linedata.txt");
		Stream<String> stream;
		
		//Files.lines() 메소드 이용
		stream = Files.lines(path,Charset.defaultCharset()); // 운영체제의 디폴트 차셋
	    stream.forEach(System.out::println);
	    //stream.forEach(s -> System.out.println(s));
		stream.close();
		System.out.println();
		
		//BufferdReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
		
	}

}
