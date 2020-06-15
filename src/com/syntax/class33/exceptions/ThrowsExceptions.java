package com.syntax.class33.exceptions;

import java.io.IOException;

public class ThrowsExceptions {
	void a() throws IOException {
		throw new IOException("My own IOExc");
	}
	void b() throws IOException {
		try {
		a();
		}catch(IOException e) {
			System.out.println("Cought in b method: "+e);
		}
	}
	void c() throws IOException {
		b();
	}
	

	public static void main(String[] args) throws IOException {
		ThrowsExceptions exc = new ThrowsExceptions();
		try {
		exc.c();
		}catch(IOException e) {
			System.out.println("Caugth: "+e);
		}
	}

}
