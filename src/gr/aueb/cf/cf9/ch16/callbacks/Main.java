package gr.aueb.cf.cf9.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };

        //Lambda expression
        Printable printable2 = () -> System.out.println("Hello World!");
        Printable printable3 = () -> doPrint();
        //Method reference
        Printable printable4 = Main::doPrint;

        doWithPrintable(printable);
        doWithPrintable(printable2);

        System.out.println("--------------- ANONYMOUS CLASSES");

        doWithPrintable(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });

        System.out.println("--------------- LAMBA EXPRESSION");

        doWithPrintable(() -> System.out.println("Hello World!"));

        System.out.println("--------------- METHOD REFERENCE");

        doWithPrintable(Main::doPrint);
        doWithPrintable(System.out::println);

    }

    public static void doPrint() {
        System.out.println("Hello World!");
    }

    public static void doWithPrintable(Printable printable) {
        printable.print();
    }
}
