package com.kite.mvc.domain;

import org.springframework.web.multipart.MultipartFile;

public class Report {

	private String sno;
	private MultipartFile report;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public MultipartFile getReport() {
		return report;
	}

	public void setReport(MultipartFile report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "Report [sno=" + sno + ", report=" + report + "]";
	}

}
