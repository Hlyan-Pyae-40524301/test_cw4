package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    // Integration Testing for Countries Report by Population
    @Test
    void getAllCountryByPopulation()
    {
        Country cou = app.getCountry(2710);
        assertEquals(cou.Capital, "2710");
        assertEquals(cou.Code, "MMR");
        assertEquals(cou.Name, "Myanmar");
        assertEquals(cou.Continent, "Asia");
        assertEquals(cou.Region, "Southeast Asia");
        assertEquals(cou.Population, 45611000);
    }

    // Integration Testing for Countries In Continent Report by Population
    @Test
    void getAllCountryInContinentByPopulation()
    {
        Country cou = app.getCountry(1891);
        assertEquals(cou.Capital, "1891");
        assertEquals(cou.Code, "CHN");
        assertEquals(cou.Name, "China");
        assertEquals(cou.Continent, "Asia");
        assertEquals(cou.Region, "Eastern Asia");
        assertEquals(cou.Population, 1277558000);
    }

    // Integration Testing for Countries In Region Report by Population
    @Test
    void getAllCountryInRegionByPopulation()
    {
        Country cou = app.getCountry(211);
        assertEquals(cou.Capital, "211");
        assertEquals(cou.Code, "BRA");
        assertEquals(cou.Name, "Brazil");
        assertEquals(cou.Continent, "South America");
        assertEquals(cou.Region, "South America");
        assertEquals(cou.Population, 170115000);
    }

    // Integration Testing for Top Populated Countries Report by Population
    @Test
    void getTopPopulatedCountries()
    {
        Country cou = app.getCountry(1891);
        assertEquals(cou.Capital, "1891");
        assertEquals(cou.Code, "CHN");
        assertEquals(cou.Name, "China");
        assertEquals(cou.Continent, "Asia");
        assertEquals(cou.Region, "Eastern Asia");
        assertEquals(cou.Population, 1277558000);
    }

    // Integration Testing for Top Populated Countries In Continent Report by Population
    @Test
    void getTopPopulatedCountriesInContinent()
    {
        Country cou = app.getCountry(1891);
        assertEquals(cou.Capital, "1891");
        assertEquals(cou.Code, "CHN");
        assertEquals(cou.Name, "China");
        assertEquals(cou.Continent, "Asia");
        assertEquals(cou.Region, "Eastern Asia");
        assertEquals(cou.Population, 1277558000);
    }

    // Integration Testing for Top Populated Countries In Region Report by Population
    @Test
    void getTopPopulatedCountriesInRegion()
    {
        Country cou = app.getCountry(3813);
        assertEquals(cou.Capital, "3813");
        assertEquals(cou.Code, "USA");
        assertEquals(cou.Name, "United States");
        assertEquals(cou.Continent, "North America");
        assertEquals(cou.Region, "North America");
        assertEquals(cou.Population, 278357000);
    }

    // Integration Testing for Cities Report by Population
    @Test
    void getAllCitiesByPopulation()
    {
        City cit = app.getCity(1024);
        assertEquals(cit.ID, 1024);
        assertEquals(cit.Name, "Mumbai (Bombay)");
        assertEquals(cit.CountryCode, "IND");
        assertEquals(cit.District, "Maharashtra");
        assertEquals(cit.Population, 10500000);
    }

    // Integration Testing for Cities In Continent Report by Population
    @Test
    void getAllCitiesInContinentByPopulation()
    {
        City cit = app.getCity(1024);
        assertEquals(cit.ID, 1024);
        assertEquals(cit.Name, "Mumbai (Bombay)");
        assertEquals(cit.CountryCode, "IND");
        assertEquals(cit.District, "Maharashtra");
        assertEquals(cit.Population, 10500000);
    }

    // Integration Testing for Cities In Region Report by Population
    @Test
    void getAllCitiesInRegionByPopulation()
    {
        City cit = app.getCity(939);
        assertEquals(cit.ID, 939);
        assertEquals(cit.Name, "Jakarta");
        assertEquals(cit.CountryCode, "IDN");
        assertEquals(cit.District, "Jakarta Raya");
        assertEquals(cit.Population, 9604900);
    }

    //Testing for Cities In District Report by Population
    @Test
    void getAllCitiesInDistrictByPopulation()
    {
        City cit = app.getCity(2711);
        assertEquals(cit.ID, 2711);
        assertEquals(cit.Name, "Mandalay");
        assertEquals(cit.CountryCode, "MMR");
        assertEquals(cit.District, "Mandalay");
        assertEquals(cit.Population, 885300);
    }

    //Testing for Top Populated Cities Report by Population
    @Test
    void getTopPopulatedCities()
    {
        City cit = app.getCity(1024);
        assertEquals(cit.ID, 1024);
        assertEquals(cit.Name, "Mumbai (Bombay)");
        assertEquals(cit.CountryCode, "IND");
        assertEquals(cit.District, "Maharashtra");
        assertEquals(cit.Population, 10500000);
    }

    //Testing for Top Populated Cities In Continent Report by Population
    @Test
    void getTopPopulatedCitiesInContinent()
    {
        City cit = app.getCity(1024);
        assertEquals(cit.ID, 1024);
        assertEquals(cit.Name, "Mumbai (Bombay)");
        assertEquals(cit.CountryCode, "IND");
        assertEquals(cit.District, "Maharashtra");
        assertEquals(cit.Population, 10500000);
    }

    //Testing for Top Populated Cities In Region Report by Population
    @Test
    void getTopPopulatedCitiesInRegion()
    {
        City cit = app.getCity(939);
        assertEquals(cit.ID, 939);
        assertEquals(cit.Name, "Jakarta");
        assertEquals(cit.CountryCode, "IDN");
        assertEquals(cit.District, "Jakarta Raya");
        assertEquals(cit.Population, 9604900);
    }

    //Testing for Top Populated Cities In Country Report by Population
    @Test
    void getTopPopulatedCitiesInCountry()
    {
        City cit = app.getCity(2710);
        assertEquals(cit.ID, 2710);
        assertEquals(cit.Name, "Rangoon (Yangon)");
        assertEquals(cit.CountryCode, "MMR");
        assertEquals(cit.District, "Rangoon [Yangon]");
        assertEquals(cit.Population, 3361700);
    }

    //Testing for Top Populated Cities In District Report by Population
    @Test
    void getTopPopulatedCitiesInDistrict()
    {
        City cit = app.getCity(3793);
        assertEquals(cit.ID, 3793);
        assertEquals(cit.Name, "New York");
        assertEquals(cit.CountryCode, "USA");
        assertEquals(cit.District, "New York");
        assertEquals(cit.Population, 8008278);
    }
}