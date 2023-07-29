package chapter3;
/**
 * [ArrayList]
 * 단점
 * 배열의 길이가 초기에 결정되어야 한다. 변경이 불가능하다.
 * 삭제 과정에서 데이터 이동이 빈번히 일어난다.
 * 장점
 * 데이터의 참조가 쉽다. 인덱스 값을 기준으로 어디든 한 번에 참조가 가능하다.
 */
public class ArrayList<T> implements List<T> {
    private final int max_size = Integer.MAX_VALUE;
    private final Object[] arr;
    private Integer numOfData;
    private Integer current;

    public ArrayList() {
        super();
        arr = new Object[max_size];
        current = -1;
        numOfData = 0;
    }

    @Override
    public void insert(T data) {
        if (max_size == numOfData) {
            System.out.println("저장이 불가능 합니다.");
            throw new RuntimeException();
        }
        arr[current + 1] = data;
        numOfData++;
    }

    @Override
    public T first() {
        current = 0;
        return (T) arr[current];
    }

    @Override
    public T next() {
        if (current >= numOfData) {
            throw new RuntimeException("더이상 참조할 값이 없습니다.");
        }
        return (T) arr[++current];
    }

    @Override
    public T remove() {
        Object obj = arr[current];
        arr[current] = null;
        if (current < numOfData) {
            for (int i = current; i < numOfData; i++) {
                arr[current] = arr[current + 1];
            }
        }
        current--;
        numOfData--;
        return (T) obj;
    }

    @Override
    public int size() {
        return numOfData;
    }

    @Override
    public boolean isNext() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return numOfData == 0;
    }
}
