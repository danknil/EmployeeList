/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package employee.database.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import employee.database.model.ElectroEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ElectroEmployee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ElectroEmployeeCacheModel
	implements CacheModel<ElectroEmployee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ElectroEmployeeCacheModel)) {
			return false;
		}

		ElectroEmployeeCacheModel electroEmployeeCacheModel =
			(ElectroEmployeeCacheModel)object;

		if (employeeId == electroEmployeeCacheModel.employeeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", employeeId=");
		sb.append(employeeId);
		sb.append(", etype=");
		sb.append(etype);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ElectroEmployee toEntityModel() {
		ElectroEmployeeImpl electroEmployeeImpl = new ElectroEmployeeImpl();

		if (uuid == null) {
			electroEmployeeImpl.setUuid("");
		}
		else {
			electroEmployeeImpl.setUuid(uuid);
		}

		electroEmployeeImpl.setEmployeeId(employeeId);
		electroEmployeeImpl.setEtype(etype);

		electroEmployeeImpl.resetOriginalValues();

		return electroEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		employeeId = objectInput.readLong();

		etype = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(employeeId);

		objectOutput.writeLong(etype);
	}

	public String uuid;
	public long employeeId;
	public long etype;

}