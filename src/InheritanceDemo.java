import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        Worker worker1 = new Worker("000001", "John", "Doe", "Mr.", 2003, 15.50);
        Worker worker2 = new Worker("000002", "Jane", "Done", "M2.", 2001, 16.00);
        Worker worker3 = new Worker("000003", "Matthew", "Dooley", "Lord", 1999, 16.25);

        SalaryWorker salWorker1 = new SalaryWorker("000004", "Jill", "Shepard", "Mrs.", 1998, 24.00, 49920);
        SalaryWorker salWorker2 = new SalaryWorker("000005", "Neo", "Anderson", "Mr.", 1987, 30.00, 624000);
        SalaryWorker salWorker3 = new SalaryWorker("000006", "Alex", "Rae", "Ms.", 1994, 32.50, 72500);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);


        workers.add(salWorker1);
        workers.add(salWorker2);
        workers.add(salWorker3);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for(int i = 0; i < workers.size(); i++){

            Worker worker = (Worker) workers.get(i);
            System.out.printf("%-30s", worker.formalName());
            System.out.printf("%-20s", "Week 1");
            System.out.printf("%-20s", "Week 2");
            System.out.print("Week 3");
            System.out.println();
            System.out.print("ID #: " + worker.getID());
            System.out.printf("%-18s", " ");
            System.out.printf("$" + worker.displayWeeklyPay(40));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(50));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(40));
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}