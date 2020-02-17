package com.big.foot;

import com.big.dick.BigDick;

public class BigFoot {
	private Integer size;
	private String name;
	private BigDick bd;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDick getBd() {
		return bd;
	}

	public void setBd(BigDick bd) {
		this.bd = bd;
	}

	@Override
	public String toString() {
		return "BigFoot [size=" + size + ", name=" + name + ", bd=" + bd + "]";
	}

}
