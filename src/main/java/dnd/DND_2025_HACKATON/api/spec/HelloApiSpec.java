package dnd.dnd_2025_hackaton.api.spec;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public interface HelloApiSpec {

    @Operation(summary = "테스트 인사 API", description = "Hello 메시지를 반환합니다.")
    @GetMapping
    String hello();
}
