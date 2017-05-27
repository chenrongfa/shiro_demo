package xchihuo.cn.shiro.reaml;

import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import xchihuo.cn.shiro.utils.SecurityUtils;

/**
 * Created by chenrongfa on 2017/5/26.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
public class ShiroReaml  extends AuthenticatingRealm{

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
		String username=token.getUsername();
		if("chenrongfa".equals(token.getUsername())){

			throw  new AccountException("别写我的名字呀");
		}
		System.out.println("密码"+token.getPassword());
		if("123456".equals(token.getPassword())){
			throw new CredentialsException("密码错误");
			}
		ByteSource bytes=null;
		SimpleHash md5=null;
		if ("admin".equals(username)) {
			bytes = ByteSource.Util.bytes(username);
			md5 = SecurityUtils.GetInstance().security("md5","123456",bytes,10);

		} else if("user".equals(username)){
			bytes = ByteSource.Util.bytes(username);

			md5 = SecurityUtils.GetInstance().security("md5","123456",bytes,10);
		}
		System.out.println("bytes"+bytes);

		System.out.println(md5);
		System.out.println("md5");
			SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(token.getUsername()
			,md5,bytes,getName());


		return info;
	}
}
