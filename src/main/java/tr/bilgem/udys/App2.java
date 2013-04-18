package tr.bilgem.udys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;

public class App2 {
	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Please specify a valid argument!");
			return;
		}

		String path = args[0];
		FileInputStream fis = null;
		try {
			// Generate md5
			fis = new FileInputStream(path);
			String md5String = DigestUtils.md5Hex(fis);
			System.out.println("File : [" + path + "]");
			System.out.println("MD5 :" + md5String);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
