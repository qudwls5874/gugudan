package com.example.demo.domain;

public class Gugudan {

    private String resultVaule;

    // 리턴 성공
    public Gugudan(int dan, int value){

        if (dan < 0) dan = 0;
        else if (dan > 100) dan = 100;

        if (value < 0) value = 0;
        else if (value > 100) value = 100;

        this.resultVaule = String.valueOf(dan * value);
    }

    // 유효성 검사 > 정수형변환 실패시
    public Gugudan(String falseValue){
        this.resultVaule = falseValue;
    }

    public String getResultVaule() { return resultVaule; }
    public void setResultVaule(String resultVaule) { this.resultVaule = resultVaule; }


}
