package ch09.resolve14.question2;

public class LGTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("LG - 동영상을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("LG - 음악을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

	@Override
	public void readBook() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("LG - ebook을 재생합니다.");
		Thread.sleep((long)(Math.random()*500)+100);
	}

}
