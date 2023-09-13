package employee.list.portlet;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import employee.database.service.*;
import employee.list.constants.EmployeeListPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author danknil
 */
@Component(
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=EmployeeList",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + EmployeeListPortletKeys.EMPLOYEELIST,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class EmployeeListPortlet extends MVCPortlet {
    @ServiceReference
    private EmployeeLocalService employee;

    @ServiceReference
    private EmployeeLocalService electroEmployee;

    @ServiceReference
    private ElectronicsLocalService electronics;

    @ServiceReference
    private ElectroTypeLocalService electroType;

    @ServiceReference
    private PositionTypeLocalService positionType;

    @ServiceReference
    private PurchaseLocalService purchase;

    @ServiceReference
    private PurchaseTypeLocalService purchaseType;

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws IOException, PortletException {

        request.setAttribute("employeeService", employee);
        request.setAttribute("electronicsService", electronics);
        request.setAttribute("purchaseService", purchase);

        request.setAttribute("positionTypeService", positionType);
        request.setAttribute("electroTypeService", electroType);
        request.setAttribute("purchaseTypeService", purchaseType);

        super.render(request, response);
    }

    public void uploadFile(ActionRequest request, ActionResponse response) throws IOException {
        UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
        String fileName = uploadRequest.getFileName("file");

        File file = uploadRequest.getFile(fileName);

        System.out.printf("filename: %s%n", file.getName());

        if (!file.getName().contains(".zip")) {
            System.out.println("not zip archive, returning");
            return;
        }

        try (ZipFile zipFile = new ZipFile(file)) {
            ZipEntry entry;
            try {
                if ((entry = zipFile.getEntry("electroemployee.csv")) != null)
                    electroEmployee.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("electronics.csv")) != null)
                    electronics.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("electrotype.csv")) != null)
                    electroType.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("employee.csv")) != null)
                    employee.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("positiontype.csv")) != null)
                    positionType.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("purchase.csv")) != null)
                    purchase.fromCSV(zipFile.getInputStream(entry));
                if ((entry = zipFile.getEntry("purchasetype.csv")) != null)
                    purchaseType.fromCSV(zipFile.getInputStream(entry));
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }
}