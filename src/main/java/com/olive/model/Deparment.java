package com.olive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@Table(name="dept_tab")
@AllArgsConstructor
@RequiredArgsConstructor
public class Deparment {
@Id
@Column(name="d_id")
private Integer deptId;
private String deptCode;
private String  deptAdmin;
}
