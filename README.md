根据任意excel模版，将任意值填入到模版里面，然后生成pdf。（纯java实现）
支持多sheet页

举个例子：
excel模版如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401235648479.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIwMDA5MDE1,size_16,color_FFFFFF,t_70)

然后假如这里要将纳税人识号和税款所属期这个两个单元格的值写入我们想要的值	
```
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
        //纳税人识别号
        landTaxDeclarationVO.setTaxpayerID("test12345");
        //税款所属期
        landTaxDeclarationVO.setTaxPeriod("2018-10-10");

        //如果要在一个pdf上展示多个sheet页面,就将多个sheet页对应的VO对象传入进去
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

```
这样我将模版放到了resource目录下
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019040200003562.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIwMDA5MDE1,size_16,color_FFFFFF,t_70)
	
运行结果：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190402000057401.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019040200012459.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIwMDA5MDE1,size_16,color_FFFFFF,t_70)


在excel模版里面写入数据，需要要定一个VO对象，在那个VO对象里面，定义自己的数据和坐标，写了个注解 这样就很方便了。 注解里面写坐标（行和列） 然后字段里面填自己要的值

```
public class LandTaxDeclarationVO {

    //纳税人识别号  第二行第二列
    @CellVal(row = 2,col = 2)
    private String taxpayerID;

    //纳税所属期 第三行 第二列
    @CellVal(row=3,col=2)
    private String taxPeriod;

    //填表日期
    @CellVal(row = 3,col = 8)
    private String newDate;

    //账套名称
    @CellVal(row = 4,col = 7)
    private String accountCodeName;

    //1-1  主表格24数据合计24-1
    @CellVal(row = 11,col = 3)
    private BigDecimal oneOneValue;
    //1-2
    @CellVal(row = 11,col = 4)
    private BigDecimal oneTwoValue;
.....
}

```



项目地址  https://github.com/xiaoxinglai/excel2pdf  ([源码下载](https://github.com/xiaoxinglai/excel2pdf))
项目结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019040200085717.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzIwMDA5MDE1,size_16,color_FFFFFF,t_70)

这个是整合了原作者的excel2pdf项目和另一个easyexcel项目而来，修复原作者的一些bug和poi版本冲突。 基于时间，做的有些粗糙，但也勉强够用了，有兴趣的同学可以自己去补充一些功能

这个目前只支持xls模版。 

如果要做web项目里面的pdf导出，需要将返回流换成httprespone 
其次就是 模版文件，放到resource目录下之后，需要web层，在maven的pom.xml里面加一个过滤条件，以免在打包的时候把模版打包进去破坏

```
	<plugin>
				<artifactId>maven-war-plugin</artifactId>
				<configuration>
					<warSourceDirectory>${basedir}/src/main/webapp</warSourceDirectory>
					<nonFilteredFileExtensions>
						<nonFilteredFileExtension>xls</nonFilteredFileExtension>
						<nonFilteredFileExtension>xlsx</nonFilteredFileExtension>
					</nonFilteredFileExtensions>
				</configuration>
			</plugin>

<plugin>
			<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-resources-plugin</artifactId>
				<version>2.6</version>
				<configuration>
					<encoding>${project.encoding}</encoding>
					<nonFilteredFileExtensions>
						<!--//xlsx结尾的文件不-->
						<nonFilteredFileExtension>xlsx</nonFilteredFileExtension>
						<nonFilteredFileExtension>xls</nonFilteredFileExtension>
					</nonFilteredFileExtensions>
				</configuration>
			</plugin>
```