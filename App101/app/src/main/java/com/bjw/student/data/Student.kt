package com.bjw.student.data

// val stNum : String? = null 기본값이 없어도 객체를 만들어라

data class Student(
    val stNum : String? = null,
    val stName : String? = null,
    val stTel : String? = null,
    val stAddr : String? = null,
    val stDept : String? = null,
    val stGrade : Int? = null

)
