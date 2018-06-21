package com.lin.ms.document.redis;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by linyan on 2018/6/20.
 */
@Getter
@Setter
public class CurrentUser implements Serializable{

	private String userName;

	private Integer userId;

	private String isAdmin;

	private Set<String> url = new HashSet<>();
}
