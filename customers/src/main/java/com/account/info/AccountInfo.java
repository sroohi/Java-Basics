package com.account.info;

public class AccountInfo {
	private Integer accountId;
	private String email;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AccountInfo [accountId=" + accountId + ", email=" + email + "]";
	}

}
