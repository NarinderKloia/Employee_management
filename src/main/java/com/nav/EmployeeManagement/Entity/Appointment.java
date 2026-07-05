// package com.nav.EmployeeManagement.Entity;

// import java.time.LocalDateTime;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @Table(name = "Appointment")
// @NoArgsConstructor
// @AllArgsConstructor
// public class Appointment {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false)
//     private LocalDateTime appointmenTime;

//     @Column(length = 500)
//     private String reason;

//     @ManyToOne
//     @JoinColumn(name = "Emp_id", nullable = false) //Emp is requried and not nullable
//     private Employee employee;


// }
