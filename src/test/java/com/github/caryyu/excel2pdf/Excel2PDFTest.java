package com.github.caryyu.excel2pdf;
import java.io.*;
import java.util.*;

import com.github.caryyu.excel2pdf.excelModel.LandTaxDeclarationVO;
import com.itextpdf.text.RectangleReadOnly;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.*;

public class Excel2PDFTest {
    static String resourcesDir = "src/test/resources";
    static String outputDir = "target/output";

    @Before
    public void setUp() throws Exception {
        File output = new File(outputDir);
        output.mkdir();
    }


    public static void main(String[] args) throws Exception {
        //定义要写入到excel模版上的值
        LandTaxDeclarationVO landTaxDeclarationVO =new LandTaxDeclarationVO();
        landTaxDeclarationVO.setTaxpayerID("test12345");
        landTaxDeclarationVO.setTaxPeriod("2018-10-10");

        //如果要在一个pdf上展示多个sheet页面
        Map<Object, String> voAndSheetName2 = new HashMap<>();
        voAndSheetName2.put(landTaxDeclarationVO, "Sheet1");

        String templateUrl2 = resourcesDir+"/"+"dishuitest.xls";

        //将模版和要写入模版的值传入，转换成workbook
        Workbook workbook = ExcelConvertPDF.outPutWorkbookByModel(voAndSheetName2, templateUrl2);
        List<Workbook> workbooks = new ArrayList<>();
        workbooks.add(workbook);
        //设置导出的页面的大小
        RectangleReadOnly pageSize = new RectangleReadOnly(1000.0F, 850.0F);
        //定义输出流 也可以支持web的httpRespone
        String pathOfPdf = resourcesDir +"/"+ "test1.pdf";
        FileOutputStream fos = new FileOutputStream(pathOfPdf);
        ExcelConvertPDF.ExcelConvertPDF(workbooks, fos, pageSize);
    }
}