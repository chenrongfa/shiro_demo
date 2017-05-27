package xchihuo.cn.shiro.utils;

import java.util.HashMap;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function: shiroFilter 资源拦截器
 */
public class UrlfilterMapfactory {

	public HashMap<String,Object> builderUrlFilterMap(){
		HashMap<String,Object> urlFilter=new HashMap<>();
		urlFilter.put("/shiro/login","anon");
		urlFilter.put("/shiro/logout","logout");
		urlFilter.put("/shiro/admin","roles[\"admin\"]");
		urlFilter.put("/shiro/user","roles[\"admin\"],roles[\"user\"]");
		urlFilter.put("/**","authc");
		return urlFilter;
	}

}
