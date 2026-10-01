package example.cookiepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController @RequestMapping ("/api/redis") @RequiredArgsConstructor 
public class RedisController {
    private final StringRedisTemplate stringRedisTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    int i = 1;
    // 저장
    @GetMapping("/add")
    public boolean save( @RequestParam (name = "data") String data) throws JsonProcessingException {
        String key = "key:"+i;
        String value = objectMapper.writeValueAsString( data );

        stringRedisTemplate.opsForValue().set(key, value);
        i++;
        System.out.println(i);
        return true;
    }
    
    // 전체조회
    @GetMapping("/all")
    public List<String> findAll() throws JsonMappingException, JsonProcessingException {
        Set<String> keys = stringRedisTemplate.keys("key:*");
        List<String> list = new ArrayList<>();
        for( String key : keys ) {
            String value = stringRedisTemplate.opsForValue().get(key);
            String result = objectMapper.readValue(value, String.class);
            list.add(result);
        }
        return list;
    }
    
    
}
