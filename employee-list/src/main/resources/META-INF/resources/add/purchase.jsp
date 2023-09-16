<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="../init.jsp" %>

<liferay-portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="../view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="addPurchase" var="addPurchaseURL"/>

<aui:form action="<%= addPurchaseURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="electronic id"/>
        <aui:input name="employee id"/>
        <liferay-ui:input-date name="purchase date"/>
        <aui:input name="type"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>
