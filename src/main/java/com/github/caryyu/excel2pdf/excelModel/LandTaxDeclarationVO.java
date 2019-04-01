package com.github.caryyu.excel2pdf.excelModel;
import com.github.caryyu.excel2pdf.annotation.CellVal;

import java.math.BigDecimal;


public class LandTaxDeclarationVO {

    //纳税人识别号
    @CellVal(row = 2,col = 2)
    private String taxpayerID;

    //纳税所属期
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

    //1-3
   private BigDecimal oneThreeValue;
   //1-4
   private BigDecimal oneFourValue;

    //1-5
    @CellVal(row = 11,col = 9)
    private BigDecimal oneFiveValue;
    //1-6
    @CellVal(row = 11,col = 11)
    private String oneSixValue;
    //1-7
    @CellVal(row = 11,col = 13)
    private BigDecimal oneSevenValue;

//    //1-8
//    private String oneEightValue;

    //1-9
    @CellVal(row = 11,col = 17)
    private BigDecimal oneNineValue;
    //1-10
    @CellVal(row = 11,col = 19)
    private BigDecimal oneTenValue;
    //1-11
    @CellVal(row = 11,col = 21)
    private BigDecimal oneElevenValue;

    //2-1  主表格24数据合计
    @CellVal(row = 12,col = 3)
    private BigDecimal twoOneValue;
    //2-2
    @CellVal(row = 12,col = 4)
    private BigDecimal twoTwoValue;

    //2-3
    private BigDecimal twoThreeValue;
    //2-4
    private BigDecimal twoFourValue;

    //2-5
    @CellVal(row = 12,col = 9)
    private BigDecimal twoFiveValue;
    //2-6
    @CellVal(row = 12,col = 11)
    private String twoSixValue;
    //2-7
    @CellVal(row = 12,col = 13)
    private BigDecimal twoSevenValue;

//    //2-8
//    private String twoEightValue;

    //2-9
    @CellVal(row = 12,col = 17)
    private BigDecimal twoNineValue;
    //2-10
    @CellVal(row = 12,col = 19)
    private BigDecimal twoTenValue;
    //2-11
    @CellVal(row = 12,col = 21)
    private BigDecimal twoElevenValue;

    //3-1  主表格24数据合计
    @CellVal(row = 13,col = 3)
    private BigDecimal threeOneValue;
    //3-2
    @CellVal(row = 13,col = 4)
    private BigDecimal threeTwoValue;

   //3-3
   private BigDecimal threeThreeValue;
   //3-4
   private BigDecimal threeFourValue;

    //3-5
    @CellVal(row = 13,col = 9)
    private BigDecimal threeFiveValue;
    //3-6
    @CellVal(row =13,col = 11)
    private String threeSixValue;
    //3-7
    @CellVal(row = 13,col = 13)
    private BigDecimal threeSevenValue;

//    //3-8
//    private String threeEightValue;

    //3-9
    @CellVal(row = 13,col = 17)
    private BigDecimal threeNineValue;
    //3-10
    @CellVal(row = 13,col = 19)
    private BigDecimal threeTenValue;
    //3-11
    @CellVal(row = 13,col = 21)
    private BigDecimal threeElevenValue;

    //4-7 本期应纳税（费）额 合计
    @CellVal(row = 14,col = 13)
    private BigDecimal fourSevenValue;
    //4-9 减免额  合计
    @CellVal(row = 14,col = 17)
    private BigDecimal fourNineValue;
    //4-10 本期已缴税（费）额  合计
    @CellVal(row = 14,col = 19)
    private BigDecimal fourTenValue;
    //4-11 本期应补（退）税（费）额
    @CellVal(row = 14,col = 21)
    private BigDecimal fourElevenValue;


    public String getTaxpayerID() {
        return taxpayerID;
    }

    public void setTaxpayerID(String taxpayerID) {
        this.taxpayerID = taxpayerID;
    }

