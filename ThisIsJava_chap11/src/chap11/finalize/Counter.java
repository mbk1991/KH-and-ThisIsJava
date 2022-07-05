package chap11.finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "¹ø °´Ã¼°¡ finalize() ½ÇÇàµÊ");
	}
}
