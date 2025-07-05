package AST.Basic;

import AST.Instruction;
import java.util.List;

public class ImportState extends Instruction {
    private List<String> importTypes; // List of IDs (e.g., NgForOf, NgIf, ...)
    private String fromPath;

    public ImportState() {}

    public List<String> getImportTypes() {
        return importTypes;
    }

    public void setImportTypes(List<String> importTypes) {
        this.importTypes = importTypes;
    }

    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }

    public String getFromPath() {
        return fromPath;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\t importTypes=" + importTypes +
                "\n \t\t\t\t\t\t\t fromPath='" + fromPath + '\'';
    }

    public String print() {
        return "\n Import{" +
                "\n importTypes=" + importTypes +
                "\n fromPath='" + fromPath + '\'' +
                '}';
    }
}
