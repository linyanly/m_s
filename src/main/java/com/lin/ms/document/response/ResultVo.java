package com.lin.ms.document.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by linyan on 2018/5/25.
 */
@Getter
@Setter
public class ResultVo implements Serializable{
	public static final String SUCCESS_CODE = "0";
	public static final String FAIL_CODE = "1";
	public static final String ERROR_CODE = "-1";

	private String code;
	private String msg;

	public ResultVo() {
	}

	public ResultVo(String code) {
		this.code = code;
	}

	public ResultVo(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
