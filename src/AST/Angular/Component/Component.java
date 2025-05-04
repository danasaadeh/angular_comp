package AST.Angular.Component;

public class Component {
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