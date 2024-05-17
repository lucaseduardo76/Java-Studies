package model.exception;

public class AccountLimitException extends Exception {
	private static final long serialVersionUID = 1L;

	public  AccountLimitException(String msg) {
		super(msg);
	}
}
