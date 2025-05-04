package AST.Angular.Service;

public class Inject {

    private ProvidedIn providedIn; // The provided in information

    // Constructor
    public Inject( ProvidedIn providedIn) {

        this.providedIn = providedIn;
    }



    public ProvidedIn getProvidedIn() {
        return providedIn;
    }

    // Setter
    public void setProvidedIn(ProvidedIn providedIn) {
        this.providedIn = providedIn;
    }


    // toString method for debugging
    @Override
    public String toString() {
        return "Inject: " + (providedIn != null ? providedIn.toString() : "No providedIn");
    }
}