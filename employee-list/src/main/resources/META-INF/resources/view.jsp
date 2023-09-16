<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ include file="init.jsp" %>

<%@ page import="com.liferay.portal.kernel.portlet.PortletURLUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="employee.database.model.*" %>
<%@ page import="java.util.List" %>
<%@ page import="employee.database.service.*" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="employee.database.service.PositionTypeLocalServiceUtil" %>
<%@ page import="java.util.ArrayList" %>

<portlet:actionURL var="submitFileAction" name="uploadFile"/>

<form action="<%= submitFileAction %>" method="post" enctype="multipart/form-data">
    <h2>import csv</h2>
    <input type="file" id="file" name='<portlet:namespace />file' size="50"/>
    <input type="submit" value="Submit"/>
</form>

<%
//    List<Employee> employees = employeeService.getEmployees(-1,-1);
//    List<Purchase> purchases = purchaseService.getPurchases(-1,-1);
//    List<Electronics> electronics = electronicsService.getElectronicses(-1,-1);

    PortletURL thisURL = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);
%>

<liferay-ui:tabs names="Employees,Purchases,Electronics">
    <liferay-ui:section>
        <liferay-ui:search-container iteratorURL="<%= thisURL %>" emptyResultsMessage="empty" delta="20" deltaConfigurable="true">
            <%
//                searchContainer.setResults(employees);
//                searchContainer.setTotal(employees.size());
            %>
<%--            <liferay-ui:search-container-results--%>
<%--                    results="<%= employeeService.getEmployees(searchContainer.getStart(), searchContainer.getEnd()) %>"--%>
<%--            />--%>
            <liferay-ui:search-container-row className="employee.database.model.Employee">
                <liferay-ui:search-container-column-text name="ID" value="<%= String.valueOf(model.getId()) %>"/>
                <liferay-ui:search-container-column-text name="Lastname" value="<%= model.getLastname() %>"/>
                <liferay-ui:search-container-column-text name="Firstname" value="<%= model.getFirstname() %>"/>
                <liferay-ui:search-container-column-text name="Patronymic" value="<%= model.getPatronymic() %>"/>
                <liferay-ui:search-container-column-text name="Gender" value='<%= model.getGender() ? "male" : "female" %>'/>
                <liferay-ui:search-container-column-text name="Birthdate" value="<%= sdf.format(model.getBirthdate()) %>"/>
<%--                <liferay-ui:search-container-column-text name="Position" value="<%= positionTypeService.getPositionType(model.getPosition()).getName() %>"/>--%>
            </liferay-ui:search-container-row>
        </liferay-ui:search-container>
    </liferay-ui:section>
    <liferay-ui:section>
        <liferay-ui:search-container iteratorURL="<%= thisURL %>" emptyResultsMessage="empty" delta="20" deltaConfigurable="true">
            <%
//                searchContainer.setResults(purchases);
//                searchContainer.setTotal(purchases.size());
            %>
            <liferay-ui:search-container-row className="employee.database.model.Purchase">
                <liferay-ui:search-container-column-text name="ID" value="<%= String.valueOf(model.getId()) %>"/>
                <liferay-ui:search-container-column-text name="Product" value="<%= String.valueOf(model.getElectroId()) %>"/>
                <liferay-ui:search-container-column-text name="Employee" value="<%= String.valueOf(model.getEmployeeId()) %>"/>
                <liferay-ui:search-container-column-text name="Date" value="<%= sdf.format(model.getPurchaseDate()) %>"/>
<%--                <liferay-ui:search-container-column-text name="Type" value="<%= purchaseTypeService.getPurchaseType(model.getType()).getName() %>"/>--%>
            </liferay-ui:search-container-row>
        </liferay-ui:search-container>
    </liferay-ui:section>
    <liferay-ui:section>
        <liferay-ui:search-container iteratorURL="<%= thisURL %>" emptyResultsMessage="empty" delta="20" deltaConfigurable="true">
            <%
//                searchContainer.setResults(electronics);
//                searchContainer.setTotal(electronics.size());
            %>
            <liferay-ui:search-container-row className="employee.database.model.Electronics">
                <liferay-ui:search-container-column-text name="ID" value="<%= String.valueOf(model.getId()) %>"/>
                <liferay-ui:search-container-column-text name="Name" value="<%= model.getName() %>"/>
<%--                <liferay-ui:search-container-column-text name="Type" value="<%= electroTypeService.getElectroType(model.getEtype()).getName() %>"/>--%>
                <liferay-ui:search-container-column-text name="Price" value="<%= String.valueOf((double) model.getPrice() / 100)%>"/>
                <liferay-ui:search-container-column-text name="Count" value="<%= String.valueOf(model.getCount())%>"/>
                <liferay-ui:search-container-column-text name="isInStock" value="<%= String.valueOf(model.isInStock()) %>"/>
                <liferay-ui:search-container-column-text name="isArchive" value="<%= String.valueOf(model.isArchive()) %>"/>
                <liferay-ui:search-container-column-text name="Description" value="<%= model.getDescription() %>"/>
            </liferay-ui:search-container-row>
        </liferay-ui:search-container>
    </liferay-ui:section>
