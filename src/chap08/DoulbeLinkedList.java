package chap08;

import java.util.Comparator;

public class DoulbeLinkedList<E> {

    class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;


        Node() {
            data = null;
            prev = next = this;
        }

        Node(E obj, Node<E> prev, Node<E> next) {
            data = obj;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head; // 머리 포인터(참조하는 곳은 더미 노드)
    private Node<E> crnt; // 선택 포인터

    public DoulbeLinkedList() {
        head = crnt = new Node<E>(); // 더미 노드 생성
    }

    public boolean isEmpty() {
        return head.next == head;
    }

    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head.next; // 현재 스캔중인 노드

        while (ptr != head) {
            if (c.compare(obj, ptr.data) == 0) { // 검색 성공
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next; // 다음 노드 선택
        }
        return null; // 검색 실패
    }

    public void printCurrentNode() {
        if (isEmpty())
            System.out.println("선택 노드가 없습니다.");
        else
            System.out.println(crnt.data);
    }

    public void dump() {
        Node<E> ptr = head.next;

        while (ptr != head) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public void dumpReverse() {
        Node<E> ptr = head.prev;

        while (ptr != head) {
            System.out.println(ptr.data);
            ptr = ptr.prev;
        }
    }

    public boolean next() {
        if (isEmpty() || crnt.next == head)
            return false;
        crnt = crnt.next;
        return true;
    }

    public boolean prev() {
        if (isEmpty() || crnt.prev == head)
            return false;
        crnt = crnt.prev;
        return true;
    }

    public void add(E obj) { // 선택 노드 바로 뒤에 삽입
        Node<E> node = new Node<E>(obj, crnt, crnt.next);
        crnt.next = crnt.next.prev = node; // 바로 뒤에 삽입
        crnt = node;
    }

    public void addFirst(E obj) {
        crnt = head;
        add(obj);
    }

    public void addLast(E obj) {
        crnt = head.prev;
        add(obj);
    }

    public void removeCurrentNode() { // 선택 노드 삭제
        if (!isEmpty()) {
            crnt.prev.next = crnt.next;
            crnt.next.prev = crnt.prev;
            crnt = crnt.prev;
            if (crnt == head) crnt = head.next;
        }
    }

    public void remove(Node p) {
        Node<E> ptr = head.next;

        while (ptr != head) {
            if (ptr == p) {
                crnt = p;
                removeCurrentNode();
                break;
            }
            ptr = ptr.next;
        }
    }

    public void removeFirst() {
        crnt = head.next;
        removeCurrentNode();
    }

    public void removeLast() {
        crnt = head.prev;
        removeCurrentNode();
    }

    public void clear() {
        while (!isEmpty())
            removeFirst();
    }

}
