package member.model.vo;

import java.util.ArrayList;

public class NoticePageData {

	private ArrayList<Notice> nList;
	private String currentPage;
	
	public NoticePageData() {}
	
	public NoticePageData(ArrayList<Notice> nList, String currentPage) {
		super();
		this.nList = nList;
		this.currentPage = currentPage;
	}

	public ArrayList<Notice> getnList() {
		return nList;
	}
	public void setnList(ArrayList<Notice> nList) {
		this.nList = nList;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	
	
	

	
	
	
}
