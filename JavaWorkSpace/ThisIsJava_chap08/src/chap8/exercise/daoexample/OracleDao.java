package chap8.exercise.daoexample;

public class OracleDao implements DataAcessobject{

	@Override
	public void select() {
		System.out.println("Oracle DB ���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB ���� ����");		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB ���� ����");		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB ���� ����");		
	}

}
