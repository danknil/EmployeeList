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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PositionType service. Represents a row in the &quot;EmployeeList_PositionType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>employee.database.model.impl.PositionTypeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>employee.database.model.impl.PositionTypeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionType
 * @generated
 */
@ProviderType
public interface PositionTypeModel extends BaseModel<PositionType> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a position type model instance should use the {@link PositionType} interface instead.
	 */

	/**
	 * Returns the primary key of this position type.
	 *
	 * @return the primary key of this position type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this position type.
	 *
	 * @param primaryKey the primary key of this position type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this position type.
	 *
	 * @return the uuid of this position type
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this position type.
	 *
	 * @param uuid the uuid of this position type
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this position type.
	 *
	 * @return the ID of this position type
	 */
	public long getId();

	/**
	 * Sets the ID of this position type.
	 *
	 * @param id the ID of this position type
	 */
	public void setId(long id);

	/**
	 * Returns the name of this position type.
	 *
	 * @return the name of this position type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this position type.
	 *
	 * @param name the name of this position type
	 */
	public void setName(String name);

}