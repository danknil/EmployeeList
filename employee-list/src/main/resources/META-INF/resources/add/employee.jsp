<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="../init.jsp" %>

<liferay-portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="../view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="addEmployee" var="addEmployeeURL"/>

<aui:form action="<%= addEmployeeURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Lastname"/>
        <aui:input name="Firstname"/>
        <aui:input name="Patronymic"/>
        <liferay-ui:input-date name="Birthdate"/>
        <aui:input name="position"/>
        <aui:input name="gender"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>