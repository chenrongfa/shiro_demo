package xchihuo.cn.shiro.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import sun.security.jca.GetInstance;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:加密
 */
public class SecurityUtils {
	private  SecurityUtils(){

	}
	private static  SecurityUtils securityUtils=new SecurityUtils();
	public static SecurityUtils  GetInstance(){
		return securityUtils;
	}

	/**
	 * 加密
	 * @param securityName 加密名称
	 * @param password 密码
	 * @param salt 盐值
	 * @param count 加密次数
	 * @return
	 */
	public SimpleHash security(String securityName,Object password,Object salt
	,int count){
		return new SimpleHash(securityName,password,salt,count);
	}
}
