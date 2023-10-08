import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bl = true;
        Scanner in = new Scanner(System.in);String name;
        String title;
        String author;
        int id;
        Book b;
        do{
            System.out.println("=====================");
            System.out.println("Welcome to Library \n CHOOSE ONE OF THE OPTIONS:");
            System.out.println("1.ADD BOOK");
            System.out.println("2.DELETE BOOK");
            System.out.println("3.UPDATE BOOK");
            System.out.println("4.GET BOOK");
            System.out.println("5.SHOW ALL BOOKS");
            System.out.println("6.EXIT");
            System.out.println("=====================");
            int user = in.nextInt();
            switch (user){
                case 1:
                    System.out.println("PRINT NAME OF THE BOOK:");
                    name = in.next();
                    System.out.println("PRINT TITLE OF THE BOOK:");
                    title = in.next();
                    System.out.println("PRINT AUTHOR OF THE BOOK:");
                    author = in.next();
                    Library.add(new Book(name,title,author));
                    break;
                case 2:
                    System.out.println("PRINT ID OF BOOK TO DELETE:");
                    id = in.nextInt();
                    Library.delete(id);
                    break;
                case 3:
                    System.out.println("PRINT ID OF BOOK TO UPDATE");
                    id = in.nextInt();
                    System.out.println("PRINT NAME OF THE BOOK:");
                    name = in.next();
                    System.out.println("PRINT TITLE OF THE BOOK:");
                    title = in.next();
                    System.out.println("PRINT AUTHOR OF THE BOOK:");
                    author = in.next();
                    Library.update(id,new Book(name,title,author));
                    break;
                case 4:
                    System.out.println("PRINT ID OF BOOK TO GET");
                    id = in.nextInt();
                    b = Library.getBook(id);
                    System.out.println(b.getName());
                    System.out.println(b.getTitle());
                    System.out.println(b.getAuthor());
                    break;
                case 5:
                    for (Book temp : Library.getBooks()){
                        System.out.println(temp.getId()+" - "+temp.getName()+", "+temp.getTitle()+", "+temp.getAuthor());
                    }
                    break;
                case 6:
                    bl = false;
                    break;
                default:
                    System.out.println("You entered wrong number, try again!");
                    break;
            }
        }while(bl);
    }
}
