package com.project.dao;

import com.project.model.TagData;
import com.project.model.TagDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(TagDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(TagDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByPrimaryKey(Long tagid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(TagData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(TagData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<TagData> selectByExample(TagDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    TagData selectByPrimaryKey(Long tagid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") TagData record, @Param("example") TagDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") TagData record, @Param("example") TagDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(TagData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table taginfo_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKey(TagData record);
}