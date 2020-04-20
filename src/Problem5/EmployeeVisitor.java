package Problem5;

public class EmployeeVisitor extends EmployeeBaseVisitor {
    @Override
    public void visitBCEmployee(BplusC_Employee e) {
        //10% extra for these creatures
        e.setSalary((long)(e.getSalary()*1.1f));
    }
    @Override
    public void visitBEmployee(Salaried_Employee e) {
        
    }
    @Override
    public void visitCEmployee(Commission_Employee e) {
        
    }
}