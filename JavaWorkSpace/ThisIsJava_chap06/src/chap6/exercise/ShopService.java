package chap6.exercise;

public class ShopService {
	//�ʵ�
	private static ShopService shopService = new ShopService();
	//private ������
	private ShopService() {}
	//�޼ҵ�
	public static ShopService getInstance() {
		return shopService;
	}
}
