package ch09.resolve14.resolve02;

public class SonyTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Sony - 동영상을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

	@Override
	public void music() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Sony - 음악을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

	@Override
	public void readBook() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Sony - ebook을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

}
