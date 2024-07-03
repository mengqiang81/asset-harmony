package com.intime.assetharmony;

import org.flywaydb.core.internal.publishing.PublishingConfigurationExtension;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

/**
 * @author chigui.meng
 * @date 3/7/2024 10:29 am
 */
@Configuration(proxyBeanMethods = false)
@ImportRuntimeHints(FlywayAOTConfiguration.FlywayRuntimeHintsRegister.class)
public class FlywayAOTConfiguration {
    static class FlywayRuntimeHintsRegister implements RuntimeHintsRegistrar {

        @Override
        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
            hints.reflection().registerType(PublishingConfigurationExtension.class, MemberCategory.INVOKE_PUBLIC_METHODS);
        }
    }
}
