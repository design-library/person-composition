/**
  * Copyright 2017 plat4u.com
 * 
 * This file is part of ghost.
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
package com.plat4u.ghost.common.biz.value;

import java.io.Serializable;

/**
 * MailAddress
 *
 * @author plat4u.com
 * @version 1.0
 */
public class MailAddress implements Serializable, Id {

	private static final long serialVersionUID = 1L;
	
	private String mailAddress;
	
	public MailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
	public String account() {
		if (mailAddress == null || "".equals(mailAddress)) {
			return mailAddress;
		} else {
			return mailAddress.substring(0, mailAddress.charAt('@'));
		}
	}
	
	public String domain() {
		if (mailAddress == null || "".equals(mailAddress)) {
			return mailAddress;
		} else {
			return mailAddress.substring(mailAddress.charAt('@') + 1, mailAddress.length());
		}
	}
	
	@Override
	public String toString() {
		return mailAddress;
	}

}
