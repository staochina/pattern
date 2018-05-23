package iterator;

/**
 * Desc:
 * Created by sun.tao on 2018/5/23
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("1"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book =(Book)it.next();
            System.out.println(book.getName());
        }
    }
}
