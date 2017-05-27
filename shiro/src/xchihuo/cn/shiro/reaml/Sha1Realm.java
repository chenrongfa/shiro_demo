package xchihuo.cn.shiro.reaml;

import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import xchihuo.cn.shiro.utils.SecurityUtils;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
public class Sha1Realm extends AuthenticatingRealm {
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws
			AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		System.out.println(token.getPassword());
		String username = token.getUsername();
		ByteSource bytes=null;
		SimpleHash sha1=null;
		if ("admin".equals(username)) {

			bytes = ByteSource.Util.bytes(username);
			sha1 = SecurityUtils.GetInstance().security("Sha1", "0123456", bytes, 10);
		} else if("user".equals(username)){
			bytes = ByteSource.Util.bytes(username);
			sha1 = SecurityUtils.GetInstance().security("Sha1", "0123456", bytes, 10);
		}
		System.out.println("sha1");
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(username,sha1,bytes,getName());
		return info;
	}
}
