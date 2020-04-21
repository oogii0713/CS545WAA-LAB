package edu.miu.cs.data;

import java.util.List;

public interface DataFacade {
	public String findPassword(String name);
	public List<String> getAdvice(String roast);
	public List<String> getRoast();
}
