package org.reader.properties;

import java.io.IOException;

public class Filereader_Manager {

	private Filereader_Manager() {

	}

	// static method
	public static Filereader_Manager getInstanceFR() {
		Filereader_Manager reader  = new Filereader_Manager();
		return reader;
	}

	// non static method

	public Testdata_Reader getInstanceTD() throws IOException {

		Testdata_Reader reader = new Testdata_Reader();
		return reader;

	}

}
