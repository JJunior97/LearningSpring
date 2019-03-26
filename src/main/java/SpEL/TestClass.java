package SpEL;

import SpEL.Klasy.City;

import java.util.List;

public class TestClass {
    private String homePath;
    private List<City> bigCities;
    private String subString;
    private City firstBigCity;
    private City lastBigCity;
    private List<String> cityNames;
    private List<String> cityNamesStates;
    private List<String> bigCityNamesStates;
    private List<String> TX_Cities;
    private List<String> SmallBigCities;
    private List<Integer> cityPopulations;

    public String getHomePath() {
        return homePath;
    }

    public void setHomePath(String homePath) {
        this.homePath = homePath;
    }

    public List<City> getBigCities() {
        return bigCities;
    }

    public void setBigCities(List<City> bigCities) {
        this.bigCities = bigCities;
    }

    public String getSubString() {
        return subString;
    }

    public void setSubString(String subString) {
        this.subString = subString;
    }

    public City getFirstBigCity() {
        return firstBigCity;
    }

    public City getLastBigCity() {
        return lastBigCity;
    }

    public void setLastBigCity(City lastBigCity) {
        this.lastBigCity = lastBigCity;
    }

    public void setFirstBigCity(City firstBigCity) {
        this.firstBigCity = firstBigCity;
    }

    public List<String> getCityNames() {
        return cityNames;
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }

    public List<String> getCityNamesStates() {
        return cityNamesStates;
    }

    public void setCityNamesStates(List<String> cityNamesStates) {
        this.cityNamesStates = cityNamesStates;
    }

    public List<String> getBigCityNamesStates() {
        return bigCityNamesStates;
    }

    public void setBigCityNamesStates(List<String> bigCityNamesStates) {
        this.bigCityNamesStates = bigCityNamesStates;
    }

    public List<String> getTX_Cities() {
        return TX_Cities;
    }

    public void setTX_Cities(List<String> TX_Cities) {
        this.TX_Cities = TX_Cities;
    }

    public List<String> getSmallBigCities() {
        return SmallBigCities;
    }

    public void setSmallBigCities(List<String> smallBigCities) {
        SmallBigCities = smallBigCities;
    }

    public List<Integer> getCityPopulations() {
        return cityPopulations;
    }

    public void setCityPopulations(List<Integer> cityPopulations) {
        this.cityPopulations = cityPopulations;
    }
}
