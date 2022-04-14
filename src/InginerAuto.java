public class InginerAuto {

    public BuilderMasina b;

    public InginerAuto(String tipAutoturism){

        if(tipAutoturism.equalsIgnoreCase("Clasic")){

            this.b = new BuilderAutoturismClasic(new AutoturismClasic());
        }
        else if(tipAutoturism.equalsIgnoreCase("Electric")){

            this.b = new BuilderAutoturismElectric(new AutoturismElectric());
        }

    }

    public void buildMasina(){

        b.buildSasiu();
        b.buildRoti();
        b.buildMotor();
        b.buildInterior();


    }

    public String getMasina(){

        return b.getMasina().toString();
    }


}
