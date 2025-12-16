package ex4;

public class MaxCounter {
    private int count = 0;
    private int max;

    MaxCounter(int count){
        max = count;
    }

    public void increment() {
    if(count >= max){
        System.out.println("최대값을 초과할 수 없습니다.");
    return;
    }
        count++;
    }

    public int getCount(){
        return  count;
    }
}
