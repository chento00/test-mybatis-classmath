package com.example.test1.repository;

import com.example.test1.model.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Mapper
public interface PersonRepository {
    @Select(
            """
                    SELECT *FROM classes
            """
    )

     List<Classes> getAllPerson();
//
//    public void addPerson() ;
//
//    public Classes searchById(Integer sid);
}
