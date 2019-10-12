package com.sxj.mybatis01.mbg.dao;

import com.sxj.mybatis01.mbg.model.Girl;
import com.sxj.mybatis01.mbg.model.GirlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GirlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int countByExample(GirlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int deleteByExample(GirlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int insert(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int insertSelective(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    List<Girl> selectByExample(GirlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    Girl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") Girl record, @Param("example") GirlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int updateByExample(@Param("record") Girl record, @Param("example") GirlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int updateByPrimaryKeySelective(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbggenerated Sat Oct 12 18:02:01 CST 2019
     */
    int updateByPrimaryKey(Girl record);
}