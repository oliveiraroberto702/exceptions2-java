package model.exceptions;

public class DomainException extends RuntimeException {  //extends RuntimeExceptrion
	private static final long serialVersionUID = 1L;  
	
	public DomainException(String msg) {
		super(msg);
	}
}
