package com.tdd.example;

import java.io.IOException;

/**
 * 
 * @author Cassio Lemos
 *
 */
public interface IFileProcessor {

	/**
	 * Reads the file and returns the content of it
	 * 
	 * @return file`s content
	 * @throws IOException
	 */
	public String readFile() throws IOException;

	/**
	 * Reading the file and processing into database (it validates info)
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException 
	 */
	public boolean process(String fileName) throws IOException;

}
