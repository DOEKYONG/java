package Day11;

public class MysqlDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("Mysql Db에서검색");
	}
	@Override
	public void insert() {
		System.out.println("Mysql Db에 삽입");
		
	}
	@Override
	public void update() {
		System.out.println("Mysql Db를 수정");
		
	}
	@Override
	public void delete() {
		System.out.println("Mysql Db에서 삭제");
		
	}

}
