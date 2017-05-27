package xchihuo.cn.shiro.service;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * Created by chenrongfa on 2017/5/27.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
public class SessionService {
/*      sessionManager可以获取到httpsession的里面的额值     */
@RequiresRoles(value = {"admin"})
	public void test(){
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession(true);
		Object key = session.getAttribute("key");
		System.out.println("key"+key);
	}
}
