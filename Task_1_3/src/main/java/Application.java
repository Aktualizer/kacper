public class Application {
    public static void main(String[] args) {
        Quest DeadIslandQuest = new DeadIslandQuest();
        Knight knight = new Knight(DeadIslandQuest);

        knight.process();
        System.out.println("Dead Island Quest Has Been Done!");
    }
}
