package com.formula1.academicinfo.service.teacher

import com.formula1.academicinfo.service.TeacherService
import com.formula1.academicinfo.service.TeacherServiceImpl
import org.aspectj.lang.annotation.Before
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class TestTeacherService(
    private val teacherService: TeacherService
) {
//
//    @BeforeAll
//    fun init(){
//
//    }
//
//    @Test
//    fun testProposeOptional(){
//        // good values for the test
//        val disciplineName = "Chimie"
//        val creditCount = 3
//        var username = "user3"
//
//        var result = this.teacherService.proposeOptional(disciplineName, creditCount, username);
//
//        assertEquals(result, "Optional added successfully!");
//
//
//        username = "ana"
//        result = this.teacherService.proposeOptional(disciplineName, creditCount, username);
//
//
//        assertEquals(result, "You don't have permission to propose optionals!");
//    }
}