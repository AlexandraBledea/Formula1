package com.formula1.academicinfo.controller

import com.formula1.academicinfo.dtos.UpdateDTO
import com.formula1.academicinfo.security.jwtutils.TokenManager
import com.formula1.academicinfo.service.CurriculumService
import com.formula1.academicinfo.service.UserService
import com.formula1.academicinfo.service.YearsOfStudyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController(
    private val userService: UserService,
    private val tokenManager: TokenManager,
    private val yearsService: YearsOfStudyService,
    private val curriculumService: CurriculumService
) {

    @PutMapping("update")
    fun update(@RequestHeader("Authorization") token : String, @RequestBody updateDTO: UpdateDTO): ResponseEntity<Any> {
        val username = tokenManager.getUsernameFromToken(token.substring(7))
        return ResponseEntity.ok(userService.update(updateDTO.email, updateDTO.phone, username))
    }

    @GetMapping("getUser")
    fun getUser(@RequestHeader("Authorization") token: String): ResponseEntity<Any> {
        val username = tokenManager.getUsernameFromToken(token.substring(7))
        return ResponseEntity.ok(userService.loadUserByUsername(username))
    }

    @GetMapping("getYears")
    fun getYears(@RequestHeader("Authorization") token: String): ResponseEntity<Any> {
        val username = tokenManager.getUsernameFromToken(token.substring(7))
        return ResponseEntity.ok(yearsService.getYearsOfStudyByUsername(username))
    }

    @GetMapping("getCurriculum/{curriculumId}")
    fun getCurriculum(@RequestHeader("Authorization") token: String, @PathVariable("curriculumId") curriculumId: Int): ResponseEntity<Any> {
        val username = tokenManager.getUsernameFromToken(token.substring(7))
        return ResponseEntity.ok(curriculumService.getDisciplinesByCurriculumId(curriculumId))
    }
}