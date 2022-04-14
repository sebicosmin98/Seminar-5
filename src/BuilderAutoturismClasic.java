public class BuilderAutoturismClasic implements BuilderMasina {

    private Masina autoturismClasic;

    public BuilderAutoturismClasic(AutoturismClasic autoturismClasic) {

        this.autoturismClasic = new AutoturismClasic();

    }

    @Override
    public void buildSasiu() {

        this.autoturismClasic.setSasiu("Clasic");

    }

    @Override
    public void buildRoti() {

        this.autoturismClasic.setRoti("Aliaj");
    }

    @Override
    public void buildMotor(){

        this.autoturismClasic.setMotor("2000cm3");
    }

    @Override
    public void buildInterior() {

        this.autoturismClasic.setInterior("Alb");

    }
    @Override
    public String getMasina() {

        return this.autoturismClasic.toString();

    }
}
