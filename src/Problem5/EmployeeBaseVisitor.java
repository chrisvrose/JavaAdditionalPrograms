package Problem5;


/**
 * Base visitor. Provides std implementations
 * Not as imp, as the actual visitor
 */
public abstract class EmployeeBaseVisitor {
    public final void visit(Employee e){e.accept(this);}
    public void visitBCEmployee(BplusC_Employee e){}
    public void visitBEmployee(Salaried_Employee e){}
    public void visitCEmployee(Commission_Employee e){}
}