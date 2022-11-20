package org.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configurator {

	public static Logger log = Logger.getLogger(Property_Configurator.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.debug("***Debug***");

		log.info("**Info**");

		log.warn("***Warn***");

		log.error("**Error***");

		log.fatal("***fatel***");

	}

}
