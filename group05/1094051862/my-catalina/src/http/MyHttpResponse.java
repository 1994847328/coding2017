package http;

import java.io.IOException;
import java.io.OutputStream;

public class MyHttpResponse {
	
	private OutputStream out;
	public MyHttpResponse(OutputStream out) {
		this.out = out;
	}
	
	
	/**
	 * ��ͻ���д��Ϣ
	 * @param out
	 */
	public void write(String outer) {
		try {
			out.flush();
			out.write(outer.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
