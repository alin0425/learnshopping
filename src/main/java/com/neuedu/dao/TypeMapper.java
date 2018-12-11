package com.neuedu.dao;

import com.neuedu.entity.Type;
import java.util.List;

public interface TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typetable
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typetable
     *
     * @mbg.generated
     */
    int insert(Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typetable
     *
     * @mbg.generated
     */
    Type selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typetable
     *
     * @mbg.generated
     */
    List<Type> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typetable
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Type record);


    // 查询子类（平级）
    List<Type> findChildCategory(Integer id);


}