package com.ares.promotion.manager;

import org.slf4j.LoggerFactory;

import com.meidusa.toolkit.common.runtime.Application;
import com.meidusa.toolkit.common.runtime.ApplicationConfig;

public class RunApplication extends Application<ApplicationConfig>{

	@Override
	protected String[] getConfigLocations() {
		return new String[] { 
                "classpath:config/applicationContext-server.xml",
                "classpath:config/spring/sscprmt-venus-client.xml",
                "classpath:config/spring/sscprmt-beans.xml"
                };
	}

	@Override
	public ApplicationConfig getApplicationConfig() {
		return null;
	}

	@Override
	public void doRun() {
	}
	
	public static void main(String[] args) {
        System.setProperty(ApplicationConfig.PROJECT_MAINCLASS, RunApplication.class.getName());
        Application.main(args);
        LoggerFactory.getLogger(RunApplication.class).info("The venus service startup success.");
    }
}
