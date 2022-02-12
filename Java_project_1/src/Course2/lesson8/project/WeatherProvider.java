package Course2.lesson8.project;

import Course2.lesson7.project.enums.Periods;
import Course2.lesson8.project.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
