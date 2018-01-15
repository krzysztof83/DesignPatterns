package hometheater;

/**
 * Created by Professional on 2018-01-14.
 */
public interface HomeTheaterInterface {

    public void watchMovie(String movie);

    public void endMovie();

    public void listenToCd(String cdTitle);

    public void endCd();

    public void listenToRadio(double frequency);

    public void endRadio();
}
