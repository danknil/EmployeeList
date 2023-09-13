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

package employee.database.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link employee.database.service.http.ElectroEmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ElectroEmployeeSoap implements Serializable {

	public static ElectroEmployeeSoap toSoapModel(ElectroEmployee model) {
		ElectroEmployeeSoap soapModel = new ElectroEmployeeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setEmployeeId(model.getEmployeeId());
		soapModel.setEtype(model.getEtype());

		return soapModel;
	}

	public static ElectroEmployeeSoap[] toSoapModels(ElectroEmployee[] models) {
		ElectroEmployeeSoap[] soapModels =
			new ElectroEmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ElectroEmployeeSoap[][] toSoapModels(
		ElectroEmployee[][] models) {

		ElectroEmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ElectroEmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ElectroEmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ElectroEmployeeSoap[] toSoapModels(
		List<ElectroEmployee> models) {

		List<ElectroEmployeeSoap> soapModels =
			new ArrayList<ElectroEmployeeSoap>(models.size());

		for (ElectroEmployee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ElectroEmployeeSoap[soapModels.size()]);
	}

	public ElectroEmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _employeeId;
	}

	public void setPrimaryKey(long pk) {
		setEmployeeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	public long getEtype() {
		return _etype;
	}

	public void setEtype(long etype) {
		_etype = etype;
	}

	private String _uuid;
	private long _employeeId;
	private long _etype;

}