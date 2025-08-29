



// File: AST/Program.java


package AST;

import java.util.List;

public interface Program {
    List<Instruction> getInstructions_list();
    void setInstructions_list(Instruction instruction);
    String print();
    String convertToHtml();
    String convertToCss();
    String convertToJs();
}








//
//package AST;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Program {
//
//
//    List<Instruction> instructions_list=new ArrayList<Instruction>();
//
//
//    public Program() {
//        this.instructions_list = new ArrayList<>();
//    }
//
//
//    public List<Instruction> getInstructions_list(){
//        return instructions_list;
//    }
//    public void setInstructions_list(Instruction Instructions_list){
//        this.instructions_list.add(Instructions_list);
//    }
//    @Override
//    public String toString() {
//        return "\n \t\t\t\t\t\t\t Program {"+
//                " \n \t\t\t\t\t\t\t"+instructions_list +
//                "\n \t\t\t\t\t\t\t }";
//
//    }
//    public String print() {
//        return "\n Program {"+
//                "\n "+instructions_list +
//                "\n }";
//
//    }
//}