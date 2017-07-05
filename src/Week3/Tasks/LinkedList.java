package Week3.Tasks;

/**
 * Створіть клас що описує зв'язний список. Клас повинен мати можливість додавання елементів та вилучення елементів. Додавання елементів відбувається в кінець списку, вилучення елементів відбувається за порядковим номером.Також створіть методи, що дозволяють отримати розмір списку та елемент за його порядковим номером.

 * Елементи списку повинні бути типу Node

 * Особливості використання класу Integer Ви зможете знайти за цим посиланням або тут російською мовою, розділ Обертки. З особливостями використання обгорток ми з Вам будемо знайомитися быльш детально на наступних тижнях.

 * Просимо врахувати деякі особливості перевірки завдань:

 * Декларація package повинна залишатися незмінною (як у шаблоні), зверніть на це увагу вставляючи Ваш код у вікно перевірки.
 * Для перевірки використовуються (беруться до уваги) виключно методи з сигнатурою описаною в шаблоні.
 * Кількість та зміст полів та/або методів відмінних від наведених в шаблоні не обмежена.
 * В кожному класі повинен бути або конструктор за замовчанням або public безаргументний конструктор.
 * Не рекомендовано робити вивід на екран.
 */

class Node{
    private Node next;
    private Integer data;

    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void display(){
        System.out.print(getData() + " ");
    }
}

public class LinkedList {

    private Node last;
    private Node first;

    public LinkedList() {
    }

    public void add(Integer data) {
        Node node = new Node();
        node.setData(data);
        if (last == null) {
            first = node;
        } else
            last.setNext(node);
        last = node;

    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        Node node = first;

        int count = 0;
        if (size() == 0 || index > size() - 1 || index < 0)
            return null;

        while (count != index) {
            if (node.getNext() == null)
                return null;
            else {
                node = node.getNext();
                count++;
            }
        }
        return node.getData();
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if (size() == 0 || index > size() - 1 || index < 0)
            return false;

        if (index == 0) {
            first = first.getNext();
            return true;
        }

        Node node = first;
        int count = 0;
        while (count < index - 1) {
            node = node.getNext();
            count++;
        }
        if (last == node.getNext()) {
            last = node;
        }
        Node delete = node.getNext();
        node.setNext(delete.getNext());
        return true;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        int cout = 0;
        if (first == null)
            return 0;
        else {
            Node node = first;
            while (node.getNext() != null) {
                cout++;
                node = node.getNext();
            }
        }
        return cout + 1;
    }

    public void display() {
        Node node = first;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();

        }


    }


    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        System.out.println("1: " + a.size() + " " + a.get(0)); //1
        a.add(10);
        System.out.println("2: " + a.size() + " " + a.get(0) + " " + a.get(-1) + "|| first =" + a.first.getData() + "   last=" + a.last.getData()); //2
        a.add(20);
        System.out.println("3: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + "|| first =" + a.first.getData() + "   last=" + a.last.getData());  //3
        a.add(30);
        System.out.println("4: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + " " + a.get(3) + "|| first =" + a.first.getData() + "   last=" + a.last.getData()); //4
        a.delete(0);
        System.out.println("5: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + "|| first =" + a.first.getData() + "   last=" + a.last.getData());      //5
        a.delete(1);
        System.out.println("6: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + " " + a.get(3) + "|| first =" + a.first.getData() + "   last=" + a.last.getData());  //6
        a.delete(0);
        System.out.println("7: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + " " + a.get(3));  //7
        System.out.println(a.delete(-2));
        System.out.println("8: " + a.size() + " " + a.get(0) + " " + a.get(1) + " " + a.get(2) + " " + a.get(3));  //7

    }
}
