/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nisal.array.dao;

import com.nisal.array.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Nishchal
 */
public interface StudentDAO {
    void add(Student s);
    boolean delete(int id);
    ArrayList<Student> showall();
    boolean searchbyid(int id);
    ArrayList<Student> searchbyany();
    
    
    
    
}
