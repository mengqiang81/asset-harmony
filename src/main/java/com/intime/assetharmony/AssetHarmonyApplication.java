package com.intime.assetharmony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.intime.assetharmony" })
public class AssetHarmonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetHarmonyApplication.class, args);
	}

}