    public String getTaxPeriod() {
        return taxPeriod;
    }

    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public String getNewDate() {
        return newDate;
    }

    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }

    public String getAccountCodeName() {
        return accountCodeName;
    }

    public void setAccountCodeName(String accountCodeName) {
        this.accountCodeName = accountCodeName;
    }

    public BigDecimal getOneOneValue() {
        return oneOneValue;
    }

    public void setOneOneValue(BigDecimal oneOneValue) {
        this.oneOneValue = oneOneValue;
    }

    public BigDecimal getOneTwoValue() {
        return oneTwoValue;
    }

    public void setOneTwoValue(BigDecimal oneTwoValue) {
        this.oneTwoValue = oneTwoValue;
    }

    public BigDecimal getOneThreeValue() {
        return oneThreeValue;
    }

    public void setOneThreeValue(BigDecimal oneThreeValue) {
        this.oneThreeValue = oneThreeValue;
    }

    public BigDecimal getOneFourValue() {
        return oneFourValue;
    }

    public void setOneFourValue(BigDecimal oneFourValue) {
        this.oneFourValue = oneFourValue;
    }

    public BigDecimal getOneFiveValue() {
        return oneFiveValue;
    }

    public void setOneFiveValue(BigDecimal oneFiveValue) {
        this.oneFiveValue = oneFiveValue;
    }

    public String getOneSixValue() {
        return oneSixValue;
    }

    public void setOneSixValue(String oneSixValue) {
        this.oneSixValue = oneSixValue;
    }

    public BigDecimal getOneSevenValue() {
        return oneSevenValue;
    }

    public void setOneSevenValue(BigDecimal oneSevenValue) {
        this.oneSevenValue = oneSevenValue;
    }

    public BigDecimal getOneNineValue() {
        return oneNineValue;
    }

    public void setOneNineValue(BigDecimal oneNineValue) {
        this.oneNineValue = oneNineValue;
    }

    public BigDecimal getOneTenValue() {
        return oneTenValue;
    }

    public void setOneTenValue(BigDecimal oneTenValue) {
        this.oneTenValue = oneTenValue;
    }

    public BigDecimal getOneElevenValue() {
        return oneElevenValue;
    }

    public void setOneElevenValue(BigDecimal oneElevenValue) {
        this.oneElevenValue = oneElevenValue;
    }

    public BigDecimal getTwoOneValue() {
        return twoOneValue;
    }

    public void setTwoOneValue(BigDecimal twoOneValue) {
        this.twoOneValue = twoOneValue;
    }

    public BigDecimal getTwoTwoValue() {
        return twoTwoValue;
    }

    public void setTwoTwoValue(BigDecimal twoTwoValue) {
        this.twoTwoValue = twoTwoValue;
    }

    public BigDecimal getTwoThreeValue() {
        return twoThreeValue;
    }

    public void setTwoThreeValue(BigDecimal twoThreeValue) {
        this.twoThreeValue = twoThreeValue;
    }

    public BigDecimal getTwoFourValue() {
        return twoFourValue;
    }

    public void setTwoFourValue(BigDecimal twoFourValue) {
        this.twoFourValue = twoFourValue;
    }

    public BigDecimal getTwoFiveValue() {
        return twoFiveValue;
    }

    public void setTwoFiveValue(BigDecimal twoFiveValue) {
        this.twoFiveValue = twoFiveValue;
    }

    public String getTwoSixValue() {
        return twoSixValue;
    }

    public void setTwoSixValue(String twoSixValue) {
        this.twoSixValue = twoSixValue;
    }

    public BigDecimal getTwoSevenValue() {
        return twoSevenValue;
    }

    public void setTwoSevenValue(BigDecimal twoSevenValue) {
        this.twoSevenValue = twoSevenValue;
    }

    public BigDecimal getTwoNineValue() {
        return twoNineValue;
    }

    public void setTwoNineValue(BigDecimal twoNineValue) {
        this.twoNineValue = twoNineValue;
    }

    public BigDecimal getTwoTenValue() {
        return twoTenValue;
    }

    public void setTwoTenValue(BigDecimal twoTenValue) {
        this.twoTenValue = twoTenValue;
    }

    public BigDecimal getTwoElevenValue() {
        return twoElevenValue;
    }

    public void setTwoElevenValue(BigDecimal twoElevenValue) {
        this.twoElevenValue = twoElevenValue;
    }

    public BigDecimal getThreeOneValue() {
        return threeOneValue;
    }

    public void setThreeOneValue(BigDecimal threeOneValue) {
        this.threeOneValue = threeOneValue;
    }

    public BigDecimal getThreeTwoValue() {
        return threeTwoValue;
    }

    public void setThreeTwoValue(BigDecimal threeTwoValue) {
        this.threeTwoValue = threeTwoValue;
    }

    public BigDecimal getThreeThreeValue() {
        return threeThreeValue;
    }

    public void setThreeThreeValue(BigDecimal threeThreeValue) {
        this.threeThreeValue = threeThreeValue;
    }

    public BigDecimal getThreeFourValue() {
        return threeFourValue;
    }

    public void setThreeFourValue(BigDecimal threeFourValue) {
        this.threeFourValue = threeFourValue;
    }

    public BigDecimal getThreeFiveValue() {
        return threeFiveValue;
    }

    public void setThreeFiveValue(BigDecimal threeFiveValue) {
        this.threeFiveValue = threeFiveValue;
    }

    public String getThreeSixValue() {
        return threeSixValue;
    }

    public void setThreeSixValue(String threeSixValue) {
        this.threeSixValue = threeSixValue;
    }

    public BigDecimal getThreeSevenValue() {
        return threeSevenValue;
    }

    public void setThreeSevenValue(BigDecimal threeSevenValue) {
        this.threeSevenValue = threeSevenValue;
    }

    public BigDecimal getThreeNineValue() {
        return threeNineValue;
    }

    public void setThreeNineValue(BigDecimal threeNineValue) {
        this.threeNineValue = threeNineValue;
    }

    public BigDecimal getThreeTenValue() {
        return threeTenValue;
    }

    public void setThreeTenValue(BigDecimal threeTenValue) {
        this.threeTenValue = threeTenValue;
    }

    public BigDecimal getThreeElevenValue() {
        return threeElevenValue;
    }

    public void setThreeElevenValue(BigDecimal threeElevenValue) {
        this.threeElevenValue = threeElevenValue;
    }

    public BigDecimal getFourSevenValue() {
        return fourSevenValue;
    }

    public void setFourSevenValue(BigDecimal fourSevenValue) {
        this.fourSevenValue = fourSevenValue;
    }

    public BigDecimal getFourNineValue() {
        return fourNineValue;
    }

    public void setFourNineValue(BigDecimal fourNineValue) {
        this.fourNineValue = fourNineValue;
    }

    public BigDecimal getFourTenValue() {
        return fourTenValue;
    }

    public void setFourTenValue(BigDecimal fourTenValue) {
        this.fourTenValue = fourTenValue;
    }

    public BigDecimal getFourElevenValue() {
        return fourElevenValue;
    }

    public void setFourElevenValue(BigDecimal fourElevenValue) {
        this.fourElevenValue = fourElevenValue;
    }
}
