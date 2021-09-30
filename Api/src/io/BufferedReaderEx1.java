package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("c:\\temp\\file.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\temp\\file.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {

			String Line = "";

			while ((Line = br.readLine()) != null) {
				bw.write(Line);
				bw.newLine(); // ฟฃลอ
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
