package ex;

import java.util.ArrayList;

public class Car   {
	
	 
	
	// �ʵ� 
	private int ������ȣ;
	private int �ݾ�;
	private String ��¥;
	private int �����ڸ�;
	
	// ������
	
	// �������
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// Ǯ������
	public Car(int ������ȣ, int �ݾ�, String ��¥, int �����ڸ�) {
		this.������ȣ = ������ȣ;
		this.�ݾ� = �ݾ�;
		this.��¥ = ��¥;
		this.�����ڸ� = �����ڸ�;
	}
	// �Է� ������
	public Car(int ������ȣ,  int �����ڸ�) {
		
		this.������ȣ = ������ȣ;
		
		this.�����ڸ� = �����ڸ�;
	}
	
	// ��� ������
	public Car(int ������ȣ) {
		
		this.������ȣ = ������ȣ;
	}
	
	

	public int get������ȣ() {
		return ������ȣ;
	}

	

	public void set������ȣ(int ������ȣ) {
		this.������ȣ = ������ȣ;
	}

	public int get�ݾ�() {
		return �ݾ�;
	}

	public void set�ݾ�(int �ݾ�) {
		this.�ݾ� = �ݾ�;
	}

	public String get��¥() {
		return ��¥;
	}

	public void set��¥(String ��¥) {
		this.��¥ = ��¥;
	}

	public int get�����ڸ�() {
		return �����ڸ�;
	}

	public void set�����ڸ�(int �����ڸ�) {
		this.�����ڸ� = �����ڸ�;
	}
	
	
	

	
	
	
	
	
	

}
