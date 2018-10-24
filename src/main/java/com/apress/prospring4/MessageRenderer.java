package com.apress.prospring4;

public interface MessageRenderer {

	void render();
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();
}
