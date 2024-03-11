public class MaleZvire extends Animal{
    public MaleZvire(String type, String name, Size size, String specialCare) {
        super(type, name, size, specialCare);
    }

    @Override
    public void prodat() {
        System.out.println(name + "bylo prodano");
    }

    @Override
    public void pohladit() {
        System.out.println(name + "bylo pohlazeno");
    }
}
