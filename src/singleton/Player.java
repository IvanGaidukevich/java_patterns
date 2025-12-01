package singleton;

public enum Player {
    PLAYER1;

    private String nickname;
    private int score;

    Player(){
        this.nickname = "Player1";
        this.score = 0;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void info(){
        System.out.println(getNickname() + " " + getScore());
    }
}
