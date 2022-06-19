package chap5;

public class ArrayCopyExample {
	//System.arraycopy()로 배열 복사
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[10];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) System.out.print(newStrArray[i] + ", ");
	}
}
