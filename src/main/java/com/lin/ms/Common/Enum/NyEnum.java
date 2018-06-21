package com.lin.ms.Common.Enum;

/**
 * Created by linyan on 2018/6/20.
 */
public enum NyEnum {

	Y("Y","是"),
	N("N","否");

	private String code;
	private String name;

	NyEnum(String code,String name){
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getNameByCode(String code){
		for (NyEnum nyEnum : NyEnum.values()) {
			if(nyEnum.getCode().equals(code)){
				return nyEnum.getName();
			}
		}

		return "";
	}
}
