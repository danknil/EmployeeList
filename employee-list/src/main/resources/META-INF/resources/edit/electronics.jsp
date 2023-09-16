<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page pageEncoding="utf-8" %>

<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/empoyeeewbprotlet/view.jsp"></portlet:param>
</portlet:renderURL>

<liferay-ui:success key="electronicsWarning" message="electronics_warning" />

<%
    String id = ParamUtil.getString(request, "id");
    String name = ParamUtil.getString(request, "name");
    String etype = ParamUtil.getString(request, "etype");
    String price = ParamUtil.getString(request, "price");
    String inStock = ParamUtil.getString(request, "inStock");
    String archive = ParamUtil.getString(request, "archive");
    String description = ParamUtil.getString(request, "description");
%>

<portlet:actionURL name="editElectronics" var="editElectronicsURL">
    <portlet:param name="electronicsId" value="<%= id %>" />
</portlet:actionURL>

<aui:form action="<%= editElectronicsURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="id" disabled="true" value="<%= id %>"/>
        <aui:input name="name" value="<%= name %>"/>
        <aui:input name="electronics type" value="<%= etype %>"/>
        <aui:input name="price" value="<%= price %>"/>
        <aui:select name="in stock" value="<%= inStock %>">
            <aui:option value="true"/>
            <aui:option value="false"/>
        </aui:select>
        <aui:select name="Archived" value="<%= archive %>">
            <aui:option value="true"/>
            <aui:option value="false"/>
        </aui:select>
        <aui:input name="Description" value="<%= description %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>