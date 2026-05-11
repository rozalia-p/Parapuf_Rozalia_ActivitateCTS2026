public class Bucatar {
    private String numeBucatar;

    public Bucatar(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    public void gatestePizza(String tipPizza) {
        System.out.println("[" + numeBucatar + "] Framanta aluatul si coace pizza: " + tipPizza);
    }

    public void pregatesteDesert(String tipDesert) {
        System.out.println(" [" + numeBucatar + "] Monteaza pe farfurie desertul: " + tipDesert);
    }
}