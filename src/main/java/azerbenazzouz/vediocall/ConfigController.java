package azerbenazzouz.vediocall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {

    @Value("${app.id}")
    private String appId;

    @Value("${server.secret}")
    private String serverSecret;

    @GetMapping("/api/config")
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("appId", appId);
        config.put("serverSecret", serverSecret);
        return config;
    }
}

