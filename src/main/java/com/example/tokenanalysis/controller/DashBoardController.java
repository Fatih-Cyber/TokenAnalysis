package com.example.tokenanalysis.controller;

import com.example.tokenanalysis.service.CsvService;
import com.example.tokenanalysis.service.GetTransactionsFromCsv;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    private final CsvService csvService;

    public DashBoardController(CsvService csvService) {
        this.csvService = csvService;
    }

    @GetMapping("/analysis/dashboard")
public String showDashboard(Model model){
        csvService.writeCsvToDb();
    model.addAttribute("transactions", GetTransactionsFromCsv.readTransactionsCsv("/Users/iceman/Downloads/TokenAnalysis-master/token.csv"));
    return "/analysis/dashboard";
}

}
