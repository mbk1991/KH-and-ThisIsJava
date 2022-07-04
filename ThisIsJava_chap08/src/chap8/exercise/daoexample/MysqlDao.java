package chap8.exercise.daoexample;

public class MysqlDao implements DataAcessobject{

	@Override
	public void select() {
		System.out.println("Mysql DB 에서 검색");		
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB 에서 삽입");				
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB 에서 삭제");				
	}

	@Override
	public void update() {
		System.out.println("Mysql DB 에서 수정");				
	}

}
