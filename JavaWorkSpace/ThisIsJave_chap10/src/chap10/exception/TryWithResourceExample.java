package chap10.exception;

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
	
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
		
	}
}
