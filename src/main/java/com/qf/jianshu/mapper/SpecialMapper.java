package com.qf.jianshu.mapper;

import com.qf.jianshu.entity.Special;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpecialMapper {

    /*创建专题*/
    @Insert("insert into js_special(name,userId,headImgUrl,`describe`) values(#{name},#{userId},#{headImgUrl},#{describe})")
    Integer addSpecial(Special special);

    /*查询专题信息*/
    @Select("select a.specialId as id,s.`describe`,s.`name`,count(specialId) as collections from js_special s left join js_special_article a on a.specialId=s.id where specialId=#{id}")
    Special collection_info(Integer id);



}
