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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Purchase}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Purchase
 * @generated
 */
public class PurchaseWrapper
	extends BaseModelWrapper<Purchase>
	implements ModelWrapper<Purchase>, Purchase {

	public PurchaseWrapper(Purchase purchase) {
		super(purchase);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("electroId", getElectroId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("purchaseDate", getPurchaseDate());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long electroId = (Long)attributes.get("electroId");

		if (electroId != null) {
			setElectroId(electroId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Date purchaseDate = (Date)attributes.get("purchaseDate");

		if (purchaseDate != null) {
			setPurchaseDate(purchaseDate);
		}

		Long type = (Long)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	 * Returns the electro ID of this purchase.
	 *
	 * @return the electro ID of this purchase
	 */
	@Override
	public long getElectroId() {
		return model.getElectroId();
	}

	/**
	 * Returns the employee ID of this purchase.
	 *
	 * @return the employee ID of this purchase
	 */
	@Override
	public long getEmployeeId() {
		return model.getEmployeeId();
	}

	/**
	 * Returns the ID of this purchase.
	 *
	 * @return the ID of this purchase
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this purchase.
	 *
	 * @return the primary key of this purchase
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purchase date of this purchase.
	 *
	 * @return the purchase date of this purchase
	 */
	@Override
	public Date getPurchaseDate() {
		return model.getPurchaseDate();
	}

	/**
	 * Returns the type of this purchase.
	 *
	 * @return the type of this purchase
	 */
	@Override
	public long getType() {
		return model.getType();
	}

	/**
	 * Returns the uuid of this purchase.
	 *
	 * @return the uuid of this purchase
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the electro ID of this purchase.
	 *
	 * @param electroId the electro ID of this purchase
	 */
	@Override
	public void setElectroId(long electroId) {
		model.setElectroId(electroId);
	}

	/**
	 * Sets the employee ID of this purchase.
	 *
	 * @param employeeId the employee ID of this purchase
	 */
	@Override
	public void setEmployeeId(long employeeId) {
		model.setEmployeeId(employeeId);
	}

	/**
	 * Sets the ID of this purchase.
	 *
	 * @param id the ID of this purchase
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this purchase.
	 *
	 * @param primaryKey the primary key of this purchase
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purchase date of this purchase.
	 *
	 * @param purchaseDate the purchase date of this purchase
	 */
	@Override
	public void setPurchaseDate(Date purchaseDate) {
		model.setPurchaseDate(purchaseDate);
	}

	/**
	 * Sets the type of this purchase.
	 *
	 * @param type the type of this purchase
	 */
	@Override
	public void setType(long type) {
		model.setType(type);
	}

	/**
	 * Sets the uuid of this purchase.
	 *
	 * @param uuid the uuid of this purchase
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PurchaseWrapper wrap(Purchase purchase) {
		return new PurchaseWrapper(purchase);
	}

}