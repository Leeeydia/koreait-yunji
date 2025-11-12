package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main {
    public static void main(String[] args) {
        int age = 43; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        // || 사용 (둘 중 하나라도 참이면 참)
        if(age<=19 || age >=60){
            System.out.println("할인대상입니다.");
        }else{
            System.out.println("할인대상이 아닙니다.");
        }
        // && 사용 (둘 다 참이어야 함, 둘 다 참인 할인대상 아닌 것의 ! 사용)
        if(!(age>19&& age<60)){
            System.out.println(("할인대상입니다"));
        }else{
            System.out.println(("할인대상이 아닙니다."));
        }

        if((age-19)*(age-60)>=0){
            System.out.println(("할인대상입니다"));
        }else{System.out.println(("할인대상이 아닙니다."));
        }

    }
}