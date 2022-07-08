package exercise.board.model.vo;

public class Board {
	private int no;
	private String writer;
	private String title;
	private String content;
	//private String id;
	//private String pwd;
	
	public Board() {}
	
	public Board(String writer,String title,String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	
	
	
	@Override
	public String toString() {
		return writer + " | " + "\t" + title + "\t|";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
