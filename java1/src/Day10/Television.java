package Day10;

public class Television implements RemoteControl ,Searchable {
			// 클래스명 implements 인터페이스명
					// 구현하다
			// ctrl+spacbar
	
	private int volume;
	@Override
	public void turnOn() {
		System.out.println(" TV 를 켭니다 ");
	}
	
	@Override
	public void turnOff() {
		System.out.println(" TV 를 끕니다 ");
	}
	
	@Override
	public  void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			// 리모컨의 최대소음보다 크면 소음을 10으로 대입
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println(" 현재 tv 볼륨 : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다. ");
	}
	
	@Override // 디폴트 메소드도 재정의 가능 
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}
	
	
}
