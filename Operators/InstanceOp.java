class InstanceOp {
	
	public static void main(String args[]) {

		Parent p = new Parent();

		Parent c = new Child();	

		System.out.println("p is instance of Parent = " + (p instanceof Parent));

		System.out.println("c is instance of Child ="+(c instanceof Child));

		System.out.println("c implements IRelation = "+ (c instanceof IRelation));
	}
}

class Parent {
}

class Child extends Parent implements IRelation {
}

interface IRelation {
}
