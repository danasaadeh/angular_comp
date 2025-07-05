//// File: AST/ProgramImpl.java
//package AST;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProgramImpl implements Program {
//
//    private List<Instruction> instructions_list = new ArrayList<>();
//
//    public ProgramImpl() {
//        this.instructions_list = new ArrayList<>();
//    }
//
//    @Override
//    public List<Instruction> getInstructions_list() {
//        return instructions_list;
//    }
//
//    @Override
//    public void setInstructions_list(Instruction instruction) {
//        this.instructions_list.add(instruction);
//    }
//
//    @Override
//    public String toString() {
//        return "\n \t\t\t\t\t\t\t Program {" +
//                "\n \t\t\t\t\t\t\t" + instructions_list +
//                "\n \t\t\t\t\t\t\t }";
//    }
//
//    @Override
//    public String print() {
//        return "\n Program {" +
//                "\n " + instructions_list +
//                "\n }";
//    }
//}
