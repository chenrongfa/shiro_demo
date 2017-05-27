package xchihuo.cn.shiro.reaml;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.Realm;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
public class TestRealm implements Realm {
	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean supports(AuthenticationToken authenticationToken) {
		return false;
	}

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		return null;
	}
}
