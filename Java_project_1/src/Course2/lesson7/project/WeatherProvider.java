package Course2.lesson7.project;

import Course2.lesson7.project.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
