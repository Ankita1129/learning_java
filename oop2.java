import java.util.Scanner;

class employee {
    int emp_id;
    double da, hra, pf, club_fund, gross, net;
    String emp_name, emp_mno, emp_type, emp_addr, emp_email;

    employee() {
        emp_id = 0;
        da = 0;
        hra = 0;
        pf = 0;
        club_fund = 0;
        gross = 0;
        net = 0;
        emp_name = "";
        emp_mno = "";
        emp_type = "";
        emp_addr = "";
        emp_email = "";
    }

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        // emp_id=checkEmpId(e1[],j);
        // sc.nextLine();
        // emp_mno=check_mno();
        System.out.println("Enter name: ");
        emp_name = sc.next();
        System.out.println("Enter Id: ");
        emp_id = sc.nextInt();
        System.out.println("Enter address: ");
        emp_addr = sc.next();
        System.out.println("Enter email: ");
        emp_email = sc.next();
        System.out.println("Enter Mobile number: ");
        emp_mno = sc.next();

    }

    void displayData() {
        System.out.println("Employee Id is: " + emp_id);
        System.out.println("Employee mobile number is: " + emp_mno);
        System.out.println("Employee name is: " + emp_name);
        System.out.println("Employee Id is: " + emp_email);
        System.out.println("Employee address is: " + emp_addr);
    }

    void displaySalaryDetails() {
        System.out.println("DA is: " + da);
        System.out.println("HRA is: " + hra);
        System.out.println("PF is: " + pf);
        System.out.println("Club fund is: " + club_fund);
        System.out.println("Gross is: " + gross);
        System.out.println("Net salary is: " + net);
    }

    void cal_sal(double basic_pay) {
        da = basic_pay * 0.97;
        hra = basic_pay * 0.1;
        pf = basic_pay * 0.12;
        club_fund = basic_pay * 0.001;
        gross = basic_pay + da + hra;
        net = gross - pf - club_fund;
    }

}

class programmer extends employee {
    void bp_pgm(employee a) {
        double basic_pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay of Programmer: ");
        basic_pay = sc.nextDouble();
        a.cal_sal(basic_pay);
        emp_type = "Programmer";
        a.displaySalaryDetails();
    }
}

class team_lead extends employee {
    void bp_tl(employee a) {
        double basic_pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay of Team lead: ");
        basic_pay = sc.nextDouble();
        a.cal_sal(basic_pay);
        emp_type = "Team lead";
        a.displaySalaryDetails();
    }
}

class as_pm extends employee {
    void bp_asPM(employee a) {
        double basic_pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay of Assistant Project Manager: ");
        basic_pay = sc.nextDouble();
        a.cal_sal(basic_pay);
        emp_type = "Assistant Project Manager";
        a.displaySalaryDetails();
    }
}

class project_manager extends employee {
    void bp_PM(employee a) {
        double basic_pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic pay of Project Manager: ");
        basic_pay = sc.nextDouble();
        a.cal_sal(basic_pay);
        emp_type = "Project Manager";
        a.displaySalaryDetails();
    }
}

class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        employee e1[] = new employee[n];
        for (int i = 0; i < n; i++) {
            employee e = new employee();
            e1[i] = e;
            e1[i].getData();
            int flag = 0;
            int ch = 0;
            while (flag == 0) {
                System.out.println("Enter the choice:");
                System.out.println("1. Programmer");
                System.out.println("2. Team lead");
                System.out.println("3. Assistant Project Manager");
                System.out.println("4. Project Manager");
                System.out.println("5. EXIT");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        programmer p = new programmer();
                        e1[i].displayData();
                        p.bp_pgm(e1[i]);
                        flag = 1;
                        break;

                    case 2:
                        team_lead tl = new team_lead();
                        tl.displayData();
                        tl.bp_tl(e1[i]);
                        flag = 1;
                        break;

                    case 3:
                        as_pm aspm = new as_pm();
                        aspm.displayData();
                        aspm.bp_asPM(e1[i]);
                        flag = 1;
                        break;

                    case 4:
                        project_manager pm = new project_manager();
                        pm.displayData();
                        pm.bp_PM(e1[i]);
                        flag = 1;
                        break;

                    case 5:
                        break;

                    default:
                        System.out.println("Invalid Option :");
                        break;
                }
            }
        }

    }
}