</liferay-ui:tabs>

<%--<liferay-ui:tabs names="?????? ???????????,?????? ??????????,?????? ??????">--%>
<%--    <liferay-ui:section>--%>

<%--        <liferay-ui:search-container iteratorURL="<%= thisURL %>" emptyResultsMessage="??? ??????????? ? ??????, ???????? ???????????"--%>
<%--                                     delta="20" deltaConfigurable="true">--%>
<%--            <%--%>
<%--                searchContainer.setResults(employees);--%>
<%--                searchContainer.setTotal(employees.size());--%>
<%--            %>--%>

<%--            <liferay-ui:search-container-results results="<%=ListUtil.subList(employees,searchContainer.getStart(),searchContainer.getEnd())%>" />--%>

<%--            <liferay-ui:search-container-row className="DataBase.model.Employee">--%>
<%--                <liferay-ui:search-container-column-text name="Id ?????????" value="<%=String.valueOf(model.getPrson_id())%>"/>--%>
<%--                <liferay-ui:search-container-column-text name="???" value="<%=model.getFirstName()%>"/>--%>
<%--                <liferay-ui:search-container-column-text name="???????" value="<%=model.getLastName()%>"/>--%>
<%--                <liferay-ui:search-container-column-text name="???? ????????" value="<%=sdf.format(model.getDate_of_birth())%>" />--%>
<%--                <liferay-ui:search-container-column-text name="???? ?????? ??????" value="<%=sdf.format(model.getDate_of_start_work())%>" />--%>
<%--                <liferay-ui:search-container-column-text name="??????? ???????" value="<%=String.valueOf(model.getWorkNumber())%>" />--%>
<%--                <liferay-ui:search-container-column-text name="???????? ?????" value="<%=String.valueOf(model.getHomeNumber())%>" />--%>
<%--                <liferay-ui:search-container-column-text name="?????????" value="<%=PositionsLocalServiceUtil.getPositions(model.getPosition_Id()).getPosition_name()%>" />--%>
<%--                <liferay-ui:search-container-column-text name="????????????? ????" value="<%=BankLocalServiceUtil.getBank(model.getBank_id()).getBankName()%>" />--%>
<%--                <liferay-ui:search-container-column-text name="??????????????">--%>
<%--                    <liferay-ui:icon-menu>--%>

<%--                        <portlet:renderURL var="editEmployeeURL">--%>
<%--                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_employee.jsp"></portlet:param>--%>
<%--                            <portlet:param name="employeeId" value="<%=String.valueOf(model.getPrson_id())%>" />--%>
<%--                        </portlet:renderURL>--%>
<%--                        <liferay-ui:icon message="?????????????" url="<%=editEmployeeURL.toString()%>" />--%>

<%--                        <portlet:actionURL name="deleteEmployee" var="deleteEmployeeURL">--%>
<%--                            <portlet:param name="employeeId" value="<%=String.valueOf(model.getPrson_id())%>" />--%>
<%--                        </portlet:actionURL>--%>
<%--                        <liferay-ui:icon-delete message="????????? ? ?????" url="<%=deleteEmployeeURL.toString()%>" />--%>

<%--                    </liferay-ui:icon-menu>--%>
<%--                </liferay-ui:search-container-column-text>--%>
<%--            </liferay-ui:search-container-row>--%>
<%--            <liferay-ui:search-iterator />--%>
<%--        </liferay-ui:search-container>--%>

<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= addEmployeeURL.toString() %>" value="???????? ??????????"></aui:button>--%>
<%--        </aui:button-row>--%>

<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= recoverEmployeeURL.toString() %>" value="???????????? ?????????? ?? ??????"></aui:button>--%>
<%--        </aui:button-row>--%>

<%--    </liferay-ui:section>--%>
<%--    <!--========================?????? ??????????========================================================= -->--%>
<%--    <liferay-ui:section>--%>
<%--        <liferay-ui:search-container total="<%=positions.size()%>" var="searchContainer" delta="20" deltaConfigurable="true"--%>
<%--                                     emptyResultsMessage="??? ?????????? ? ???????, ???????? ?????????">--%>

<%--            <liferay-ui:search-container-results results="<%=ListUtil.subList(positions, searchContainer.getStart(),searchContainer.getEnd())%>" />--%>

<%--            <liferay-ui:search-container-row className="DataBase.model.Positions" modelVar="pos" keyProperty="positions_id" >--%>
<%--                <liferay-ui:search-container-column-text name="Id ?????????" value="${pos.positions_id}"/>--%>
<%--                <liferay-ui:search-container-column-text name="???????? ?????????" value="${pos.position_name}"/>--%>
<%--                <liferay-ui:search-container-column-text name="???. ?????" value="${pos.salary}"/>--%>
<%--                <liferay-ui:search-container-column-text name="??????????????">--%>
<%--                    <liferay-ui:icon-menu>--%>

