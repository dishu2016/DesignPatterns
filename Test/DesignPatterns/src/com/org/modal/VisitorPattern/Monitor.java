package com.org.modal.VisitorPattern;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);

	}

}
