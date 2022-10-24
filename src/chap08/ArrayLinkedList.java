package chap08;

import java.lang.reflect.Array;
import java.util.Comparator;

public class ArrayLinkedList<E> {

    class Node<E> {
        private E data; // 데이터
        private int next; // 리스트의 뒤쪽 포인터
        private int dnext; // 프리 리스트의 뒤쪽 포인터 (다음 노드를 뜻함)

        //data와 next를 설정함
        void set(E data, int next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E>[] n; // 리스트 본체
    private int size; // 리스트의 용량(가장 큰 데이터 수)
    private int max; // 사용 중인 꼬리 record
    private int head; // 머리노드
    private int crnt; // 선택 노드
    private int deleted; // 프리 리스트의 머리 노드 (이곳에서는 해제 목록으로 사용됨)
    private static final int NULL = -1; // 다음 노드 없음 / 리스트가 가득참

    public ArrayLinkedList(int capacity) {
        head = crnt = max = deleted = NULL;
        try {
            n = new Node[capacity]; // 새로운 배열 리스트 생성
            for (int i = 0; i < capacity; i++) { // Node값 추가
                n[i] = new Node<E>();
            }
            size = capacity; // 배열의 최대 용량
        } catch (OutOfMemoryError error) { // 배열 생성 실패
            size = 0;
        }
    }

    private int getInsertIndex() { // 노드를 삽입할 때 레코드 번호를 가져오는 메서드
        if (deleted == NULL) { // 프리리스트 의 머리 노드 (deleted)
            if (max < size) // 새 record 사용
                return ++max;
            else // 용량 넘치는 경우
                return NULL;
        } else {
            int rec = deleted;
            deleted = n[rec].dnext;
            return rec;
        }
    }

    private void deletedIndex(int idx) { // 삭제한 레코드를 프리 리스트로 등록하는 메서드
        if (deleted == NULL) {
            deleted = idx;
            n[idx].dnext = NULL;
        } else {
            int rec = deleted;
            deleted = idx;
            n[idx].dnext = rec;
        }
    }

    public E search(E obj, Comparator<? super E> c) {
        int ptr = head;

        while (ptr != NULL) {
            if (c.compare(obj, n[ptr].data) == 0) {
                crnt = ptr;
                return n[ptr].data;
            }
            ptr = n[ptr].next;
        }
        return null;
    }


    public void addFirst(E obj) {
        int ptr = head;
        int rec = getInsertIndex();
        if (rec != NULL) {
            head = crnt = rec;
            n[head].set(obj, ptr);
        }
    }

    public void addLast(E obj) {
        if (head == NULL)
            addFirst(obj);
        else {
            int ptr = head;
            while (n[ptr].next != NULL)
                ptr = n[ptr].next;
            int rec = getInsertIndex();
            if (rec != NULL) {
                n[ptr].next = crnt = rec;
                n[rec].set(obj, NULL);
            }
        }
    }

    public void removeFirst() {
        if (head != NULL) {
            int ptr = n[head].next;
            deletedIndex(head);
            head = crnt = ptr;
        }
    }

    public void removeLast() {
        if (head != NULL) {
            if(n[head].next == NULL)
                removeFirst();
            else {
                int ptr = head;
                int pre = head;

                while (n[ptr].next != NULL) {
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next = NULL;
                deletedIndex(ptr);
                crnt = pre;
            }
        }
    }

    public void remove(int p) {
        if (head != NULL) {
            if (p == head)
                removeFirst();
            else {
                int ptr = head;

                while (n[ptr].next != p) {
                    ptr = n[ptr].next;
                    if (ptr == NULL) return;
                }
                n[ptr].next = NULL;
                deletedIndex(p);
                n[ptr].next = n[p].next;
                crnt = ptr;
            }
        }
    }

    public void removeCurrentNode() {
        remove(crnt);
    }

    public void clear() {
        while (head != NULL)
            removeFirst(); // 기존 메서드 활용
        crnt = NULL;
    }

    public boolean next() {
        if (crnt == NULL || n[crnt].next == NULL)
            return false;
        crnt = n[crnt].next;
        return true;
    }

    public void printCurrentNode() {
        if(crnt==NULL)
            System.out.println("선택 노드가 없습니다.");
        else
            System.out.println(n[crnt].data);
    }

    public void dump() {
        int ptr= head;

        while (ptr != NULL) {
            System.out.println(n[ptr].data);
            ptr=n[ptr].next;
        }
    }
}
