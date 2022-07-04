package chap8.exercise.daoexample;

public class DaoExample {
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		
		dbWork(new MysqlDao());
		
		
	}
	
	public static void dbWork(DataAcessobject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}
