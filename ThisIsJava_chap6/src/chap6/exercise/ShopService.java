package chap6.exercise;

public class ShopService {
	//필드
	private static ShopService shopService = new ShopService();
	//private 생성자
	private ShopService() {}
	//메소드
	public static ShopService getInstance() {
		return shopService;
	}
}
