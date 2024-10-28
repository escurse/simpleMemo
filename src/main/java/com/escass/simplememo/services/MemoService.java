package com.escass.simplememo.services;

import com.escass.simplememo.entities.MemoEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MemoService {
    public boolean write(MemoEntity memo) {
        if (memo == null ||
            memo.getWriter() == null || memo.getWriter().isEmpty() || memo.getWriter().length() > 10 ||
            memo.getContent() == null || memo.getContent().isEmpty() || memo.getContent().length() > 1_000) {
            return false;
        }
        memo.setCreatedAt(LocalDateTime.now()); // LocalDateTime.now() : 현재 일시를 반환
        return false;
    }
}
