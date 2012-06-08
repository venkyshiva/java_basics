class InstanceOp {
	
	public static void main(String args[]) {

		Parent p = new Parent();

		Child c = new Child();	

		System.out.println("p is instance of Parent = " + (p instanceof Parent));

	}
}

class Parent {
}

class Child extends Parent implements IRelation {
}

interface IRelation {
}