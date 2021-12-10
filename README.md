# How to create PDF files using Apache iText libraries

A set of examples on how to use [Apache iText Library](https://itextpdf.com/en) to create PDF files

## Example 1 - Creating an Empty PDF Document

[CreateEmptyDocument](https://github.com/dinu-merca/sample-pdf-itext/blob/main/src/com/dm/pdf/CreateEmptyDocument.java)

The main class to work with documents in iText is the **Document** class. To instantiate a Document class you will need to pass
in a PdfDocument object in it's constructor.  
[Document](https://api.itextpdf.com/iText7/java/7.0.2/com/itextpdf/layout/Document.html) is the default root element when
creating a self-sufficient PDF. It mainly operates high-level operations e.g. setting page size and rotation, adding elements,
and writing text at specific coordinates. It has no knowledge of the actual PDF concepts and syntax.


