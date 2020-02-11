package br.edu.ifcvideira.Lista9;

public class Ex2EquipamentoSonoro extends Ex2Equipamento {
	private int volume;
	private boolean stereo;
	
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if ((volume <= 10) && (volume >= 0)) {
			this.volume = volume;
		}
	}
	
	public boolean isStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	public void liga() {
		this.setVolume(5);
		super.liga();
	}
	

	public void stereo() {
		this.setStereo(true);
	}
	
	public void mono() {
		this.setStereo(false);
	}
	
}
