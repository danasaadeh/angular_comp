package AST.Angular.Component;

import java.util.List;

public class Imports {
    private List<String> imports;


    public Imports(List<String> imports) {
        this.imports = imports;
    }


    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }


    @Override
    public String toString() {
        return "Imports: " + String.join(", ", imports);
    }
}