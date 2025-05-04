package AST.Angular.Component;

import AST.Instruction;

public class Component extends Instruction {
    private ComponentBody componentBody;


    public Component(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }


    public ComponentBody getComponentBody() {
        return componentBody;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    @Override
    public String toString() {
        return "Component:" + componentBody.toString();
    }
}