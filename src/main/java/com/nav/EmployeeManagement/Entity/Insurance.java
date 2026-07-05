// package com.nav.EmployeeManagement.Entity;

// import org.hibernate.annotations.CreationTimestamp;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @Table(name = "Insurance")
// @NoArgsConstructor
// @AllArgsConstructor
// public class Insurance {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(name = "policyNumber", nullable = false)
//     private String Policy;

//     @Column(name = "Provider", nullable = false)
//     private String Provider;

//     @Column(nullable = false)
//     private String ValidationDate;

//     @CreationTimestamp
//     @Column(nullable = false)
//     private String CreationDate;

//     @OneToOne(mappedBy = "insurance") //inverse side
//     private Employee employee;
// }
