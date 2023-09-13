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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import employee.database.model.PositionType;
import employee.database.service.PositionTypeService;
import employee.database.service.PositionTypeServiceUtil;
import employee.database.service.persistence.ElectroEmployeePersistence;
import employee.database.service.persistence.ElectroTypePersistence;
import employee.database.service.persistence.ElectronicsPersistence;
import employee.database.service.persistence.EmployeePersistence;
import employee.database.service.persistence.PositionTypePersistence;
import employee.database.service.persistence.PurchasePersistence;
import employee.database.service.persistence.PurchaseTypePersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the position type remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link employee.database.service.impl.PositionTypeServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employee.database.service.impl.PositionTypeServiceImpl
 * @generated
 */
public abstract class PositionTypeServiceBaseImpl
	extends BaseServiceImpl
	implements IdentifiableOSGiService, PositionTypeService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PositionTypeService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>PositionTypeServiceUtil</code>.
	 */

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
	 * Returns the electro employee remote service.
	 *
	 * @return the electro employee remote service
	 */
	public employee.database.service.ElectroEmployeeService
		getElectroEmployeeService() {

		return electroEmployeeService;
	}

	/**
	 * Sets the electro employee remote service.
	 *
	 * @param electroEmployeeService the electro employee remote service
	 */
	public void setElectroEmployeeService(
		employee.database.service.ElectroEmployeeService
			electroEmployeeService) {

		this.electroEmployeeService = electroEmployeeService;
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
	 * Returns the electronics remote service.
	 *
	 * @return the electronics remote service
	 */
	public employee.database.service.ElectronicsService
		getElectronicsService() {

		return electronicsService;
	}

	/**
	 * Sets the electronics remote service.
	 *
	 * @param electronicsService the electronics remote service
	 */
	public void setElectronicsService(
		employee.database.service.ElectronicsService electronicsService) {

		this.electronicsService = electronicsService;
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
	public employee.database.service.ElectroTypeLocalService
		getElectroTypeLocalService() {

		return electroTypeLocalService;
	}

	/**
	 * Sets the electro type local service.
	 *
	 * @param electroTypeLocalService the electro type local service
	 */
	public void setElectroTypeLocalService(
		employee.database.service.ElectroTypeLocalService
			electroTypeLocalService) {

		this.electroTypeLocalService = electroTypeLocalService;
	}

	/**
	 * Returns the electro type remote service.
	 *
	 * @return the electro type remote service
	 */
	public employee.database.service.ElectroTypeService
		getElectroTypeService() {

		return electroTypeService;
	}

	/**
	 * Sets the electro type remote service.
	 *
	 * @param electroTypeService the electro type remote service
	 */
	public void setElectroTypeService(
		employee.database.service.ElectroTypeService electroTypeService) {

		this.electroTypeService = electroTypeService;
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
	 * Returns the employee remote service.
	 *
	 * @return the employee remote service
	 */
	public employee.database.service.EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * Sets the employee remote service.
	 *
	 * @param employeeService the employee remote service
	 */
	public void setEmployeeService(
		employee.database.service.EmployeeService employeeService) {

		this.employeeService = employeeService;
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
	 * Returns the position type remote service.
	 *
	 * @return the position type remote service
	 */
	public PositionTypeService getPositionTypeService() {
		return positionTypeService;
	}

	/**
	 * Sets the position type remote service.
	 *
	 * @param positionTypeService the position type remote service
	 */
	public void setPositionTypeService(
		PositionTypeService positionTypeService) {

		this.positionTypeService = positionTypeService;
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
	 * Returns the purchase remote service.
	 *
	 * @return the purchase remote service
	 */
	public employee.database.service.PurchaseService getPurchaseService() {
		return purchaseService;
	}

	/**
	 * Sets the purchase remote service.
	 *
	 * @param purchaseService the purchase remote service
	 */
	public void setPurchaseService(
		employee.database.service.PurchaseService purchaseService) {

		this.purchaseService = purchaseService;
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
	 * Returns the purchase type remote service.
	 *
	 * @return the purchase type remote service
	 */
	public employee.database.service.PurchaseTypeService
		getPurchaseTypeService() {

		return purchaseTypeService;
	}

	/**
	 * Sets the purchase type remote service.
	 *
	 * @param purchaseTypeService the purchase type remote service
	 */
	public void setPurchaseTypeService(
		employee.database.service.PurchaseTypeService purchaseTypeService) {

		this.purchaseTypeService = purchaseTypeService;
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
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService
		getClassNameService() {

		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {

		this.classNameService = classNameService;
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
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {

		this.userService = userService;
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
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.asset.kernel.service.AssetEntryService
		getAssetEntryService() {

		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.asset.kernel.service.AssetEntryService assetEntryService) {

		this.assetEntryService = assetEntryService;
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
	 * Returns the asset tag remote service.
	 *
	 * @return the asset tag remote service
	 */
	public com.liferay.asset.kernel.service.AssetTagService
		getAssetTagService() {

		return assetTagService;
	}

	/**
	 * Sets the asset tag remote service.
	 *
	 * @param assetTagService the asset tag remote service
	 */
	public void setAssetTagService(
		com.liferay.asset.kernel.service.AssetTagService assetTagService) {

		this.assetTagService = assetTagService;
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
		_setServiceUtilService(positionTypeService);
	}

	public void destroy() {
		_setServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PositionTypeService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PositionType.class;
	}

	protected String getModelClassName() {
		return PositionType.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = positionTypePersistence.getDataSource();

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

	private void _setServiceUtilService(
		PositionTypeService positionTypeService) {

		try {
			Field field = PositionTypeServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, positionTypeService);
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

	@BeanReference(
		type = employee.database.service.ElectroEmployeeService.class
	)
	protected employee.database.service.ElectroEmployeeService
		electroEmployeeService;

	@BeanReference(type = ElectroEmployeePersistence.class)
	protected ElectroEmployeePersistence electroEmployeePersistence;

	@BeanReference(
		type = employee.database.service.ElectronicsLocalService.class
	)
	protected employee.database.service.ElectronicsLocalService
		electronicsLocalService;

	@BeanReference(type = employee.database.service.ElectronicsService.class)
	protected employee.database.service.ElectronicsService electronicsService;

	@BeanReference(type = ElectronicsPersistence.class)
	protected ElectronicsPersistence electronicsPersistence;

	@BeanReference(
		type = employee.database.service.ElectroTypeLocalService.class
	)
	protected employee.database.service.ElectroTypeLocalService
		electroTypeLocalService;

	@BeanReference(type = employee.database.service.ElectroTypeService.class)
	protected employee.database.service.ElectroTypeService electroTypeService;

	@BeanReference(type = ElectroTypePersistence.class)
	protected ElectroTypePersistence electroTypePersistence;

	@BeanReference(type = employee.database.service.EmployeeLocalService.class)
	protected employee.database.service.EmployeeLocalService
		employeeLocalService;

	@BeanReference(type = employee.database.service.EmployeeService.class)
	protected employee.database.service.EmployeeService employeeService;

	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;

	@BeanReference(
		type = employee.database.service.PositionTypeLocalService.class
	)
	protected employee.database.service.PositionTypeLocalService
		positionTypeLocalService;

	@BeanReference(type = PositionTypeService.class)
	protected PositionTypeService positionTypeService;

	@BeanReference(type = PositionTypePersistence.class)
	protected PositionTypePersistence positionTypePersistence;

	@BeanReference(type = employee.database.service.PurchaseLocalService.class)
	protected employee.database.service.PurchaseLocalService
		purchaseLocalService;

	@BeanReference(type = employee.database.service.PurchaseService.class)
	protected employee.database.service.PurchaseService purchaseService;

	@BeanReference(type = PurchasePersistence.class)
	protected PurchasePersistence purchasePersistence;

	@BeanReference(
		type = employee.database.service.PurchaseTypeLocalService.class
	)
	protected employee.database.service.PurchaseTypeLocalService
		purchaseTypeLocalService;

	@BeanReference(type = employee.database.service.PurchaseTypeService.class)
	protected employee.database.service.PurchaseTypeService purchaseTypeService;

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

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

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

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserService.class
	)
	protected com.liferay.portal.kernel.service.UserService userService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetEntryLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetEntryService.class
	)
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetTagLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetTagService.class
	)
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	@ServiceReference(type = AssetTagPersistence.class)
	protected AssetTagPersistence assetTagPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		PositionTypeServiceBaseImpl.class);

}