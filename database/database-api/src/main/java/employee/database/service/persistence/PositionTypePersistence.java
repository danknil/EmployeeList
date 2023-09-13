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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import employee.database.exception.NoSuchPositionTypeException;
import employee.database.model.PositionType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the position type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionTypeUtil
 * @generated
 */
@ProviderType
public interface PositionTypePersistence extends BasePersistence<PositionType> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PositionTypeUtil} to access the position type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the position types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching position types
	 */
	public java.util.List<PositionType> findByUuid(String uuid);

	/**
	 * Returns a range of all the position types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @return the range of matching position types
	 */
	public java.util.List<PositionType> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the position types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching position types
	 */
	public java.util.List<PositionType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator);

	/**
	 * Returns an ordered range of all the position types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching position types
	 */
	public java.util.List<PositionType> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first position type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching position type
	 * @throws NoSuchPositionTypeException if a matching position type could not be found
	 */
	public PositionType findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PositionType>
				orderByComparator)
		throws NoSuchPositionTypeException;

	/**
	 * Returns the first position type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching position type, or <code>null</code> if a matching position type could not be found
	 */
	public PositionType fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator);

	/**
	 * Returns the last position type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching position type
	 * @throws NoSuchPositionTypeException if a matching position type could not be found
	 */
	public PositionType findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PositionType>
				orderByComparator)
		throws NoSuchPositionTypeException;

	/**
	 * Returns the last position type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching position type, or <code>null</code> if a matching position type could not be found
	 */
	public PositionType fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator);

	/**
	 * Returns the position types before and after the current position type in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current position type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next position type
	 * @throws NoSuchPositionTypeException if a position type with the primary key could not be found
	 */
	public PositionType[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<PositionType>
				orderByComparator)
		throws NoSuchPositionTypeException;

	/**
	 * Removes all the position types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of position types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching position types
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the position type in the entity cache if it is enabled.
	 *
	 * @param positionType the position type
	 */
	public void cacheResult(PositionType positionType);

	/**
	 * Caches the position types in the entity cache if it is enabled.
	 *
	 * @param positionTypes the position types
	 */
	public void cacheResult(java.util.List<PositionType> positionTypes);

	/**
	 * Creates a new position type with the primary key. Does not add the position type to the database.
	 *
	 * @param id the primary key for the new position type
	 * @return the new position type
	 */
	public PositionType create(long id);

	/**
	 * Removes the position type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the position type
	 * @return the position type that was removed
	 * @throws NoSuchPositionTypeException if a position type with the primary key could not be found
	 */
	public PositionType remove(long id) throws NoSuchPositionTypeException;

	public PositionType updateImpl(PositionType positionType);

	/**
	 * Returns the position type with the primary key or throws a <code>NoSuchPositionTypeException</code> if it could not be found.
	 *
	 * @param id the primary key of the position type
	 * @return the position type
	 * @throws NoSuchPositionTypeException if a position type with the primary key could not be found
	 */
	public PositionType findByPrimaryKey(long id)
		throws NoSuchPositionTypeException;

	/**
	 * Returns the position type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the position type
	 * @return the position type, or <code>null</code> if a position type with the primary key could not be found
	 */
	public PositionType fetchByPrimaryKey(long id);

	/**
	 * Returns all the position types.
	 *
	 * @return the position types
	 */
	public java.util.List<PositionType> findAll();

	/**
	 * Returns a range of all the position types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @return the range of position types
	 */
	public java.util.List<PositionType> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the position types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of position types
	 */
	public java.util.List<PositionType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator);

	/**
	 * Returns an ordered range of all the position types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of position types
	 */
	public java.util.List<PositionType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PositionType>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the position types from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of position types.
	 *
	 * @return the number of position types
	 */
	public int countAll();

}