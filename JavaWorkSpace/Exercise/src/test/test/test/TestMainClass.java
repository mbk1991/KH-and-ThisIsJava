package test.test.test;

public class TestMainClass {

	public static void main(String[] args) {
		
		//img�±��� src�� ��θ� ��������.
		
		String target="<p><img src=\"/resources/image/review/summerImageFiles/20220919164712.png\" style=\"width: 543px;\"><img src=\"/resources/image/review/summerImageFiles/20220919164617.png\" style=\"width: 678px;\">"
				+ "</p><p><img src=\"/resources/image/review/summerImageFiles/20220920085349.png\" style=\"width: 25%;\"><br></p><p>�ٸ� ��ǻ�Ϳ����� �̹����� �� ��."
				+ "</p><p>�̹��� ���� ������ �����ǰ� ���� �ʱ� ����.</p>";
		
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
