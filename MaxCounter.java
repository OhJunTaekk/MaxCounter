package access.ex1;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (max <= count) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}


// 요구 사항
// 접근 제어자를 사용해서 데이터를 캡슐화
// 해당 클래스를 다른 패키지에서도 사용가능 하게