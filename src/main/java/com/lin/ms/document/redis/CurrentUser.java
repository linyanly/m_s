package com.lin.ms.document.redis;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linyan on 2018/6/20.
 */
@Getter
@Setter
public class CurrentUser implements Serializable{

	private String userName;

	private String isAdmin;

	private List<String> url = new ArrayList<>();
}
