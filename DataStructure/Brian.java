class Base {
	protected void foo() {}
} 
class Derived extends Base {
	void foo() {}
} 
class Main {
	public static void main(String args[]) {
		Derived d = new Derived();
		//Base d=new Base();
		d.foo();
	}
}