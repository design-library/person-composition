/**
 * Copyright 2017 plat4u.com
 * 
 * This file is part of person elements.
 *
 *  plat4u.com is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  plat4u.com is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with plat4u.com.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.plat4u.person.account.biz.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.plat4u.person.account.biz.dao.AccountDao;
import com.plat4u.person.account.biz.entity.AccountEntity;

/**
 * AccountDaoImpl
 *
 * @author plat4u.com
 * @version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {
	
	@PersistenceContext
    EntityManager entityManager;
	
	/* (�� Javadoc)
	 * @see com.plat4u.person.account.biz.dao.AccountDao#findOne(com.plat4u.person.account.biz.entity.AccountEntity)
	 */
	public AccountEntity findOne(AccountEntity entity) {
		
		Query query = entityManager.createNamedQuery("Account.findOne", AccountEntity.class);
		query.setParameter("id", entity.getId());
		query.setParameter("password", entity.getPassword());
		AccountEntity accountEntityRtn = (AccountEntity)query.getSingleResult();
		
		return accountEntityRtn;
	}

}