<%--                        <portlet:renderURL var="editPositionURL">--%>
<%--                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_position.jsp"></portlet:param>--%>
<%--                            <portlet:param name="positionId" value="${pos.positions_id}" />--%>
<%--                        </portlet:renderURL>--%>
<%--                        <liferay-ui:icon message="?????????????" url="<%=editPositionURL.toString()%>" />--%>

<%--                        <portlet:actionURL name="deletePosition" var="deletePositionURL">--%>
<%--                            <portlet:param name="positionId" value="${pos.positions_id}" />--%>
<%--                        </portlet:actionURL>--%>
<%--                        <liferay-ui:icon-delete message="????????? ? ?????" url="<%=deletePositionURL.toString()%>" />--%>

<%--                    </liferay-ui:icon-menu>--%>
<%--                </liferay-ui:search-container-column-text>--%>
<%--            </liferay-ui:search-container-row>--%>
<%--            <liferay-ui:search-iterator />--%>
<%--        </liferay-ui:search-container>--%>

<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= addPositionURL.toString() %>" value="???????? ?????????"></aui:button>--%>
<%--        </aui:button-row>--%>

<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= recoverPositionURL.toString() %>" value="???????????? ?? ??????"></aui:button>--%>
<%--        </aui:button-row>--%>
<%--    </liferay-ui:section>--%>
<%--    <!--========================?????? ??????========================================================= -->--%>
<%--    <liferay-ui:section>--%>
<%--        <liferay-ui:search-container total="<%=banks.size()%>" var="searchContainer" delta="10" deltaConfigurable="true"--%>
<%--                                     emptyResultsMessage="Oops. There Are No Users To Display, Please add Users">--%>
<%--            <liferay-ui:search-container-results results="<%=ListUtil.subList(banks, searchContainer.getStart(),searchContainer.getEnd())%>" />--%>
<%--            <liferay-ui:search-container-row className="DataBase.model.Bank" modelVar="bank" keyProperty="bank_id" >--%>
<%--                <liferay-ui:search-container-column-text name="Id ?????" value="${bank.bank_id}"/>--%>
<%--                <liferay-ui:search-container-column-text name="???????? ?????" value="${bank.bankName}"/>--%>
<%--                <liferay-ui:search-container-column-text name="???" value="${bank.bic}"/>--%>
<%--                <liferay-ui:search-container-column-text name="?????" value="${bank.address}"/>--%>
<%--                <liferay-ui:search-container-column-text name="??????????????">--%>
<%--                    <liferay-ui:icon-menu>--%>

<%--                        <portlet:renderURL var="editBankURL">--%>
<%--                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/edit_bank.jsp"></portlet:param>--%>
<%--                            <portlet:param name="bankId" value="${bank.bank_id}" />--%>
<%--                            <portlet:param name="bankName" value="${bank.bankName}" />--%>
<%--                            <portlet:param name="bankAddress" value="${bank.address}" />--%>
<%--                            <portlet:param name="bic" value="${bank.bic}" />--%>
<%--                        </portlet:renderURL>--%>
<%--                        <liferay-ui:icon message="?????????????" url="<%=editBankURL.toString()%>" />--%>

<%--                        <portlet:actionURL name="deleteBank" var="deleteBankURL">--%>
<%--                            <portlet:param name="bankId" value="${bank.bank_id}" />--%>
<%--                        </portlet:actionURL>--%>
<%--                        <liferay-ui:icon-delete message="????????? ? ?????" url="<%=deleteBankURL.toString()%>" />--%>

<%--                        <portlet:renderURL var="showBankEmpURL">--%>
<%--                            <portlet:param name="mvcPath" value="/empoyeeewbprotlet/show_bank_emp.jsp"></portlet:param>--%>
<%--                            <portlet:param name="bankId" value="${bank.bank_id}" />--%>
<%--                            <portlet:param name="bankName" value="${bank.bankName}" />--%>
<%--                        </portlet:renderURL>--%>
<%--                        <liferay-ui:icon message="???????? ???????????" url="<%=showBankEmpURL.toString()%>" />--%>

<%--                    </liferay-ui:icon-menu>--%>
<%--                </liferay-ui:search-container-column-text>--%>
<%--            </liferay-ui:search-container-row>--%>
<%--            <liferay-ui:search-iterator />--%>
<%--        </liferay-ui:search-container>--%>

<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= addBankURL.toString() %>" value="???????? ????"></aui:button>--%>
<%--        </aui:button-row>--%>
<%--        <aui:button-row>--%>
<%--            <aui:button onClick="<%= recoverBankURL.toString() %>" value="???????????? ?? ??????"></aui:button>--%>
<%--        </aui:button-row>--%>

<%--    </liferay-ui:section>--%>
<%--</liferay-ui:tabs>--%>
