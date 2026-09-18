package example.dddd;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController @RequiredArgsConstructor 
@CrossOrigin (origins = "http://localhost:5173")
public class ApiController {
    private final ApiService apiService;

    @GetMapping(value = "/test", produces = "application/json")
    public Map<String, Object> test1() {
        return apiService.test1();
    }
    
}
