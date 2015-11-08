/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action.bean;

import java.util.List;

/**
 *
 * @author superman90
 */
public class Page<T> {
    
    private List<T> records;
    private int currentPageNum;
    private static final int PAGESIZE =10;

    
    private int totalPageNum;
    
    private int prePageNum;
    private int nextPageNum;
    
    private int startIndex;
    private int endIndex;

    
    private int totalRecords;
    
    private int startPage;
    private int endPage;
    
    private String url;
    
    
    public Page(int currentPageNum, int totalRecords){
        
        this.currentPageNum=currentPageNum;
        this.totalRecords=totalRecords;
        
        totalPageNum=totalRecords%PAGESIZE==0?totalRecords/PAGESIZE:(totalRecords/PAGESIZE+1);
        startIndex=(currentPageNum-1)*PAGESIZE;
        
        if(totalPageNum>9){
        
            startPage=currentPageNum-4;
            endPage=currentPageNum+4;
            
            if (startPage<1){
                startPage=1;
                endPage=9;
            }
            
            if (endPage>totalPageNum){
                endPage=totalPageNum;
                startPage=endPage-8;
            }
            
        }else{
            startPage=1;
            endPage= totalPageNum;
        }
    }
    
    public int getEndIndex() {
        endIndex= startIndex+PAGESIZE;
        if (endIndex>totalRecords){
            endIndex=totalRecords;
        }
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
    
    public static int getPAGESIZE() {
        return PAGESIZE;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public void setCurrentPageNum(int currentPageNum) {
        this.currentPageNum = currentPageNum;
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public int getPrePageNum() {
        this.prePageNum=currentPageNum-1;
        if (prePageNum<1){
            prePageNum=1;
        }
        return prePageNum;
    }

    public void setPrePageNum(int prePageNum) {
        this.prePageNum = prePageNum;
    }

    public int getNextPageNum() {
        this.nextPageNum=currentPageNum+1;
        if (nextPageNum>totalPageNum){
            this.nextPageNum=totalPageNum;
        }
        return nextPageNum;
    }

    public void setNextPageNum(int nextPageNumb) {
        this.nextPageNum = nextPageNumb;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
