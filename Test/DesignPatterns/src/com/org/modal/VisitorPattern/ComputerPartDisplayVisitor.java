package com.org.modal.VisitorPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Computer.");

	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Mouse.");

	}

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Keyboard.");

	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub

		System.out.println("Displaying Monitor.");
	}

}
