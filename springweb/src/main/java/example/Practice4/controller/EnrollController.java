package example.practice4.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.practice4.model.dto.EnrollDto;
import example.practice4.model.entity.EnrollEntity;
import example.practice4.service.EnrollService;
import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor 
public class EnrollController {
    private final EnrollService enrollService;

    // 등록
    public boolean save( @RequestBody EnrollDto enrollDto) {
        return enrollService.save(enrollDto);
    }
}
