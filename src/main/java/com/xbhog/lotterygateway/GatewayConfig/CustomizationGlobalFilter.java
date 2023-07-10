package com.xbhog.lotterygateway.GatewayConfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author xbhog
 * @describe: 全局自定义过滤器,GlobalFilter,网关过滤器是gatewayFilter
 * @date 2023/7/10
 */
@Slf4j
@Component
public class CustomizationGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("====================开始自定义全局过滤器==============");
        log.info("====================执行请求的路径：{}",exchange.getRequest().getPath());
        log.info("====================结束自定义全局过滤器==============");
        return chain.filter(exchange);
    }
    /**
     * 过滤器链执行顺序，数值越小，执行顺序越靠前
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
