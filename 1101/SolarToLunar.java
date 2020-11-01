package com.example.administrator.htmlparsertest;

public class SolarToLunar {

    String solar;
    String lunar;
    String ganji;

    public String getSolar() {
        return solar;
    }
    public void setSolar(String solar) {
        this.solar = solar;
    }
    public String getLunar() {
        return lunar;
    }
    public void setLunar(String lunar) {
        this.lunar = lunar;
    }
    public String getGanji() {
        return ganji;
    }
    public void setGanji(String ganji) {
        this.ganji = ganji;
    }

    @Override
    public String toString() {
        return "Solar2Lunar{" + "solar='" + solar + '\'' + ", lunar='" + lunar + '\'' +
                ", ganji='" + ganji + '\'' + '}';
    }

//  필요한 메소드를 추가한다.
//  양력 년도를 얻어내는 메소드
    public int getYear() {
//      split("구분자") : 인수로 주어진 구분자 문자열을 기준으로 문자열을 분리한다.
//      양력 날짜를 "-"를 기준으로 분리해서 str 배열에 저장한다.
//      str[0] : 년, str[1] : 월, str[2] : 일, 요일
        String[] str = getSolar().split("-");
        return Integer.parseInt(str[0]);
    }

//  양력 월을 얻어내는 메소드
    public int getMonth() {
        String[] str = getSolar().split("-");
        return Integer.parseInt(str[1]);
    }

//  양력 일을 얻어내는 메소드
    public int getDate() {
        String[] str = getSolar().split("-");
//      split() 메소드로 양력 날짜를 분리하면 str[2]에는 "01 (화)" 형태로 저장된다.
//      날짜만 리턴시켜야 하므로 str[2]를 다시 공백으로 분리해서 앞의 값만 리턴시킨다.
        return Integer.parseInt(str[2].split(" ")[0]);
    }

//  양력 요일을 얻어내는 메소드
    public String getWeek() {
        String[] str = getSolar().split("-");
//      요일만 리턴시켜야 하므로 str[2]를 다시 공백으로 분리해서 뒤의 값만 리턴시킨다.
        return str[2].split(" ")[1].substring(1, 2);
    }

//  =============================================================================================

//  음력 년도를 얻어내는 메소드
    public int getLYear() {
        String[] str = getLunar().split("-");
        return Integer.parseInt(str[0]);
    }

//  음력 월을 얻어내는 메소드
    public int getLMonth() {
        String[] str = getLunar().split("-");
        return Integer.parseInt(str[1]);
    }

//  음력 일을 얻어내는 메소드
    public String getLDate() {
        String[] str = getLunar().split("-");
        String s[] = str[2].split(" ");
        if(s.length == 1) {
            return s[0];
        } else {
            return s[0] + s[1];
        }
    }

//  =============================================================================================

//  음력 년도 간지(세차)를 얻어내는 메소드
    public String getGYear() {
//      양력 간지를 공백를 기준으로 분리해서 str 배열에 저장한다.
        String[] str = getGanji().split(" ");
        return str[0].substring(0, str[0].length() - 1);
    }

//  음력 월 간지(월건)를 얻어내는 메소드, 윤달은 월건이 없다.
    public String getGMonth() {
        String[] str = getGanji().split(" ");
        if(str.length == 2) {
            return "";
        } else {
            return str[1].substring(0, str[1].length() - 1);
        }
    }

//  음력 일 간지(일진)를 얻어내는 메소드
    public String getGDate() {
        String[] str = getGanji().split(" ");
        if(str.length == 2) {
            return str[1].substring(0, str[1].length() - 1);
        } else {
            return str[2].substring(0, str[2].length() - 1);
        }
    }
}













