package Day11;

public class MysqlDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("Mysql Db�����˻�");
	}
	@Override
	public void insert() {
		System.out.println("Mysql Db�� ����");
		
	}
	@Override
	public void update() {
		System.out.println("Mysql Db�� ����");
		
	}
	@Override
	public void delete() {
		System.out.println("Mysql Db���� ����");
		
	}

}
