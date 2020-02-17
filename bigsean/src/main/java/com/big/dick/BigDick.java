package com.big.dick;

import com.big.sean.BigSean;

public class BigDick {
	private String name;
	private Integer size;
	private BigSean bs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public BigSean getBs() {
		return bs;
	}

	public void setBs(BigSean bs) {
		this.bs = bs;
	}

	@Override
	public String toString() {
		return "BigDick [name=" + name + ", size=" + size + ", bs=" + bs + "]";
	}

}
