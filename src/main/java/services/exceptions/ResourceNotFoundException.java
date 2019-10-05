package services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found Id "+id);
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
