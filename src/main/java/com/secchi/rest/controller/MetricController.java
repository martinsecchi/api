package com.secchi.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/metric")
public class MetricController {

    @GetMapping("/custom")
    public Map<String, Object> getCustom() {
        Map<String, Object> metrics = new HashMap<>();

        // Memoria en MB
        long memoryUsageBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        metrics.put("memoryUsage", memoryUsageBytes);

        // Tiempo de actividad en horas
        long uptimeMillis = ManagementFactory.getRuntimeMXBean().getUptime();
        metrics.put("uptime", uptimeMillis);

        // Número de hilos activos
        metrics.put("activeThreads", Thread.activeCount());

        // Carga del sistema
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        metrics.put("systemLoadAverage", osBean.getSystemLoadAverage());

        // Memoria total y libre de la JVM
        metrics.put("maxMemory", Runtime.getRuntime().maxMemory());  // en MB
        metrics.put("freeMemory", Runtime.getRuntime().freeMemory()); // en MB
        metrics.put("totalMemory", Runtime.getRuntime().totalMemory()); // en MB

        // Número de clases cargadas
        ClassLoadingMXBean classLoadingBean = ManagementFactory.getClassLoadingMXBean();
        metrics.put("loadedClassCount", classLoadingBean.getLoadedClassCount());

        // Recolección de basura
        GarbageCollectorMXBean gcBean = ManagementFactory.getGarbageCollectorMXBeans().get(0);
        metrics.put("gcCount", gcBean.getCollectionCount());
        metrics.put("gcTime", gcBean.getCollectionTime());

        return metrics;
    }

}