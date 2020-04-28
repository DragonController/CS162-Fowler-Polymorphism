public class Owner {
    public void giveRaise(Employee employee, double percentageIncrease) {
        employee.setBaseSalary(employee.getBaseSalary() * (1 + percentageIncrease / 100));
    }
}