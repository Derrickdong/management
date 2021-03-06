package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Pager;
import model.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

	@Override
	public List<Role> getAllRoles() {
		String hql = "from Role r where r.state=1";
		return super.list(hql, null, null);
	}

	@Override
	public Pager<Role> getAllPagerRoles() {
		String hql = "from Role";
		return super.find(hql, null, null);
	}

}
