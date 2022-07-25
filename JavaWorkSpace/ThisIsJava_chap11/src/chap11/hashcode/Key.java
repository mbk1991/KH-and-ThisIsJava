package chap11.hashcode;

public class Key {
	// hashCode()�޼ҵ带 ���������� ����.

	public int number;

	public Key(int number) {
		this.number = number;
	}

	// ��ü�� ������ Ȯ�� �� �ʵ尪���� ������ Ȯ����.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
}
