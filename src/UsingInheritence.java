import java.math.BigDecimal;

public class UsingInheritence {

	public static void main(String[] args) {

		Employee employee = new Employee("rohia");
		employee.setName("Vishal");
		employee.setEmail("rakesh@gmail.com");
		employee.setPhone(927282);
		employee.setTitle("tester");
		employee.setEmployerName("crm");
		employee.setEmployeeGrade('e');
		employee.setSalary(new BigDecimal(346743.2332));

		System.out.println(employee);
		String as = "asd";



	}

	public class UsingAbstraction {
		public static void main(String[] args) {

			abstraction_ectend abstractionbolte = new abstraction_ectend();
			abstractionbolte.two();
			int a = 0;
			char c = 'h';
			for (int i = 0; i < abstractionbolte.useThis().length(); i++) {
				if (abstractionbolte.useThis().charAt(i) == c) {
					a++;
				}
			}
			System.out.println(abstractionbolte.useThis());
			System.out.println(a);
		}
	}
}
