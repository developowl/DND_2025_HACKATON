package dnd.dnd_2025_hackaton.api.spec;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Test Swagger", description = "테스트용 Hello API")
public interface HelloApiSpec {

    @Operation(summary = "테스트 인사 API", description = "Hello 메시지를 반환합니다.")
    @GetMapping
    String hello();
}
