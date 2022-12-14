package com.nseit.DoctorAppointmentBookingSpringBootAPI.controller;

import com.nseit.DoctorAppointmentBookingSpringBootAPI.model.AuthUser;
import com.nseit.DoctorAppointmentBookingSpringBootAPI.response.APIResponse;
import com.nseit.DoctorAppointmentBookingSpringBootAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000/", maxAge = 3600)
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private APIResponse apiResponse;

}


