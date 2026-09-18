package example.dddd;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service 
public class ApiService {
    @Value ("${api.public-data.service-key}")
    private String serviceKey;
    private WebClient webClient = WebClient.builder().build();

    public Map<String, Object> test1(){
        String url = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst";
        url += "?pageNo="+1;
        url += "&numOfRows="+100;
        url += "&ServiceKey="+serviceKey;
        url += "&dataType=JSON";
        url += "&base_date="+20210628;
        url += "&base_time=0500";
        url += "&nx="+55;
        url += "&ny="+127;

        Map<String, Object> response = webClient.get()
                    .uri( url )
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();
        return response;
    }
}
