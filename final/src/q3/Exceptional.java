package q3;
public class Exceptional {
	public static void main(String[] args) {
		try {
			method1();
			method2();
			} catch (Exception e) {
				System.out.println("catch in main");
			}try {
				method2();
				method1();
				} catch (Exception e) {
					System.out.println("catch in main");
				}
			}
	public static void method1() throws Exception {
		try {
			method2();
			} catch (Exception e) {
				System.out.println("catch and throw in method1");
				throw e;
				
			}
		}
	public static void method2() throws Exception {
			System.out.println("throw in method2");
			throw new Exception("exception from method 2");
		}
	}
