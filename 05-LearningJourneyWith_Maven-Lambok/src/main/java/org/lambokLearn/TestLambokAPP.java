package org.lambokLearn;

public class TestLambokAPP {

	public static void main(String[] args) {
		Employee em1 = new Employee();

		em1.setId(1);
		em1.setName("ABC");
		em1.setSal(14500);
		
		em1.setId(2);
		em1.setName("PQR");
		em1.setSal(16235);

		System.out.println(em1.getId() + "\t" + em1.getName() + "\t" + em1.getSal());
	}

}
