package example.practice4.service;

import org.springframework.stereotype.Service;

import example.practice4.model.dto.EnrollDto;
import example.practice4.model.entity.EnrollEntity;
import example.practice4.model.repository.EnrollRepository;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor 
public class EnrollService {
    private final EnrollRepository enrollRepository;

    // 등록
    public boolean save( EnrollDto enrollDto ) {
        EnrollEntity enrollEntity = enrollDto.toEntity();
        EnrollEntity savedEntity = enrollRepository.save(enrollEntity);
        if( savedEntity.getEnrollId() >= 1) return true;
        return false;
    }
}
