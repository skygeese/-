import java.util.Random;

public class Jisuane {
	public static void main(String[] args) {
		int o, m,n;
		String f;
		Random random=new Random();
		for (int i = 0; i < 50; i++) {
			m=random.nextInt(101);
			n=random.nextInt(101);
			o=random.nextInt(2);
			if (o==1) 	{
				f="+";
			}
			else {
				f="-";
			}
			System.out.println("µÚ"+(i+1)+"µÀ£º"+"  "+m+f+n+"=");
		}
	}

}
