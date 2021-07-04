public class ConditionalStatement {
	public static void main(String[] args) {
		double height = 1.85;
		char firstLetterName = 'K';
		int age = 25;
		boolean maleGender = true;
		if (age>20) {
			System.out.println("Молодой");
		}
		if (maleGender) {
			System.out.println("Мужчина");
		}
		if (!maleGender) {
			System.out.println("Женщина");
		}
		if (height < 1.80) {
			System.out.println("Низкий");
		} else {
			System.out.println("Высокий");
		}
		if (firstLetterName == 'M') {
			System.out.println("Первая буква это M");
		} else if (firstLetterName == 'I') {
			System.out.println("Первая буква это I");
		} else {
			System.out.println("Первая буква это K");
		}
	}
}