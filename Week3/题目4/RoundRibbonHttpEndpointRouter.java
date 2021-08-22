package java05.nio02.homework.gateway.router;

import java.util.List;

/**
 * 实现将请求循环发送的路由
 */
public class RoundRibbonHttpEndpointRouter implements HttpEndpointRouter{
    private int totalEndpoint = 0;
    private int currentIdx;

    @Override
    public String route(List<String> endpoints) {
        if (endpoints == null || endpoints.isEmpty()) {
            throw new IllegalArgumentException("endpoints is empty!");
        }

        // 若后端服务数量发生了改变，则更新后端服务数量，并从头进行路由
        if (totalEndpoint != endpoints.size()) {
            totalEndpoint = endpoints.size();
            currentIdx = 0;
        }

        return endpoints.get(currentIdx++);
    }
}
