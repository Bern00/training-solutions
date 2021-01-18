package defaultconstructor.simpledateformatter;

import defaultconstructor.simpledate.SimpleDate;

public class SimpleDateFormatter {

    private CountryCode countryCode;


    public SimpleDateFormatter() {
        this.countryCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
            return formatDateStringByCountryCode(countryCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {

        if(countryCode == CountryCode.HU) {
            return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
        } else if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
        } else {
            return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
        }

    }
}
