package io.javabrains.coronavirustracker.controller;

import io.javabrains.coronavirustracker.models.LocationStat;
import io.javabrains.coronavirustracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping(path = "/")
    public String home(Model model){
        List<LocationStat> allstats = coronaVirusDataService.getAllstat();
        int totalCasesReported = allstats.stream().mapToInt(stat-> stat.getTotalStat()).sum();
        int totalNewCases = allstats.stream().mapToInt(stat->stat.getDiffPrevDay()).sum();
        model.addAttribute("locationStats",coronaVirusDataService.getAllstat());
        model.addAttribute("totalCasesReported",totalCasesReported);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
