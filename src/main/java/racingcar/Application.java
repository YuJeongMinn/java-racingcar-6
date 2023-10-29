package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
            // 기능 1-1. 자동차의 이름을 입력 받아 몇 대(n)의 자동차로 경기를 할 것인지 입력 받기
            String Input = getInput();
            // 기능 2-1. 자동차의 이름을 저장하여 각 라운드마다 자동차의 이름과 진행 상황을 프린트하는 함수인 playRound() 메서드 구현
            // 기능 3-1. 자동차 이름을 쉼표를 기준으로 구분하여 저장
            String[] cars = Input.split(",");
            // 자동차의 수만큼 0을 초기값으로 갖는 배열 생성
            int[] location = new int[cars.length];
            // 기능 1-2. 주어진 횟수를 입력받기(몇 번의 라운드를 진행할 지 입력 받기)
            int rounds = getNumberOfRounds();
            System.out.println("\n실행 결과");

    }

    // 기능 1-1. 자동차의 이름을 입력 받아 몇 대(n)의 자동차로 경기를 할 것인지 입력 받기
    public static String getInput(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String input = scanner.nextLine();
            scanner.close();
            return input;
    }
    // 기능 1-2. 주어진 횟수를 입력받기(몇 번의 라운드를 진행할 지 입력 받기)
    public static int getNumberOfRounds(){
            int rounds = 0;
            boolean validInput = false;
            System.out.print("시도할 회수는 몇회인가요?");
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            return rounds;
    }

    // 기능 2-1. 자동차의 이름을 저장하여 각 라운드마다 자동차의 이름과 진행 상황을 프린트하는 함수인 playRound() 메서드 구현
    public static void playRound(String[] cars, int rounds, int[] location){

            int numOfCars = cars.length;
            int[][] positions = new int[numOfCars][rounds];
            int index = 0;

            for (String car : cars) {
                    System.out.print(car + ": ");
                    for(int i = 0; i < location[index]; i++){
                        System.out.print("-");
                    }
                    System.out.println();
            }
    }

}
