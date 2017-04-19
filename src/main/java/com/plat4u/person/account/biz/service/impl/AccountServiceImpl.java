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
package com.plat4u.person.account.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plat4u.person.account.biz.dao.AccountDao;
import com.plat4u.person.account.biz.domain.Account;
import com.plat4u.person.account.biz.entity.AccountEntity;
import com.plat4u.person.account.biz.service.AccountService;
import com.plat4u.person.exception.AuthenticationException;

/**
 * AccountServiceImpl
 *
 * @author plat4u.com
 * @version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	/* (�� Javadoc)
	 * @see com.plat4u.person.account.biz.service.AccountService#authenticate(com.plat4u.person.account.biz.domain.Account)
	 */
	public Account authenticate(Account account) throws AuthenticationException {
		
		// create AccountEntity.
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setId(account.id().id());
		accountEntity.setPassword(account.password().stretch());
		
		// execute.
		AccountEntity accountEntityRtn = accountDao.findOne(accountEntity);
		
		// create Account
		Account accountRtn = new Account(accountEntityRtn.getId(), accountEntityRtn.getPassword());
		
		return accountRtn;
	}

	/* (�� Javadoc)
	 * @see com.plat4u.person.account.biz.service.AccountService#create(com.plat4u.person.account.biz.domain.Account)
	 */
	public Account create(Account account) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}

	/* (�� Javadoc)
	 * @see com.plat4u.person.account.biz.service.AccountService#updatePassword(com.plat4u.person.account.biz.domain.Account)
	 */
	public Account updatePassword(Account account) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return null;
	}

}