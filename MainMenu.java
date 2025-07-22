
import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    HospitalManagementSystem hms;

    public MainMenu(HospitalManagementSystem hms) {
        this.hms = hms;
        setTitle("Hospital Management System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton addPatientBtn = new JButton("Add Patient");
        addPatientBtn.setBounds(100, 30, 200, 30);
        add(addPatientBtn);

        JButton addDoctorBtn = new JButton("Add Doctor");
        addDoctorBtn.setBounds(100, 70, 200, 30);
        add(addDoctorBtn);

        JButton viewPatientsBtn = new JButton("View Patients");
        viewPatientsBtn.setBounds(100, 110, 200, 30);
        add(viewPatientsBtn);

        JButton viewDoctorsBtn = new JButton("View Doctors");
        viewDoctorsBtn.setBounds(100, 150, 200, 30);
        add(viewDoctorsBtn);

        addPatientBtn.addActionListener(e -> new PatientForm(hms));
        addDoctorBtn.addActionListener(e -> new DoctorForm(hms));
        viewPatientsBtn.addActionListener(e -> {
            hms.displayPatients();
        });
        viewDoctorsBtn.addActionListener(e -> {
            hms.displayDoctors();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();
        new MainMenu(hms);
    }
}
