package parkinglot.Accounts;

import parkinglot.constants.AccountStatus;
import parkinglot.model.Person;

public abstract class Account {

	private String userName;
	private String password;
	private AccountStatus status;
	private Person person;

	public abstract boolean resetPassword();

}
