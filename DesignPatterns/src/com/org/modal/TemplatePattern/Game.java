package com.org.modal.TemplatePattern;

public abstract class Game {
	
	abstract void initialize();
	
	abstract void startPlay();
	
	abstract void endPlay();
	
	//ģ��
	public final void play(){
		
		//��ʼ��ģ��
		initialize();
		
		//��ʼ��Ϸ
		startPlay();
		
		//������Ϸ
		endPlay();
	}

}
