package lyz.yeying.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

public interface IApiService {

    ChatResponse generate(String model, String message);

    Flux<ChatResponse> generateStream(String model, String message);
}
