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

package employee.database.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import employee.database.model.Purchase;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the purchase service. This utility wraps <code>employee.database.service.persistence.impl.PurchasePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurchasePersistence
 * @generated
 */
public class PurchaseUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Purchase purchase) {
		getPersistence().clearCache(purchase);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Purchase> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Purchase> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Purchase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Purchase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Purchase update(Purchase purchase) {
		return getPersistence().update(purchase);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Purchase update(
		Purchase purchase, ServiceContext serviceContext) {

		return getPersistence().update(purchase, serviceContext);
	}

	/**
	 * Returns all the purchases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching purchases
	 */
	public static List<Purchase> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the purchases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @return the range of matching purchases
	 */
	public static List<Purchase> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the purchases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purchases where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Purchase> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first purchase in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByUuid_First(
			String uuid, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first purchase in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByUuid_First(
		String uuid, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByUuid_Last(
			String uuid, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByUuid_Last(
		String uuid, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the purchases before and after the current purchase in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current purchase
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next purchase
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the purchases where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of purchases where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching purchases
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the purchases where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @return the matching purchases
	 */
	public static List<Purchase> findByelectronics(long electroId) {
		return getPersistence().findByelectronics(electroId);
	}

	/**
	 * Returns a range of all the purchases where electroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param electroId the electro ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @return the range of matching purchases
	 */
	public static List<Purchase> findByelectronics(
		long electroId, int start, int end) {

		return getPersistence().findByelectronics(electroId, start, end);
	}

	/**
	 * Returns an ordered range of all the purchases where electroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param electroId the electro ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByelectronics(
		long electroId, int start, int end,
		OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findByelectronics(
			electroId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purchases where electroId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param electroId the electro ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByelectronics(
		long electroId, int start, int end,
		OrderByComparator<Purchase> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByelectronics(
			electroId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first purchase in the ordered set where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByelectronics_First(
			long electroId, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByelectronics_First(
			electroId, orderByComparator);
	}

	/**
	 * Returns the first purchase in the ordered set where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByelectronics_First(
		long electroId, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByelectronics_First(
			electroId, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByelectronics_Last(
			long electroId, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByelectronics_Last(
			electroId, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByelectronics_Last(
		long electroId, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByelectronics_Last(
			electroId, orderByComparator);
	}

	/**
	 * Returns the purchases before and after the current purchase in the ordered set where electroId = &#63;.
	 *
	 * @param id the primary key of the current purchase
	 * @param electroId the electro ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next purchase
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase[] findByelectronics_PrevAndNext(
			long id, long electroId,
			OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByelectronics_PrevAndNext(
			id, electroId, orderByComparator);
	}

	/**
	 * Removes all the purchases where electroId = &#63; from the database.
	 *
	 * @param electroId the electro ID
	 */
	public static void removeByelectronics(long electroId) {
		getPersistence().removeByelectronics(electroId);
	}

	/**
	 * Returns the number of purchases where electroId = &#63;.
	 *
	 * @param electroId the electro ID
	 * @return the number of matching purchases
	 */
	public static int countByelectronics(long electroId) {
		return getPersistence().countByelectronics(electroId);
	}

	/**
	 * Returns all the purchases where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the matching purchases
	 */
	public static List<Purchase> findByemployee(long employeeId) {
		return getPersistence().findByemployee(employeeId);
	}

	/**
	 * Returns a range of all the purchases where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @return the range of matching purchases
	 */
	public static List<Purchase> findByemployee(
		long employeeId, int start, int end) {

		return getPersistence().findByemployee(employeeId, start, end);
	}

	/**
	 * Returns an ordered range of all the purchases where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByemployee(
		long employeeId, int start, int end,
		OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findByemployee(
			employeeId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purchases where employeeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param employeeId the employee ID
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findByemployee(
		long employeeId, int start, int end,
		OrderByComparator<Purchase> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByemployee(
			employeeId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first purchase in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByemployee_First(
			long employeeId, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByemployee_First(
			employeeId, orderByComparator);
	}

	/**
	 * Returns the first purchase in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByemployee_First(
		long employeeId, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByemployee_First(
			employeeId, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findByemployee_Last(
			long employeeId, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByemployee_Last(
			employeeId, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchByemployee_Last(
		long employeeId, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchByemployee_Last(
			employeeId, orderByComparator);
	}

	/**
	 * Returns the purchases before and after the current purchase in the ordered set where employeeId = &#63;.
	 *
	 * @param id the primary key of the current purchase
	 * @param employeeId the employee ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next purchase
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase[] findByemployee_PrevAndNext(
			long id, long employeeId,
			OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByemployee_PrevAndNext(
			id, employeeId, orderByComparator);
	}

	/**
	 * Removes all the purchases where employeeId = &#63; from the database.
	 *
	 * @param employeeId the employee ID
	 */
	public static void removeByemployee(long employeeId) {
		getPersistence().removeByemployee(employeeId);
	}

	/**
	 * Returns the number of purchases where employeeId = &#63;.
	 *
	 * @param employeeId the employee ID
	 * @return the number of matching purchases
	 */
	public static int countByemployee(long employeeId) {
		return getPersistence().countByemployee(employeeId);
	}

	/**
	 * Returns all the purchases where type = &#63;.
	 *
	 * @param type the type
	 * @return the matching purchases
	 */
	public static List<Purchase> findBypurchaseType(long type) {
		return getPersistence().findBypurchaseType(type);
	}

	/**
	 * Returns a range of all the purchases where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @return the range of matching purchases
	 */
	public static List<Purchase> findBypurchaseType(
		long type, int start, int end) {

		return getPersistence().findBypurchaseType(type, start, end);
	}

	/**
	 * Returns an ordered range of all the purchases where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findBypurchaseType(
		long type, int start, int end,
		OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findBypurchaseType(
			type, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purchases where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching purchases
	 */
	public static List<Purchase> findBypurchaseType(
		long type, int start, int end,
		OrderByComparator<Purchase> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBypurchaseType(
			type, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first purchase in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findBypurchaseType_First(
			long type, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findBypurchaseType_First(
			type, orderByComparator);
	}

	/**
	 * Returns the first purchase in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchBypurchaseType_First(
		long type, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchBypurchaseType_First(
			type, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase
	 * @throws NoSuchPurchaseException if a matching purchase could not be found
	 */
	public static Purchase findBypurchaseType_Last(
			long type, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findBypurchaseType_Last(
			type, orderByComparator);
	}

	/**
	 * Returns the last purchase in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching purchase, or <code>null</code> if a matching purchase could not be found
	 */
	public static Purchase fetchBypurchaseType_Last(
		long type, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().fetchBypurchaseType_Last(
			type, orderByComparator);
	}

	/**
	 * Returns the purchases before and after the current purchase in the ordered set where type = &#63;.
	 *
	 * @param id the primary key of the current purchase
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next purchase
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase[] findBypurchaseType_PrevAndNext(
			long id, long type, OrderByComparator<Purchase> orderByComparator)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findBypurchaseType_PrevAndNext(
			id, type, orderByComparator);
	}

	/**
	 * Removes all the purchases where type = &#63; from the database.
	 *
	 * @param type the type
	 */
	public static void removeBypurchaseType(long type) {
		getPersistence().removeBypurchaseType(type);
	}

	/**
	 * Returns the number of purchases where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching purchases
	 */
	public static int countBypurchaseType(long type) {
		return getPersistence().countBypurchaseType(type);
	}

	/**
	 * Caches the purchase in the entity cache if it is enabled.
	 *
	 * @param purchase the purchase
	 */
	public static void cacheResult(Purchase purchase) {
		getPersistence().cacheResult(purchase);
	}

	/**
	 * Caches the purchases in the entity cache if it is enabled.
	 *
	 * @param purchases the purchases
	 */
	public static void cacheResult(List<Purchase> purchases) {
		getPersistence().cacheResult(purchases);
	}

	/**
	 * Creates a new purchase with the primary key. Does not add the purchase to the database.
	 *
	 * @param id the primary key for the new purchase
	 * @return the new purchase
	 */
	public static Purchase create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the purchase with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the purchase
	 * @return the purchase that was removed
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase remove(long id)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().remove(id);
	}

	public static Purchase updateImpl(Purchase purchase) {
		return getPersistence().updateImpl(purchase);
	}

	/**
	 * Returns the purchase with the primary key or throws a <code>NoSuchPurchaseException</code> if it could not be found.
	 *
	 * @param id the primary key of the purchase
	 * @return the purchase
	 * @throws NoSuchPurchaseException if a purchase with the primary key could not be found
	 */
	public static Purchase findByPrimaryKey(long id)
		throws employee.database.exception.NoSuchPurchaseException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the purchase with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the purchase
	 * @return the purchase, or <code>null</code> if a purchase with the primary key could not be found
	 */
	public static Purchase fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the purchases.
	 *
	 * @return the purchases
	 */
	public static List<Purchase> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the purchases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @return the range of purchases
	 */
	public static List<Purchase> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the purchases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of purchases
	 */
	public static List<Purchase> findAll(
		int start, int end, OrderByComparator<Purchase> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the purchases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurchaseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purchases
	 * @param end the upper bound of the range of purchases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of purchases
	 */
	public static List<Purchase> findAll(
		int start, int end, OrderByComparator<Purchase> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the purchases from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of purchases.
	 *
	 * @return the number of purchases
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PurchasePersistence getPersistence() {
		return _persistence;
	}

	private static volatile PurchasePersistence _persistence;

}