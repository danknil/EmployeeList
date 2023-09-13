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

package employee.database.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import employee.database.exception.NoSuchPositionTypeException;
import employee.database.model.PositionType;
import employee.database.service.PositionTypeLocalServiceUtil;
import employee.database.service.persistence.PositionTypePersistence;
import employee.database.service.persistence.PositionTypeUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class PositionTypePersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "employee.database.service"));

	@Before
	public void setUp() {
		_persistence = PositionTypeUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<PositionType> iterator = _positionTypes.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PositionType positionType = _persistence.create(pk);

		Assert.assertNotNull(positionType);

		Assert.assertEquals(positionType.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		PositionType newPositionType = addPositionType();

		_persistence.remove(newPositionType);

		PositionType existingPositionType = _persistence.fetchByPrimaryKey(
			newPositionType.getPrimaryKey());

		Assert.assertNull(existingPositionType);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addPositionType();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PositionType newPositionType = _persistence.create(pk);

		newPositionType.setUuid(RandomTestUtil.randomString());

		newPositionType.setName(RandomTestUtil.randomString());

		_positionTypes.add(_persistence.update(newPositionType));

		PositionType existingPositionType = _persistence.findByPrimaryKey(
			newPositionType.getPrimaryKey());

		Assert.assertEquals(
			existingPositionType.getUuid(), newPositionType.getUuid());
		Assert.assertEquals(
			existingPositionType.getId(), newPositionType.getId());
		Assert.assertEquals(
			existingPositionType.getName(), newPositionType.getName());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		PositionType newPositionType = addPositionType();

		PositionType existingPositionType = _persistence.findByPrimaryKey(
			newPositionType.getPrimaryKey());

		Assert.assertEquals(existingPositionType, newPositionType);
	}

	@Test(expected = NoSuchPositionTypeException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<PositionType> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"EmployeeList_PositionType", "uuid", true, "id", true, "name",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		PositionType newPositionType = addPositionType();

		PositionType existingPositionType = _persistence.fetchByPrimaryKey(
			newPositionType.getPrimaryKey());

		Assert.assertEquals(existingPositionType, newPositionType);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PositionType missingPositionType = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingPositionType);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		PositionType newPositionType1 = addPositionType();
		PositionType newPositionType2 = addPositionType();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositionType1.getPrimaryKey());
		primaryKeys.add(newPositionType2.getPrimaryKey());

		Map<Serializable, PositionType> positionTypes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, positionTypes.size());
		Assert.assertEquals(
			newPositionType1,
			positionTypes.get(newPositionType1.getPrimaryKey()));
		Assert.assertEquals(
			newPositionType2,
			positionTypes.get(newPositionType2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, PositionType> positionTypes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(positionTypes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		PositionType newPositionType = addPositionType();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositionType.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, PositionType> positionTypes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, positionTypes.size());
		Assert.assertEquals(
			newPositionType,
			positionTypes.get(newPositionType.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, PositionType> positionTypes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(positionTypes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		PositionType newPositionType = addPositionType();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositionType.getPrimaryKey());

		Map<Serializable, PositionType> positionTypes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, positionTypes.size());
		Assert.assertEquals(
			newPositionType,
			positionTypes.get(newPositionType.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			PositionTypeLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<PositionType>() {

				@Override
				public void performAction(PositionType positionType) {
					Assert.assertNotNull(positionType);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		PositionType newPositionType = addPositionType();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PositionType.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("id", newPositionType.getId()));

		List<PositionType> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		PositionType existingPositionType = result.get(0);

		Assert.assertEquals(existingPositionType, newPositionType);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PositionType.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("id", RandomTestUtil.nextLong()));

		List<PositionType> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		PositionType newPositionType = addPositionType();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PositionType.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("id"));

		Object newId = newPositionType.getId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("id", new Object[] {newId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingId = result.get(0);

		Assert.assertEquals(existingId, newId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			PositionType.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"id", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected PositionType addPositionType() throws Exception {
		long pk = RandomTestUtil.nextLong();

		PositionType positionType = _persistence.create(pk);

		positionType.setUuid(RandomTestUtil.randomString());

		positionType.setName(RandomTestUtil.randomString());

		_positionTypes.add(_persistence.update(positionType));

		return positionType;
	}

	private List<PositionType> _positionTypes = new ArrayList<PositionType>();
	private PositionTypePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}