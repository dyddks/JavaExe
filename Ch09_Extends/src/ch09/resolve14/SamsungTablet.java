package ch09.resolve14;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Samsung - 동영상을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

	@Override
	public void music() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Samsung - 음악을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

	@Override
	public void readBook() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Samsung - ebook을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

}
