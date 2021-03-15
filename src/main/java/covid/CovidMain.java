package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CovidMain {


    CSVReader csvReader = new CSVReader();

    public List<Citizen> getCitizenFromCSV (String path) {
        List<Citizen> citizens = new ArrayList<>();
        List<String> lines = csvReader.readCSV(path);
        String[] line;
        for(String l: lines) {
            line = l.split(";");
            if(line.length == 5) {
                citizens.add(new Citizen(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), line[3], line[4]));
            }
        }
        return citizens;
    }

    public static void main(String[] args) {

        CovidMain covidMain = new CovidMain();
        MariaDbDataSource dataSource;


        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        } catch (
                SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
/*
        SettlementDao settlementDao = new SettlementDao(dataSource);
        String city = settlementDao.findSettlementByPostalCode(2016);
        System.out.println(city);

        citizenDao.insertCitizen(new Citizen("Aron", 6025, 52, "aron@gmail.com", "888555222"));
        citizenDao.insertCitizens(covidMain.getCitizenFromCSV("/books.csv"));
        VaccinationsDao vaccinationsDao = new VaccinationsDao(dataSource, citizenDao);
        System.out.println(vaccinationsDao.findVaccinations());
        vaccinationsDao.insertVaccinations(new Vaccinations(30, 21, Date.valueOf("2015-03-31"), "no", "nincsen", "pfizer"));
        vaccinationsDao.updateVaccinations(21);
        vaccinationsDao.deleteVaccinations(new Vaccinations(30, 21, Date.valueOf("2015-03-31"), "no", "nincsen", "pfizer"));
*/

        CitizenDao citizenDao = new CitizenDao(dataSource);
        VaccinationsDao vaccinationsDao = new VaccinationsDao(dataSource, citizenDao);
        vaccinationsDao.findVaccinations();


    }
}
