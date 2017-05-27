package xchihuo.cn.shiro.reaml;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
public class AuthorRealm extends AuthorizingRealm {
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String principal = (String) principalCollection.getPrimaryPrincipal();
		System.out.println("authorization"+ principal);
		Set<String> roles=new HashSet<>();
		roles.add("user");
		if("admin".equals(principal)){
			roles.add("admin");
		}
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(roles);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		return null;
	}
}
