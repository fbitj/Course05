package java05.nio02.homework.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

// 实现自定义过滤器
public class MyHttpRequestFilter implements HttpRequestFilter{

    // 每次转发给后端服务前，都添加一个请求头
    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        fullRequest.headers().set("xjava", "kimmking");
    }
}
