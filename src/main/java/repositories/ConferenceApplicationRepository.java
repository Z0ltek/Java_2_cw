package repositories;
import domain.ConferenceApplication;

/**
 * Created by Szymon on 2017-03-28.
 */
public interface ConferenceApplicationRepository {

    ConferenceApplication getApplicationByEmailAddress( String email);
    void add(ConferenceApplication application);
    int count();
}
