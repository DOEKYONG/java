package Day11;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle Db�����˻�");
	}
	@Override
	public void insert() {
		System.out.println("Oracle Db�� ����");
		
	}
	@Override
	public void update() {
		System.out.println("Oracle Db�� ����");
		
	}
	@Override
	public void delete() {
		System.out.println("Oracle Db���� ����");
		
	}
}

