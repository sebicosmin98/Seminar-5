public class Main {

                                                                                // Builder

    // facem o interfata Masina
    // avem in ea metodele setSasiu(), setRoti(), setMotor(), setInterior()

    // facem o clasa AutoturismClasic care sa implementeze aceasta interfata
    // in clasa avem campurile string sasiu, string roti, string motor, string interior, string aditivi
    // OBS: nu avem constructor in clasa, o sa construim obiecte prin builderul ulterior care va apela metodele alea de set
    // implementam in clasa metodele din interfata dar si setter pentru campul specific

    // facem o clasa AutoturismElectric care sa implementeze aceasta interfata
    // in clasa avem campurile string sasiu, string roti, string motor, string interior + string incarcator
    // implementam in clasa metodele din interfata dar si setter pentru campul specific

    // facem interfata BuilderMasina
    // avem in ea metodele buildSasiu(), buildRoti(), buildMotor(), buildInterior() + getter getMasina()
    // ulterior trebuie sa implementam un builder complet prin aceasta interfata prin care sa facem un obiect al clasei concrete

    // vom avea un BuilderAutoturismElectric si un BuilderAutoturismClasic care sa implementeze interfata BuilderMasina
    // in aceste clase trebuie sa avem un camp privat de obiect Autoturism la nivelul lor (HAS A)
    // vom avea si constructori in aceste clase unde vom seta campul de Autoturism = new Autoturism()
    // vom avea implementari pentru toate metodele buildSasiu(), buildRoti() etc. + pentru getMasina()

    // ca sa nu folosim direct builder-ul in Main mai facem o clasa InginerAuto
    // va avea un camp b de tip Builder (HAS A)
    // va avea un constructor cu un parameru de tip String prin care ii spunem ce tip de masina va face
    // va avea o metoda de construit masini: buildMasina() care va apela toate metodele de build: b.buildRoti etc..
    // va avea o metoda getMasina care va returna b.getMasina()

    // in Main vom face masini printr-o instanta de InginerAuto
    // apelam apoi build apoi get


    public static void main(String[] args){

        InginerAuto inginerAuto = new InginerAuto("Clasic");
        inginerAuto.buildMasina();
        System.out.println(inginerAuto.getMasina());












    }
}
