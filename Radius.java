import java.util.Scanner;

public class Radius {
	public static void main(String[] args) {

		boolean isNotValid = true;
		Scanner scanner = new Scanner(System.in);

		while (isNotValid) {
			System.out.println("Please enter a radius : ");
			try {

				Double radius = Double.parseDouble(scanner.nextLine());

				if (radius >= 0.0) {
					isNotValid = false;
					double area = radius * radius * Math.PI;
					double circumference = 2 * Math.PI * radius;
					System.out.println("The area is of the circle is : " + area);
					System.out.println("The circumference of the circle is : " + circumference);
				} else {
					System.out.println("Input needs to be a number greater than 0, please try again");
				}

			} catch (Exception e) {
				System.out.println("Input needs to be a number greater than 0, please try again");
			}
		}
	}
}
