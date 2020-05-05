package edu.mum.controller;

import edu.mum.domain.Employee;
import edu.mum.exception.InvalidImageUploadException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

@Controller
public class EmployeeController {

    private static final Log logger = LogFactory.getLog(EmployeeController.class);



    @RequestMapping(value = {"/", "employee_input"})
    public String inputEmployee(@ModelAttribute("employee") Employee employee) {
        return "EmployeeForm";
    }

    @RequestMapping(value = "/employee_save")
    public String saveEmployee(@Valid Employee emp, BindingResult bindingResult, Model model, HttpServletRequest request) {

        if (bindingResult.hasErrors()) {
            return "EmployeeForm";
        }

        String[] suppressedFields = bindingResult.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
                    + StringUtils.addStringToArray(suppressedFields, ", "));
        }

        // save product here
        model.addAttribute("employee", emp);

//        MultipartFile image = emp.getImage();
//       // String rootDirectory = request.getSession().getServletContext().getRealPath("/");
////        String rootDirectory = request.getSession().getServletContext().getContextPath();
//        if (image != null && !image.isEmpty()) {
//            if (image.getContentType().contains("image/")) {
//                System.out.println("Image is not null. " + image.getContentType());
//                try {
//                    System.out.println(rootDirectory + "images\\" + emp.getId() + ".png");
//                    image.transferTo(new File(rootDirectory + "images\\" + emp.getId() + ".png"));
//                    System.out.println("Image Uploaded");
//                } catch (Exception e) {
//                    throw new RuntimeException("Employee image saving failed", e);
//                }
//            } else {
//                throw new InvalidImageUploadException();
//            }
//        } else {
//                System.out.println("Please select image.");
//        }
//
//        System.out.println(emp.getFirstName());
        return "EmployeeDetails";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // binder.setDisallowedFields(new String[]{"firstName"});
    }
}
