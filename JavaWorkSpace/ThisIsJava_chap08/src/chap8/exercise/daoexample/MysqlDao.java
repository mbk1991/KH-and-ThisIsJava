package chap8.exercise.daoexample;

public class MysqlDao implements DataAcessobject{

	@Override
	public void select() {
		System.out.println("Mysql DB ���� �˻�");		
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB ���� ����");				
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB ���� ����");				
	}

	@Override
	public void update() {
		System.out.println("Mysql DB ���� ����");				
	}

}
