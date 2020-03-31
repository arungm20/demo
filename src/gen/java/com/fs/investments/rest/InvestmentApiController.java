package com.fs.investments.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fs.investments.dao.InvestmentServiceDaoBean;
import com.fs.investments.model.Investment;
import com.fs.investments.model.InvestmentRequest;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-30T16:53:04.569+05:30")

@Controller
public class InvestmentApiController implements InvestmentApi {

    private static final Logger log = LoggerFactory.getLogger(InvestmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private InvestmentServiceDaoBean investmentServiceDaoBean;

    @org.springframework.beans.factory.annotation.Autowired
    public InvestmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createInvestment(@ApiParam(value = "Represents  investment entity" ,required=true )  @Valid @RequestBody InvestmentRequest investment) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteInvestment(@NotNull @ApiParam(value = "Represents  investment id to be retrieved", required = true) @Valid @RequestParam(value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> retrieveInvestment(@NotNull @ApiParam(value = "Represents  investment id to be retrieved", required = true) @Valid @RequestParam(value = "id", required = true) String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public String retrieveAllInvestment(Model model) {
        String accept = request.getHeader("Accept");
        List<Investment> investments = investmentServiceDaoBean.retrieveAllInvestments();
        model.addAttribute("investments", investments);
        return "list-investments";
    }

    public ResponseEntity<Void> updateInvestment(@NotNull @ApiParam(value = "Represents  investment id to be retrieved", required = true) @Valid @RequestParam(value = "id", required = true) String id,@ApiParam(value = "Represents  investment entity" ,required=true )  @Valid @RequestBody InvestmentRequest investment) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
