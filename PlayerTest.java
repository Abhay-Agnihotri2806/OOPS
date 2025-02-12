class Player {
    String name;
    int age;
    String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is batting in cricket.");
    }
}

class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing football in the position: " + position);
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing hockey.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        Cricket_Player cricketer = new Cricket_Player("Virat", 35, "Batsman");
        Football_Player footballer = new Football_Player("Messi", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan Chand", 30, "Midfielder");

        cricketer.play();
        footballer.play();
        hockeyPlayer.play();
    }
}
