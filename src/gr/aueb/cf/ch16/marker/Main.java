package gr.aueb.cf.ch16.marker;

import gr.aueb.cf.ch16.Cat;

public class Main {

    public static void main(String[] args) {
        Item book = new Book();
        Item compactDisc = new CompactDisc();
        Cat cat = new Cat();

        deliver(book);
        deliver(compactDisc);
        //deliver(cat);
    }

    public static void deliver(Item item) {
        if(item instanceof Book) {
            System.out.println("Book delivered.");
        } else if (item instanceof CompactDisc) {
            System.out.println("CD delivered.");
        }else {
            throw new RuntimeException("Can not get delivered.");
        }
    }
}
