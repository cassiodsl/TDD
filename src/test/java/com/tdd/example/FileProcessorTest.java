package com.tdd.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.io.IOException;

/**
 * 
 * @author Cassio Lemos
 *
 */
public class FileProcessorTest {

	@Mock
	private IFileProcessor fileProcessor;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void trueWhenFileIsFound() throws IOException {
		when(fileProcessor.readFile()).thenReturn("test");
		assertTrue(fileProcessor.process("myFile.txt"));
	}

	@Test(expected = IOException.class)
	public void falseWhenFileIsNotFound() throws IOException {
		when(fileProcessor.readFile()).thenThrow(new IOException());
		fileProcessor.process("wrongName.txt");
	}

	@Test
	public void falseWhenFileIsEmpty() throws IOException {
		when(fileProcessor.readFile()).thenReturn(null);
		assertFalse(fileProcessor.process("myFile.txt"));
	}

}
