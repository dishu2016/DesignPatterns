package com.org.modal.AdapterPattern;

public class MediaAdapter implements MediaPlayer {

	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer=new Mp4Player();
		}
	}
	
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
