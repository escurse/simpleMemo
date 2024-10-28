package com.escass.simplememo.mappers;

import com.escass.simplememo.entities.MemoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int insertMemo(MemoEntity memo);
}
