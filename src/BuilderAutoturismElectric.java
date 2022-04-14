public class BuilderAutoturismElectric implements BuilderMasina{

    private AutoturismElectric autoturismElectric;

    public BuilderAutoturismElectric(AutoturismElectric autoturismElectric) {

        this.autoturismElectric = new AutoturismElectric();

    }


    @Override
    public void buildSasiu() {

        this.autoturismElectric.setSasiu("Electric");

    }

    @Override
    public void buildRoti() {

        this.autoturismElectric.setRoti("Aliaj");
    }

    @Override
    public void buildMotor(){

        this.autoturismElectric.setMotor("2000A");
    }

    @Override
    public void buildInterior() {

        this.autoturismElectric.setInterior("Alb");

    }

    @Override
    public String getMasina() {

        return this.autoturismElectric.toString();

    }
}
