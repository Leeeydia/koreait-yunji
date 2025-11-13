// 문제 1 : 1부터 5까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int i=0;
//     while(i<=5){
//         i++;
//                 System.out.println("i="+i);
//
//     }
//    }
//}

// 문제 2 : -100부터 25까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int i= -100;
//        while(i<=25){
//            i++;
//            System.out.println("i="+i);
//        }
//    }
//}

// 문제3 구구단 8단을 출력해주세요 1000부터 1까지 곱해주세요


//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        int i = 1001;
//
//        while(i>=1){
//            i--;
//            System.out.println(
//                    dan+"*"+i+"="+dan*i
//            );
//        }
//
//    }
//}

// 문제 4 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        int i = 1001;
//
//        while(i>-500){
//            i--;
//            System.out.println(dan+"*"+i+"="+dan*i);
//        }
//
//
//    /*
//    8 * 1000 = 8000
//    ...
//    8 * -500 = -4000
//    */
//    }
//}

//문제 5 1부터5까지의 합 구하기

//public class Main {
//    public static void main(String[] args) {
//
//        int a = 0;
//        int b = 1;
//
//        while (b <= 5) {
//            a = a + b;
//            b++;
//        }
//
//        System.out.println("합계: " + a);
//    }
//}

//문제 6 -100부터 25까지의 합 구하기

public class Main {
    public static void main(String[] args) {
       int a=0;
       int b=-100;

       while(b<=25){
           a=a+b;
           b++;
       }
       System.out.println(("합계:"+a));
    }
}

// 문제 7 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

//class Main {
//    public static void main(String[] args) {
//        int i=1;
//        while(i<=10){
//            int j=1;
//            System.out.println(j);
//            while(j<3){
//                j++;
//                System.out.println(j);
//            }
//            i++;
//            }
//        }
//
//
//
//        // 출력
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//        // 1
//        // 2
//        // 3
//    }