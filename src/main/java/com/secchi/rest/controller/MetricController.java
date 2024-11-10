package com.secchi.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/metric")
public class MetricController {

    @GetMapping("/custom")
    public Map<String, Object> getCustom() {
        Map<String, Object> metrics = new HashMap<>();
        metrics.put("memoryUsage", Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        metrics.put("uptime", ManagementFactory.getRuntimeMXBean().getUptime());
        return metrics;
    }
}