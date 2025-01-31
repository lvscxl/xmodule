package com.penglecode.xmodule.master4j.spring.common.model;

/**
 * 国家气象接口数据报文
 * http://www.weather.com.cn/data/cityinfo/101010100.html
 *
 * @author pengpeng
 * @version 1.0
 * @date 2020/9/19 1:08
 */
public class WeatherInfo {

    private String cityid;

    private String city;

    private String temp1;

    private String temp2;

    private String weather;

    private String img1;

    private String img2;

    private String ptime;

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "cityid='" + cityid + '\'' +
                ", city='" + city + '\'' +
                ", temp1='" + temp1 + '\'' +
                ", temp2='" + temp2 + '\'' +
                ", weather='" + weather + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", ptime='" + ptime + '\'' +
                '}';
    }
}
