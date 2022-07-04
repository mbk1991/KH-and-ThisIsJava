package chap7.abstractmethodexam;

public abstract class Animal {
	private String kind;
	
	public Animal(String kind) {
		setKind(kind);
	}
	
	
	public void breathe() {
		System.out.println("¼ûÀ» ½±´Ï´Ù.");
	}
	public abstract void sound();
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
