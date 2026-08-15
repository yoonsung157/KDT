package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dao.ProductDao;
import 종합예제.model.dto.ProductDto;

public class ProductController {
    private ProductController() {}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance() { return instance; }

    private IBaseDao ib = ProductDao.getInstance();

    public boolean save(ProductDto productDto) {
        // TODO 1: productDto 전달받아 DAO의 save()를 호출하고 결과 반환
        Boolean aa = ib.save(productDto);

        return aa;
    }

    public ArrayList<ProductDto> findAll() {
        // TODO 2: DAO의 findAll() 호출하여 결과를 받고 반환

        ArrayList<Object> a = ib.findAll();
        ArrayList<ProductDto> b = new ArrayList<>();

        for(int i = 0; i <= a.size()-1 ; i++){
            b.add((ProductDto)a.get(i));
        }

        return b;
    }
}