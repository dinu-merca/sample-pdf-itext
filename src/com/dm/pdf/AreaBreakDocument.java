package com.dm.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;

public class AreaBreakDocument {

	public static void main(String[] args) throws Exception {
		
		String outputFileName = "c:\\work\\temp\\area-break-doc.pdf";
		PdfWriter pdfWriter = new PdfWriter(outputFileName);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
		Document document = new Document(pdfDocument);
		
		AreaBreak areaBreak = new AreaBreak();
		document.add(areaBreak);
		
		document.close();
		System.out.println("PDF Created");

	}

}
