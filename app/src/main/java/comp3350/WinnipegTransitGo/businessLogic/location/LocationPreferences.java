package comp3350.WinnipegTransitGo.businessLogic.location;

import comp3350.WinnipegTransitGo.businessLogic.DatabaseService;
import comp3350.WinnipegTransitGo.persistence.database.Database;

/**
 * LocationPreferences class
 * Provides pass through to database, used by presentation layer
 *
 * @author Syed Habib
 * @version 1.0
 * @since 2017-06-7
 */

public class LocationPreferences {

    private Database database;

    public LocationPreferences()
    {
        database = DatabaseService.getDataAccess(Database.prefDatabase);
    }

    public int getTimeBetweenUpdates()
    {
        return database.getUpdateInterval();
    }

    public int getDistanceBetweenUpdates()
    {
        return database.getMinimumDistanceBetweenUpdates();
    }

    public double getDefaultLongitude()
    {
        return database.getDefaultLongitude();
    }

    public double getDefaultLatitude()
    {
        return database.getDefaultLatitude();
    }


}