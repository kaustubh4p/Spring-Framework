package com.spring.core.bean;

/**
 * @author KaustubhWaghmare
 *
 */
public class OutputHelper {
	OutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via setter method
	public OutputHelper(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}