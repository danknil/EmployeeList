<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="../init.jsp" %>

<liferay-portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="../view.jsp"/>
</liferay-portlet:renderURL>

<liferay-portlet:actionURL name="addElectronics" var="addElectronicsURL"/>

<aui:form action="<%= addElectronicsURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="name"/>
        <aui:input name="electronics type"/>
        <aui:input name="price"/>
        <aui:select name="in stock">
            <aui:option value="true"/>
            <aui:option value="false"/>
        </aui:select>
        <aui:select name="Archived">
            <aui:option value="true"/>
            <aui:option value="false"/>
        </aui:select>
        <aui:input name="Description"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>
