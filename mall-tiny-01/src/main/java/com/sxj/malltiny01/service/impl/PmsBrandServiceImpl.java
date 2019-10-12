package com.sxj.malltiny01.service.impl;

import com.sxj.malltiny01.mbg.model.PmsBrand;
import com.sxj.malltiny01.service.PmsBrandService;

import java.util.List;

/**
 * @program: mall-tiny-01
 * @description:
 * @author: sxj
 * @create: 2019-10-12 18:20
 **/
public class PmsBrandServiceImpl implements PmsBrandService {
    @Override
    public List<PmsBrand> listAllBrand() {
        return null;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return 0;
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int PageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
