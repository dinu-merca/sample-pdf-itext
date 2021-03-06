package com.dm.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class CreateEmptyDocument {

	public static void main(String[] args) throws Exception {
		
		String outputFileName = "c:\\work\\temp\\empty.pdf";
		PdfWriter pdfWriter = new PdfWriter(outputFileName);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);

		pdfDocument.addNewPage();

		Document document = new Document(pdfDocument);
		document.close();
		
		System.out.println("PDF Created");

	}

}
