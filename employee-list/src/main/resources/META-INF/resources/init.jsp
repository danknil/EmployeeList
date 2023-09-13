<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    EmployeeLocalService employeeService = (EmployeeLocalService) renderRequest.getAttribute("employeeService");
    ElectronicsLocalService electronicsService = (ElectronicsLocalService) renderRequest.getAttribute("electronicsService");
    PurchaseLocalService purchaseService = (PurchaseLocalService) renderRequest.getAttribute("purchaseService");

    PositionTypeLocalService positionTypeService = (PositionTypeLocalService) renderRequest.getAttribute("positionTypeService");
    ElectroTypeLocalService electroTypeService = (ElectroTypeLocalService) renderRequest.getAttribute("electroTypeService");
    PurchaseTypeLocalService purchaseTypeService = (PurchaseTypeLocalService) renderRequest.getAttribute("purchaseTypeService");
%>