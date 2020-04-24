package edu.miu.controller;

import edu.miu.domain.Category;
import edu.miu.domain.Product;
import edu.miu.service.CategoryService;
import edu.miu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {

    ProductService productService;

    CategoryService categoryService;

    ProductController() {
    }

    @Autowired
    ProductController(ProductService productService, CategoryService categoryService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @RequestMapping(value = {"/", "/product"}, method = RequestMethod.GET)
    public String inputProduct(@ModelAttribute("newProduct") Product product, Model model) {
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);

        return "ProductForm";
    }


    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("newProduct") Product product) {
        System.out.println(product.toString());
        Category category = categoryService.getCategory(product.getCategory().getId());
        product.setCategory(category);

        productService.save(product);

        return "ProductDetails";
    }

    @RequestMapping(value = "/listproducts")
    public String listProducts(Model model) {

        List<Product> list = productService.getAll();
        model.addAttribute("products", list);

        return "ListProducts";
    }

}
