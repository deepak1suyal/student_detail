package com.student.college.dow;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class student {
@Id
@GeneratedValue(strategy =
GenerationType.IDENTITY)
   private int id;
   private String Name;
   private String Address;
}
