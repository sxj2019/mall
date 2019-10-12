package com.sxj.malltiny01.service;

import com.sxj.malltiny01.mbg.model.PmsBrand;

import java.util.List;

/**
 * @program: mall-tiny-01
 * @description:
 * @author: sxj
 * @create: 2019-10-12 14:54
 **/
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id,PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum,int PageSize);

    PmsBrand getBrand(Long id);
}
