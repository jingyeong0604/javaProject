package chp8_prac;

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		

	} 





	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	
	}

}
