public class Main {
    public static void main(String[] args) {
        Kunteynir conteiner = new Kunteynir(7);
        conteiner.add("1");
        conteiner.add("2");
        conteiner.add("3");
        conteiner.add("4");
        conteiner.add("5");
        System.out.println("Вместимость контейнера: " + conteiner.getCapacity());
        System.out.println("Размер контейнера: " + conteiner.getSize());
        System.out.println("Элементы в контейнере:");
        for (int i = 0; i < conteiner.getSize(); i++) {
            System.out.println(conteiner.getElem(i));
        }
        conteiner.remove(2);
        System.out.println("Элементов в контейнере после удаления: " + conteiner.getSize());
        System.out.println("Вывод элемента по номеру индекса: " + conteiner.getElem(1));

    }
}