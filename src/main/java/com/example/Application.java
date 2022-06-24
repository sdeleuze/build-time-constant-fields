package com.example;

import java.util.Collections;

import org.springframework.core.NativeDetector;

public class Application {

	public static void main(String[] args) {
		new CustomWebMvcConfigurationSupport().configureMessageConverters(Collections.emptyList());
		if (!NativeDetector.inNativeImage()) {
			new ClassRemovedWhenInNativeImage();
		}
	}

}
