public class Knight implements Quest {
    private Quest quest;

    public Knight(Quest quest)
    {
        this.quest = quest;
    }

    public void process()
    {
        System.out.println("New Quest Has Started");
        this.quest.process();
    }
}
