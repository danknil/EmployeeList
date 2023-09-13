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

package employee.database.service.base;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetTagPersistence;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import employee.database.model.ElectroType;
import employee.database.service.ElectroTypeLocalService;
import employee.database.service.ElectroTypeLocalServiceUtil;
import employee.database.service.persistence.ElectroEmployeePersistence;
import employee.database.service.persistence.ElectroTypePersistence;
import employee.database.service.persistence.ElectronicsPersistence;
import employee.database.service.persistence.EmployeePersistence;
import employee.database.service.persistence.PositionTypePersistence;
import employee.database.service.persistence.PurchasePersistence;
import employee.database.service.persistence.PurchaseTypePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the electro type local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link employee.database.service.impl.ElectroTypeLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employee.database.service.impl.ElectroTypeLocalServiceImpl
 * @generated
 */
public abstract class ElectroTypeLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements ElectroTypeLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ElectroTypeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ElectroTypeLocalServiceUtil</code>.
	 */

	/**
	 * Adds the electro type to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ElectroType addElectroType(ElectroType electroType) {
		electroType.setNew(true);

		return electroTypePersistence.update(electroType);
	}

	/**
	 * Creates a new electro type with the primary key. Does not add the electro type to the database.
	 *
	 * @param id the primary key for the new electro type
	 * @return the new electro type
	 */
	@Override
	@Transactional(enabled = false)
	public ElectroType createElectroType(long id) {
		return electroTypePersistence.create(id);
	}

	/**
	 * Deletes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the electro type
	 * @return the electro type that was removed
	 * @throws PortalException if a electro type with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ElectroType deleteElectroType(long id) throws PortalException {
		return electroTypePersistence.remove(id);
	}

	/**
	 * Deletes the electro type from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public ElectroType deleteElectroType(ElectroType electroType) {
		return electroTypePersistence.remove(electroType);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			ElectroType.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return electroTypePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.database.model.impl.ElectroTypeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return electroTypePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.database.model.impl.ElectroTypeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return electroTypePersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return electroTypePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return electroTypePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public ElectroType fetchElectroType(long id) {
		return electroTypePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the electro type with the primary key.
	 *
	 * @param id the primary key of the electro type
	 * @return the electro type
	 * @throws PortalException if a electro type with the primary key could not be found
	 */
	@Override
	public ElectroType getElectroType(long id) throws PortalException {
		return electroTypePersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(electroTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ElectroType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			electroTypeLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(ElectroType.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(electroTypeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(ElectroType.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return electroTypePersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return electroTypeLocalService.deleteElectroType(
			(ElectroType)persistedModel);
	}

	public BasePersistence<ElectroType> getBasePersistence() {
		return electroTypePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return electroTypePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the electro types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>employee.database.model.impl.ElectroTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electro types
	 * @param end the upper bound of the range of electro types (not inclusive)
	 * @return the range of electro types
	 */
	@Override
	public List<ElectroType> getElectroTypes(int start, int end) {
		return electroTypePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of electro types.
	 *
	 * @return the number of electro types
	 */
	@Override
	public int getElectroTypesCount() {
		return electroTypePersistence.countAll();
	}

	/**
	 * Updates the electro type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ElectroType updateElectroType(ElectroType electroType) {
		return electroTypePersistence.update(electroType);
	}

	/**
	 * Returns the electro employee local service.
	 *
	 * @return the electro employee local service
	 */
	public employee.database.service.ElectroEmployeeLocalService
		getElectroEmployeeLocalService() {

		return electroEmployeeLocalService;
	}

	/**
	 * Sets the electro employee local service.
	 *
	 * @param electroEmployeeLocalService the electro employee local service
	 */
	public void setElectroEmployeeLocalService(
		employee.database.service.ElectroEmployeeLocalService
			electroEmployeeLocalService) {

		this.electroEmployeeLocalService = electroEmployeeLocalService;
	}

	/**
	 * Returns the electro employee persistence.
	 *
	 * @return the electro employee persistence
	 */
	public ElectroEmployeePersistence getElectroEmployeePersistence() {
		return electroEmployeePersistence;
	}

	/**
	 * Sets the electro employee persistence.
	 *
	 * @param electroEmployeePersistence the electro employee persistence
	 */
	public void setElectroEmployeePersistence(
		ElectroEmployeePersistence electroEmployeePersistence) {

		this.electroEmployeePersistence = electroEmployeePersistence;
	}

	/**
	 * Returns the electronics local service.
	 *
	 * @return the electronics local service
	 */
	public employee.database.service.ElectronicsLocalService
		getElectronicsLocalService() {

		return electronicsLocalService;
	}

	/**
	 * Sets the electronics local service.
	 *
	 * @param electronicsLocalService the electronics local service
	 */
	public void setElectronicsLocalService(
		employee.database.service.ElectronicsLocalService
			electronicsLocalService) {

		this.electronicsLocalService = electronicsLocalService;
	}

	/**
	 * Returns the electronics persistence.
	 *
	 * @return the electronics persistence
	 */
	public ElectronicsPersistence getElectronicsPersistence() {
		return electronicsPersistence;
	}

	/**
	 * Sets the electronics persistence.
	 *
	 * @param electronicsPersistence the electronics persistence
	 */
	public void setElectronicsPersistence(
		ElectronicsPersistence electronicsPersistence) {

		this.electronicsPersistence = electronicsPersistence;
	}

	/**
	 * Returns the electro type local service.
	 *
	 * @return the electro type local service
	 */
	public ElectroTypeLocalService getElectroTypeLocalService() {
		return electroTypeLocalService;
	}

	/**
	 * Sets the electro type local service.
	 *
	 * @param electroTypeLocalService the electro type local service
	 */
	public void setElectroTypeLocalService(
		ElectroTypeLocalService electroTypeLocalService) {

		this.electroTypeLocalService = electroTypeLocalService;
	}

	/**
	 * Returns the electro type persistence.
	 *
	 * @return the electro type persistence
	 */
	public ElectroTypePersistence getElectroTypePersistence() {
		return electroTypePersistence;
	}

	/**
	 * Sets the electro type persistence.
	 *
	 * @param electroTypePersistence the electro type persistence
	 */
	public void setElectroTypePersistence(
		ElectroTypePersistence electroTypePersistence) {

		this.electroTypePersistence = electroTypePersistence;
	}

	/**
	 * Returns the employee local service.
	 *
	 * @return the employee local service
	 */
	public employee.database.service.EmployeeLocalService
		getEmployeeLocalService() {

		return employeeLocalService;
	}

	/**
	 * Sets the employee local service.
	 *
	 * @param employeeLocalService the employee local service
	 */
	public void setEmployeeLocalService(
		employee.database.service.EmployeeLocalService employeeLocalService) {

		this.employeeLocalService = employeeLocalService;
	}

	/**
	 * Returns the employee persistence.
	 *
	 * @return the employee persistence
	 */
	public EmployeePersistence getEmployeePersistence() {
		return employeePersistence;
	}

	/**
	 * Sets the employee persistence.
	 *
	 * @param employeePersistence the employee persistence
	 */
	public void setEmployeePersistence(
		EmployeePersistence employeePersistence) {

		this.employeePersistence = employeePersistence;
	}

	/**
	 * Returns the position type local service.
	 *
	 * @return the position type local service
	 */
	public employee.database.service.PositionTypeLocalService
		getPositionTypeLocalService() {

		return positionTypeLocalService;
	}

	/**
	 * Sets the position type local service.
	 *
	 * @param positionTypeLocalService the position type local service
	 */
	public void setPositionTypeLocalService(
		employee.database.service.PositionTypeLocalService
			positionTypeLocalService) {

		this.positionTypeLocalService = positionTypeLocalService;
	}

	/**
	 * Returns the position type persistence.
	 *
	 * @return the position type persistence
	 */
	public PositionTypePersistence getPositionTypePersistence() {
		return positionTypePersistence;
	}

	/**
	 * Sets the position type persistence.
	 *
	 * @param positionTypePersistence the position type persistence
	 */
	public void setPositionTypePersistence(
		PositionTypePersistence positionTypePersistence) {

		this.positionTypePersistence = positionTypePersistence;
	}

	/**
	 * Returns the purchase local service.
	 *
	 * @return the purchase local service
	 */
	public employee.database.service.PurchaseLocalService
		getPurchaseLocalService() {

		return purchaseLocalService;
	}

	/**
	 * Sets the purchase local service.
	 *
	 * @param purchaseLocalService the purchase local service
	 */
	public void setPurchaseLocalService(
		employee.database.service.PurchaseLocalService purchaseLocalService) {

		this.purchaseLocalService = purchaseLocalService;
	}

	/**
	 * Returns the purchase persistence.
	 *
	 * @return the purchase persistence
	 */
	public PurchasePersistence getPurchasePersistence() {
		return purchasePersistence;
	}

	/**
	 * Sets the purchase persistence.
	 *
	 * @param purchasePersistence the purchase persistence
	 */
	public void setPurchasePersistence(
		PurchasePersistence purchasePersistence) {

		this.purchasePersistence = purchasePersistence;
	}

	/**
	 * Returns the purchase type local service.
	 *
	 * @return the purchase type local service
	 */
	public employee.database.service.PurchaseTypeLocalService
		getPurchaseTypeLocalService() {

		return purchaseTypeLocalService;
	}

	/**
	 * Sets the purchase type local service.
	 *
	 * @param purchaseTypeLocalService the purchase type local service
	 */
	public void setPurchaseTypeLocalService(
		employee.database.service.PurchaseTypeLocalService
			purchaseTypeLocalService) {

		this.purchaseTypeLocalService = purchaseTypeLocalService;
	}

	/**
	 * Returns the purchase type persistence.
	 *
	 * @return the purchase type persistence
	 */
	public PurchaseTypePersistence getPurchaseTypePersistence() {
		return purchaseTypePersistence;
	}

	/**
	 * Sets the purchase type persistence.
	 *
	 * @param purchaseTypePersistence the purchase type persistence
	 */
	public void setPurchaseTypePersistence(
		PurchaseTypePersistence purchaseTypePersistence) {

		this.purchaseTypePersistence = purchaseTypePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService
		getAssetEntryLocalService() {

		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService
			assetEntryLocalService) {

		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {

		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset tag local service.
	 *
	 * @return the asset tag local service
	 */
	public com.liferay.asset.kernel.service.AssetTagLocalService
		getAssetTagLocalService() {

		return assetTagLocalService;
	}

	/**
	 * Sets the asset tag local service.
	 *
	 * @param assetTagLocalService the asset tag local service
	 */
	public void setAssetTagLocalService(
		com.liferay.asset.kernel.service.AssetTagLocalService
			assetTagLocalService) {

		this.assetTagLocalService = assetTagLocalService;
	}

	/**
	 * Returns the asset tag persistence.
	 *
	 * @return the asset tag persistence
	 */
	public AssetTagPersistence getAssetTagPersistence() {
		return assetTagPersistence;
	}

	/**
	 * Sets the asset tag persistence.
	 *
	 * @param assetTagPersistence the asset tag persistence
	 */
	public void setAssetTagPersistence(
		AssetTagPersistence assetTagPersistence) {

		this.assetTagPersistence = assetTagPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"employee.database.model.ElectroType", electroTypeLocalService);

		_setLocalServiceUtilService(electroTypeLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"employee.database.model.ElectroType");

		_setLocalServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ElectroTypeLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ElectroType.class;
	}

	protected String getModelClassName() {
		return ElectroType.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = electroTypePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		ElectroTypeLocalService electroTypeLocalService) {

		try {
			Field field = ElectroTypeLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, electroTypeLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(
		type = employee.database.service.ElectroEmployeeLocalService.class
	)
	protected employee.database.service.ElectroEmployeeLocalService
		electroEmployeeLocalService;

	@BeanReference(type = ElectroEmployeePersistence.class)
	protected ElectroEmployeePersistence electroEmployeePersistence;

	@BeanReference(
		type = employee.database.service.ElectronicsLocalService.class
	)
	protected employee.database.service.ElectronicsLocalService
		electronicsLocalService;

	@BeanReference(type = ElectronicsPersistence.class)
	protected ElectronicsPersistence electronicsPersistence;

	@BeanReference(type = ElectroTypeLocalService.class)
	protected ElectroTypeLocalService electroTypeLocalService;

	@BeanReference(type = ElectroTypePersistence.class)
	protected ElectroTypePersistence electroTypePersistence;

	@BeanReference(type = employee.database.service.EmployeeLocalService.class)
	protected employee.database.service.EmployeeLocalService
		employeeLocalService;

	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;

	@BeanReference(
		type = employee.database.service.PositionTypeLocalService.class
	)
	protected employee.database.service.PositionTypeLocalService
		positionTypeLocalService;

	@BeanReference(type = PositionTypePersistence.class)
	protected PositionTypePersistence positionTypePersistence;

	@BeanReference(type = employee.database.service.PurchaseLocalService.class)
	protected employee.database.service.PurchaseLocalService
		purchaseLocalService;

	@BeanReference(type = PurchasePersistence.class)
	protected PurchasePersistence purchasePersistence;

	@BeanReference(
		type = employee.database.service.PurchaseTypeLocalService.class
	)
	protected employee.database.service.PurchaseTypeLocalService
		purchaseTypeLocalService;

	@BeanReference(type = PurchaseTypePersistence.class)
	protected PurchaseTypePersistence purchaseTypePersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetEntryLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetTagLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@ServiceReference(type = AssetTagPersistence.class)
	protected AssetTagPersistence assetTagPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		ElectroTypeLocalServiceBaseImpl.class);

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}