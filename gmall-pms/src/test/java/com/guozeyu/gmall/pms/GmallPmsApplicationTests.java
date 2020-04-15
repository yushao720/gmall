package com.guozeyu.gmall.pms;

import com.guozeyu.gmall.pms.entity.Brand;
import com.guozeyu.gmall.pms.entity.Product;
import com.guozeyu.gmall.pms.service.BrandService;
import com.guozeyu.gmall.pms.service.ProductService;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        /*Product product = productService.getById(1);
        System.out.println(product.getName());*/


        /*Brand brand = new Brand();
        brand.setName("guozeyu");
        brandService.save(brand);

        System.out.println("保存成功....");*/

        Brand brand = brandService.getById(53);
        System.out.println(brand.getName());

    }

}
