package xdu.lyz.ai.rag.knowledge.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

public interface IAiService {
    // 同步生成 - 一次性返回完整结果
    ChatResponse generate(String model, String message);

    // 流式生成 - 实时返回部分结果（类似ChatGPT打字效果）
    Flux<ChatResponse> generateStream(String model, String message);
}
