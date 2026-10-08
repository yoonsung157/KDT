package example.day14;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController @RequestMapping ("/api/sse")
@RequiredArgsConstructor @CrossOrigin ( origins = "*" )
public class NoticeController {
    private final NoticeService noticeService;

    // 1. 알림 구독 매핑
    @GetMapping( value = "/subscribe")
    public SseEmitter subscribe( ) {
        return noticeService.subscribe();
    }
    
    // 2. 알림 메시지 전송 *테스트*
    @GetMapping("/message")
    public void onMessage(@RequestParam (name = "msg") String msg) {
        noticeService.onMessage(msg);
    }
    
}
