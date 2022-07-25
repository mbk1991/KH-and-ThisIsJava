package sec02.stream_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

		// Path객체로 디렉토리 하위에 있는 파일, 폴더값들을 하나 씩 가져올 수 있다.
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Oracle");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		
	}

}
