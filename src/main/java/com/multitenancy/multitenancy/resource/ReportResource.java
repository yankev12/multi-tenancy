package com.multitenancy.multitenancy.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.multitenancy.multitenancy.model.Report;
import com.multitenancy.multitenancy.repository.ReportRepository;
import org.springframework.web.bind.annotation.RequestMapping;;


@RestController
@RequestMapping("/reports")
public class ReportResource {

	@Autowired
	private ReportRepository reportRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Report> findAll() {
		return reportRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Report save(@RequestBody Report report) {
		return reportRepository.save(report);
	}
	
}
