package num01.yshwang.konkuk;

import java.util.Scanner;

public class YShwangAssi01 {

	public static Scanner scanner = new Scanner(System.in);

	public static void HW01() {
		System.out.println("====== 복리 예금 계산기 ======");

		System.out.print("원금을 입력하세요 : ");
		int deposit = scanner.nextInt();
		System.out.print("연이율을 입력하세요 : ");
		double interest = scanner.nextDouble();
		System.out.println("--------------------");
		System.out.println(" 년도수\t원리금");
		System.out.println("--------------------");
		double total = deposit;
		int year = 1;
		while (total <= (deposit * 2)) {
			total = total * (1 + interest / 100);
			System.out.printf("%2d\t%.2f\n", year, total);
			year++;
		}
		System.out.println("--------------------");
		System.out.println((year - 1) + "년 걸림");
		System.out.println();
	}

	public static void HW02() {
		System.out.println("====== 구구단 출력하기 ======");
		System.out.print("출력 단수를 입력하세요:");
		int count = scanner.nextInt();

		for (int i = 2; i <= 9; i += count) {
			for (int k = 1; k <= 9; k++) {
				for (int j = i; j < i + count && j <= 9; j++) {
					System.out.printf("%d * %d = %2d\t", j, k, j * k);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int menu = 0;

		do {
			System.out.println("1) 복리 예금 계산기 2) 구구단 출력하기 3) 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scanner.nextInt();

			if (menu < 1 || menu > 3) {
				System.out.println("메뉴 번호를 확인 후 다시 입력해 주세요.");
				continue;
			}
			switch (menu) {
			case 1:
				HW01();
				break;
			case 2:
				HW02();
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				break;
			}

		} while (menu != 3);

		scanner.close();
	}

}
