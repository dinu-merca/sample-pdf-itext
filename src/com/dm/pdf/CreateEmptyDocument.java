package com.dm.pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class CreateEmptyDocument {

	public static void main(String[] args) throws Exception {
		
		String dest = "c:\\work\\temp\\empty.pdf";
		PdfWriter writer = new PdfWriter(dest);
		PdfDocument pdfDoc = new PdfDocument(writer);
		pdfDoc.addNewPage();
		Document document = new Document(pdfDoc);
		document.close();
		System.out.println("PDF Created");

	}

}
