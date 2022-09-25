package test.test.test;

public class TestMainClass {

	public static void main(String[] args) {
		
		//img태그의 src의 경로만 가져오기.
		
		String target="<p><img src=\"/resources/image/review/summerImageFiles/20220919164712.png\" style=\"width: 543px;\"><img src=\"/resources/image/review/summerImageFiles/20220919164617.png\" style=\"width: 678px;\">"
				+ "</p><p><img src=\"/resources/image/review/summerImageFiles/20220920085349.png\" style=\"width: 25%;\"><br></p><p>다른 컴퓨터에서는 이미지가 안 뜸."
				+ "</p><p>이미지 저장 폴더가 공유되고 있지 않기 때문.</p>";
		
		String regEx="[\"]";
		
		String[] sources = target.split(regEx);

		int index = 0;
		for(String source:sources) {
			
			if(source.contains("image")) {
				System.out.println(index+" : "+source);
			}
			
			index++;
		}
		
//		String regEx=""
		
	}
}
