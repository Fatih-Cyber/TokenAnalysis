package com.example.tokenanalysis.controller;

import com.example.tokenanalysis.service.GetTransactionsFromCsv;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {
    @GetMapping("/dashboard")
public String showDashboard(Model model){
    model.addAttribute("transactions", GetTransactionsFromCsv.readTransactionsCsv("/Users/faith/Documents/token.csv"));
    return "/dashboard";
}

}
