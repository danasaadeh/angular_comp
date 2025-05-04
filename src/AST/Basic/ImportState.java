package AST.Basic;

import AST.Instruction;

public  class ImportState extends Instruction {
    private String importType; //  or 'ID'

    private String fromPath;

    public ImportState() {

        this.importType = importType;

        this.fromPath = fromPath;
    }

    public String getImportType() {
        return importType;
    }

    public void setImportType(String importType) {
        this.importType = importType;
    }


    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }



    public String getFromPath() {
        return fromPath;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t importType='" + importType + '\'' +

                "\n \t\t\t\t\t\t\t fromPath='" + fromPath + '\''
                ;
    }
    public String print(){

            return "\n Import{" +
                    "\n importType='" + importType + '\'' +

                    "\n fromPath='" + fromPath + '\'' +
                    '}';

    }
}
